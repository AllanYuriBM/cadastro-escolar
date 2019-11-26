package com.darksiders.hbsis.controller;

import com.darksiders.hbsis.dto.ProfessorDTO;
import com.darksiders.hbsis.exception.CadastroException;
import com.darksiders.hbsis.model.Professor;
import com.darksiders.hbsis.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/professor")
public class ProfessorController {

    private ProfessorService professorService;

    @Autowired
    private ProfessorController(ProfessorService alunoService) {
        this.professorService = professorService;
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<ProfessorDTO> cadastrarProfessor(ProfessorDTO professorDTO) throws CadastroException {
        return new ResponseEntity<ProfessorDTO>(professorService.cadastrarProfessor(professorDTO), HttpStatus.OK);
    }

}
