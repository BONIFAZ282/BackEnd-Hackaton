package utp.edu.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import utp.edu.models.entities.Usuario;

@Repository
public interface UsuarioDao extends JpaRepository<Usuario,Long> {
}
