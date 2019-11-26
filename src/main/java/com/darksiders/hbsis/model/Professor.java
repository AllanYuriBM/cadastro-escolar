package com.darksiders.hbsis.model;

import com.darksiders.hbsis.model.Materia;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor

@Table(name= "professor")
@Entity
public class Professor {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "usuario")
    private String usuario;

    @Column(name = "senha")
    private String senha;

    @OneToOne(targetEntity = Materia.class, cascade = { CascadeType.MERGE, CascadeType.PERSIST }, fetch = FetchType.LAZY)
    @JoinColumn(name = "materia_id", referencedColumnName = "id")
    private Materia materia;

}
