package utp.edu.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import utp.edu.models.entities.Habilidad;

@Repository
public interface HabilidadDao extends JpaRepository<Habilidad,Long> {
}
