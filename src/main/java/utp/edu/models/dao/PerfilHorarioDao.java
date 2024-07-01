package utp.edu.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import utp.edu.models.entities.PerfilHorario;

@Repository
public interface PerfilHorarioDao extends JpaRepository<PerfilHorario,Long> {
}
