package utp.edu.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import utp.edu.models.entities.Curso;
import utp.edu.models.entities.Persona;

import java.util.List;
import java.util.Optional;

@Repository
public interface PersonaDao extends JpaRepository<Persona,Long> {
    @Query("SELECT p FROM Persona p " +
            "JOIN Matriculados m ON p.id = m.persona.id " +
            "JOIN Curso c ON c.id = m.curso.id " +
            "WHERE c.id = :idCurso")
    List<Persona> getPersonasByCurso(@Param("idCurso") Long idCurso);


    @Query("SELECT p FROM Persona p " +
            "WHERE p.codigo = :codigo")
    Optional<Persona> findPersonaByCod(@Param("codigo") String codigo);

}
