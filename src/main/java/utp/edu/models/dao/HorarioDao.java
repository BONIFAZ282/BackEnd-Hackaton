package utp.edu.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import utp.edu.models.entities.Horario;

@Repository
public interface HorarioDao extends JpaRepository<Horario,Long> {
}
