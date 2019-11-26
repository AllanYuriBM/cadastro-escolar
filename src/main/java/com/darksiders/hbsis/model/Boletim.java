package com.darksiders.hbsis.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor

@Table(name= "boletim")
@Entity
public class Boletim {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;

    @Column(name = "trimestre")
    private Trimestre trimestre;

    @ManyToOne(targetEntity = Aluno.class, cascade = { CascadeType.MERGE, CascadeType.PERSIST }, fetch = FetchType.LAZY)
    @JoinColumn(name = "aluno_id", referencedColumnName = "id")
    private Aluno aluno;

    @OneToMany(targetEntity = Materia.class, mappedBy = "boletim", fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    private List<Materia> materias;

}
