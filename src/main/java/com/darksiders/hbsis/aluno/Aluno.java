package com.darksiders.hbsis.aluno;

import com.darksiders.hbsis.boletim.Boletim;
import com.darksiders.hbsis.turma.Turma;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor

@Table(name= "aluno")
@Entity
public class Aluno {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "matricula")
    private Integer matricula;

    @ManyToOne(targetEntity = Turma.class, cascade = { CascadeType.MERGE, CascadeType.PERSIST }, fetch = FetchType.LAZY)
    @JoinColumn(name = "turma_id", referencedColumnName = "id")
    private Turma turma;

    @OneToMany(targetEntity = Boletim.class, mappedBy = "aluno", fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    private List<Boletim> boletins;

}
