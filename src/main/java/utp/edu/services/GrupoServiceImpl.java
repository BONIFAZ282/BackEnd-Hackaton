package utp.edu.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import utp.edu.models.dao.CursoDao;
import utp.edu.models.dao.GrupoDao;
import utp.edu.models.dao.MiembroGrupoDao;
import utp.edu.models.dao.PersonaDao;
import utp.edu.models.dto.MiembroDTO;
import utp.edu.models.dto.CrearGrupoDTO;
import utp.edu.models.dto.UpdateMiembroDTO;
import utp.edu.models.entities.Grupo;
import utp.edu.models.entities.MiembroGrupo;
import utp.edu.models.entities.Persona;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class GrupoServiceImpl implements IGrupoService {

    @Autowired
    private GrupoDao grupoDao;

    @Autowired
    private PersonaDao personaDao;
    @Autowired
    private MiembroGrupoDao miembroGrupoDao;
    @Autowired
    private CursoDao cursoDao;

    @Override
    public List<Grupo> getGruposByCodPersona(String codigoPersona) {
        return grupoDao.getGruposByCodPersona(codigoPersona);
    }

    @Override
    public Grupo crearGrupo(CrearGrupoDTO grupoDTO) {
        Optional<Persona> personaLider = personaDao.findPersonaByCod(grupoDTO.getCodigoUsuario());

        if(personaLider.isPresent()){
            Grupo nuevoGrupo = new Grupo();

            //Guardar grupo
            LocalDateTime now = LocalDateTime.now();
            nuevoGrupo.setFecha_creacion(Date.from(now.atZone(ZoneId.systemDefault()).toInstant()));
            nuevoGrupo.setCurso(cursoDao.findById(grupoDTO.getIdCurso()).get());
            nuevoGrupo.setNombre(grupoDTO.getNombregrupo());
            Grupo grupoguardado = grupoDao.save(nuevoGrupo);


            //Guardar usuario actual
            MiembroGrupo nuevomiembro = new MiembroGrupo();
            nuevomiembro.setEs_lider(true);
            nuevomiembro.setGrupo(nuevoGrupo);
            nuevomiembro.setPersona(personaLider.get());
            nuevomiembro.setRol("Lider");

            miembroGrupoDao.save(nuevomiembro);
            return grupoguardado;
        }
        throw new RuntimeException("El usuario no se pudo encontrar") ;
    }

    @Override
    public MiembroGrupo agregarMiembro(MiembroDTO miembroDTO) {

        MiembroGrupo nuevomiembro = new MiembroGrupo();
        nuevomiembro.setEs_lider(false);
        nuevomiembro.setGrupo(grupoDao.findById(miembroDTO.getIdGrupo()).get());
        nuevomiembro.setPersona(personaDao.findPersonaByCod(miembroDTO.getCodMiembro()).get());
        nuevomiembro.setRol("Estudiante");

        return miembroGrupoDao.save(nuevomiembro);

    }

    @Override
    public void deleteMiembro(MiembroDTO miembroDTO) {
        Optional<Persona> miembroEncontrado = personaDao.findPersonaByCod(miembroDTO.getCodMiembro());
        if(miembroEncontrado.isPresent()){
            String codigo = miembroDTO.getCodMiembro();
            Long idGrupo = miembroDTO.getIdGrupo();
            grupoDao.deleteMiembro(codigo,idGrupo);
        }else {
            throw new RuntimeException("El miembro a eliminar no se pudo encontrar") ;
        }
    }

    @Override
    public MiembroGrupo updateMiembro(UpdateMiembroDTO updateMiembroDTO) {
        String codigo = updateMiembroDTO.getCodigoUsuario();
        Long idGrupo = updateMiembroDTO.getIdGrupo();
        Optional<MiembroGrupo> miembroEncontrado = grupoDao.findMiembro(codigo,idGrupo);
        if(miembroEncontrado.isPresent()){
            MiembroGrupo miembro=miembroEncontrado.get();
            miembro.setRol(updateMiembroDTO.getRolGrupo());
            return miembroGrupoDao.save(miembro);
        }else{
            throw new RuntimeException("El miembro a modificar no se pudo encontrar") ;
        }
    }


}
