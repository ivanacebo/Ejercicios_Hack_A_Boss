package com.universidad.universidad.Controller;

import com.universidad.universidad.dto.CalificacioneDTO;
import com.universidad.universidad.model.Calificacion;
import com.universidad.universidad.model.Estudiante;
import com.universidad.universidad.service.CalifiacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/calificaciones")
public class CalifiacionController {

    @Autowired
    private CalifiacionService califiacionService;

    @PostMapping
    public Calificacion crearCalificaciones (@RequestBody Calificacion calificacion) {
        califiacionService.crearCalificacion(calificacion);
        return calificacion;
    }

    @GetMapping("/ordendesc")
    public List<CalificacioneDTO> listaCalificacionOrdenada() {
        return califiacionService.listaCalificacionOrdenada();
    }

    @GetMapping("/{matricula}")
    public Calificacion obtenerCalificacionMatricula (@PathVariable String matricula) {
        return califiacionService.obtenerCalificacionMatricula(matricula);
    }

    @GetMapping("/estudiantes")
    public List<Estudiante> obtenerEstudiantes () {
        return califiacionService.obtenerEstudiantes();
    }
}
