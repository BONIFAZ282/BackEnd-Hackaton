package utp.edu.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import utp.edu.models.entities.Matriculados;

@Repository
public interface MatriculadosDao extends JpaRepository<Matriculados,Long>{

}
