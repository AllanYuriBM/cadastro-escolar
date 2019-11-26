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

@Table(name= "nota")
@Entity
public class Nota {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;

    @Column(name = "valor_nota")
    private Float valorNota;

    @ManyToOne(targetEntity = Materia.class, cascade = { CascadeType.MERGE, CascadeType.PERSIST }, fetch = FetchType.LAZY)
    @JoinColumn(name = "materia_id", referencedColumnName = "id")
    private Materia materia;




}
