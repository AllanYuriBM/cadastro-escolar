package com.darksiders.hbsis.professor;

import com.darksiders.hbsis.aluno.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Integer> {

    //TODO implementar classe repository com os finds, saves, deletes e updates

}
