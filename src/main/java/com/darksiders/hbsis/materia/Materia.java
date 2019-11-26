package com.darksiders.hbsis.materia;

import com.darksiders.hbsis.nota.Nota;
import com.darksiders.hbsis.professor.Professor;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor

@Table(name= "materia")
@Entity
public class Materia {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;

    @Column(name = "nome")
    private String nome;

    @OneToOne(targetEntity = Professor.class, cascade = { CascadeType.MERGE, CascadeType.PERSIST }, fetch = FetchType.LAZY)
    @JoinColumn(name = "professor_id", referencedColumnName = "id")
    private Professor professor;

    @OneToMany(targetEntity = Nota.class, mappedBy = "materia", fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    private List<Nota> nota;


}
