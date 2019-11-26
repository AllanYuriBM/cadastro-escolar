package com.darksiders.hbsis.service;

import com.darksiders.hbsis.dto.ProfessorDTO;
import com.darksiders.hbsis.exception.CadastroException;
import org.springframework.stereotype.Service;

@Service
public class ProfessorService {

    public ProfessorDTO cadastrarProfessor(ProfessorDTO professorDTO) throws CadastroException {
        //TODO cadastrar professor utilizando o ProfessorRepository.

        return professorDTO;
    }
}
