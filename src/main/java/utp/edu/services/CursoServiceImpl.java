package utp.edu.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utp.edu.models.dao.CursoDao;
import utp.edu.models.dao.PersonaDao;
import utp.edu.models.entities.Curso;
import utp.edu.models.entities.Persona;

import java.util.List;

@Service
public class CursoServiceImpl implements ICursoService {

    @Autowired
    private CursoDao cursoDao;



    @Override
    public List<Curso> getCursosByCod(String codigo) {

        return cursoDao.getCursosByCod(codigo);
    }

}
