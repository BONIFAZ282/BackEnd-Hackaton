package utp.edu.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import utp.edu.models.entities.Trabajo;

@Repository
public interface TrabajoDao extends JpaRepository<Trabajo,Long> {
}
