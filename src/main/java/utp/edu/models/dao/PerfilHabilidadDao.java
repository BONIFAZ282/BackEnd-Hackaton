package utp.edu.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import utp.edu.models.entities.PerfilHabilidad;

@Repository
public interface PerfilHabilidadDao extends JpaRepository<PerfilHabilidad,Long> {
}
