package com.darksiders.hbsis.controller;

import com.darksiders.hbsis.dto.AlunoDTO;
import com.darksiders.hbsis.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/aluno")
public class AlunoController {

    private AlunoService alunoService;

    @Autowired
    private AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<String> cadastrarAluno(AlunoDTO alunoDTO) {
        try {
            String mensagem = alunoService.cadastrarAluno(alunoDTO);
            return new ResponseEntity<>(mensagem, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Erro interno ao cadastrar aluno! Tente novamente.", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
