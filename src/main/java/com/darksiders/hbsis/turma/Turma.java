package com.darksiders.hbsis.turma;

import com.darksiders.hbsis.aluno.Aluno;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor

@Table(name= "turma")
@Entity
public class Turma {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;

    @Column(name = "nome")
    private String nome;

    @OneToMany(targetEntity = Aluno.class, mappedBy = "turma", fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    private List<Aluno> alunos;

}
