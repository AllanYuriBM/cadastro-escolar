package com.darksiders.hbsis.aluno;

import com.darksiders.hbsis.turma.Turma;
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
