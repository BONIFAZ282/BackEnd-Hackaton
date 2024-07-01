package utp.edu.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import utp.edu.models.entities.Hobbie;

@Repository
public interface HobbieDao extends JpaRepository<Hobbie,Long> {
}
