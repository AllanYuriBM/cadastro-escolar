package com.darksiders.hbsis.service;

import com.darksiders.hbsis.dto.AlunoDTO;
import com.darksiders.hbsis.exception.CadastroException;
import org.springframework.stereotype.Service;

@Service
public class AlunoService {

    public AlunoDTO cadastrarAluno(AlunoDTO alunoDTO) throws CadastroException {
        //TODO cadastrar aluno utilizando o AlunoRepository.

        return alunoDTO;
    }
}
