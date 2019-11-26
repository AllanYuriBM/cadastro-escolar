package com.darksiders.hbsis.controller;

import com.darksiders.hbsis.dto.AlunoDTO;
import com.darksiders.hbsis.exception.CadastroException;
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
    public ResponseEntity<AlunoDTO> cadastrarAluno(AlunoDTO alunoDTO) throws CadastroException {
        return new ResponseEntity<AlunoDTO>(alunoService.cadastrarAluno(alunoDTO), HttpStatus.OK);
    }
}
