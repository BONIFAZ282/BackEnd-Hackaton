package utp.edu.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import utp.edu.models.dto.MiembroDTO;
import utp.edu.models.dto.CrearGrupoDTO;
import utp.edu.models.dto.UpdateMiembroDTO;
import utp.edu.models.entities.Grupo;
import utp.edu.models.entities.MiembroGrupo;
import utp.edu.services.IGrupoService;

import java.util.List;

@RestController
@RequestMapping("api/grupo")
public class GrupoController {
    @Autowired
    private IGrupoService grupoService;

    @GetMapping("/lista/{codigo}")
    public List<Grupo> getGruposByCodPersona(@PathVariable String codigo) {
        return grupoService.getGruposByCodPersona(codigo);
    }

    @PostMapping("/crear")
    public ResponseEntity<Grupo> crearGrupo(@RequestBody CrearGrupoDTO grupoDTO){
        try {
            Grupo nuevoGrupo = grupoService.crearGrupo(grupoDTO);
            return new ResponseEntity<>(nuevoGrupo, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/agregar/miembro/")
    public ResponseEntity<MiembroGrupo> agregarMiembro(@RequestBody MiembroDTO miembroDTO){
        try {
            MiembroGrupo nuevoIntegrante = grupoService.agregarMiembro(miembroDTO);
            return new ResponseEntity<>(nuevoIntegrante, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/eliminar/miembro")
    public ResponseEntity<Void> eliminarMiembro(@RequestBody MiembroDTO miembroDTO){
        try {
            grupoService.deleteMiembro(miembroDTO);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("update/miembro")
    public ResponseEntity<MiembroGrupo> updateProducto(@RequestBody UpdateMiembroDTO updateMiembroDTO) {
        try {
            MiembroGrupo miembroModificado = grupoService.updateMiembro(updateMiembroDTO);
            return new ResponseEntity<>(miembroModificado, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
