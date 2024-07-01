package utp.edu.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import utp.edu.models.entities.Curso;

import java.util.List;

@Repository
public interface CursoDao extends JpaRepository<Curso,Long> {
    @Query("SELECT c FROM Curso c " +
            "JOIN Matriculados m ON c.id = m.curso.id " +
            "JOIN Persona p ON p.id = m.persona.id " +
            "WHERE p.codigo = :codigo")
    List<Curso> getCursosByCod(@Param("codigo") String codigo);

}
