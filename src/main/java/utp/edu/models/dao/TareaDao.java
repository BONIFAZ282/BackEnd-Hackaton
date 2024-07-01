package utp.edu.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import utp.edu.models.entities.Tarea;

@Repository
public interface TareaDao extends JpaRepository<Tarea,Long> {
}
