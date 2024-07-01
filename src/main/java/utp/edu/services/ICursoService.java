package utp.edu.services;

import utp.edu.models.entities.Curso;
import utp.edu.models.entities.Persona;

import java.util.List;

public interface ICursoService {

    public List<Curso> getCursosByCod(String codigo);



}
