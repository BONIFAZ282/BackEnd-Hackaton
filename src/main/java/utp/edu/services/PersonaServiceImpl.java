package utp.edu.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utp.edu.models.dao.PersonaDao;
import utp.edu.models.entities.Persona;

import java.util.List;

@Service
public class PersonaServiceImpl implements IPersonaService{

    @Autowired
    private PersonaDao personaDao;

    @Override
    public List<Persona> getPersonasByCurso(Long idCurso) {
        return personaDao.getPersonasByCurso(idCurso);
    }
}
