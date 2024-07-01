package utp.edu.models.dao;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import utp.edu.models.entities.Curso;
import utp.edu.models.entities.Grupo;
import utp.edu.models.entities.MiembroGrupo;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Repository
public interface GrupoDao extends JpaRepository<Grupo,Long> {
    @Query("SELECT g FROM Grupo g " +
            "JOIN MiembroGrupo mg ON g.id = mg.grupo.id " +
            "JOIN Persona p ON p.id = mg.persona.id " +
            "WHERE p.codigo = :codigo")

    List<Grupo> getGruposByCodPersona(@Param("codigo") String codigoPersona);

    @Modifying
    @Query("DELETE FROM MiembroGrupo mg WHERE mg.persona.codigo = :codigo AND mg.grupo.id = :idGrupo")
    @Transactional
    void deleteMiembro(@Param("codigo") String codigoPersona, @Param("idGrupo") Long idGrupo);

    @Query("SELECT mg FROM MiembroGrupo mg " +
            "JOIN mg.persona p " +
            "JOIN mg.grupo g " +
            "WHERE p.codigo = :codigo AND g.id = :idGrupo")
    Optional<MiembroGrupo> findMiembro(@Param("codigo") String codigoPersona, @Param("idGrupo") Long idGrupo);

}
