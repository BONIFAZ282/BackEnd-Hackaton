package utp.edu.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import utp.edu.models.entities.Perfil;

@Repository
public interface PerfilDao extends JpaRepository<Perfil,Long> {
}
