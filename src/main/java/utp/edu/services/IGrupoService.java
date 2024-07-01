package utp.edu.services;

import utp.edu.models.dto.MiembroDTO;
import utp.edu.models.dto.CrearGrupoDTO;
import utp.edu.models.dto.UpdateMiembroDTO;
import utp.edu.models.entities.Grupo;
import utp.edu.models.entities.MiembroGrupo;

import java.util.List;

public interface IGrupoService {

    public List<Grupo> getGruposByCodPersona(String codigoPersona);
    public Grupo crearGrupo(CrearGrupoDTO grupoDTO);
    public MiembroGrupo agregarMiembro(MiembroDTO miembroDTO);
    public void deleteMiembro(MiembroDTO miembroDTO);
    public MiembroGrupo updateMiembro(UpdateMiembroDTO updateMiembroDTO);

}
