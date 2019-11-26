package com.darksiders.hbsis.professor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Response;


@RestController
@RequestMapping(value = "/professor")
public class ProfessorController {

    private ProfessorService professorService;

    @Autowired
    private ProfessorController(ProfessorService alunoService) {
        this.professorService = professorService;
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<String> cadastrarProfessro(ProfessorDTO professorDTO) {
        try {
            String mensagem = professorService.cadastrarProfessor(professorDTO);
            return new ResponseEntity<>(mensagem, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Erro interno ao cadastrar professor! Tente novamente.", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
