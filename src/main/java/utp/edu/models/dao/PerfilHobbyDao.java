package utp.edu.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import utp.edu.models.entities.PerfilHobby;

@Repository
public interface PerfilHobbyDao extends JpaRepository<PerfilHobby,Long> {
}
