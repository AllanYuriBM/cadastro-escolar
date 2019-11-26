package com.darksiders.hbsis.repository;

import com.darksiders.hbsis.model.Aluno;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Integer> {

    //TODO implementar classe repository com os finds, saves, deletes e updates

}
