package com.darksiders.hbsis.nota;

import com.darksiders.hbsis.materia.Materia;
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

    @Column(name = "valor_nota")
    private Float valorNota;

    @ManyToOne(targetEntity = Materia.class, cascade = { CascadeType.MERGE, CascadeType.PERSIST }, fetch = FetchType.LAZY)
    @JoinColumn(name = "materia_id", referencedColumnName = "id")
    private Materia materia;




}
