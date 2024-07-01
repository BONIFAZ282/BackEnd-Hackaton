package utp.edu.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import utp.edu.models.entities.Curso;
import utp.edu.models.entities.Persona;
import utp.edu.services.ICursoService;

import java.util.List;

@RestController
@RequestMapping("api/curso")
public class CursoController {
    @Autowired
    private ICursoService cursoService;

    @GetMapping("/lista/{codigo}")
    public List<Curso> getCursosByCod(@PathVariable String codigo) {
        return cursoService.getCursosByCod(codigo);
    }




}
