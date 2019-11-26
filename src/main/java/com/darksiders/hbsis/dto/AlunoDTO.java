package com.darksiders.hbsis.dto;

import com.darksiders.hbsis.model.Turma;
import lombok.*;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AlunoDTO {

    private Integer id;
    private String nome;
    private Integer matricula;
    private Turma turma;

}
