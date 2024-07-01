package utp.edu.services;

import utp.edu.models.entities.Persona;

import java.util.List;

public interface IPersonaService {

    public List<Persona> getPersonasByCurso(Long idCurso);

}
