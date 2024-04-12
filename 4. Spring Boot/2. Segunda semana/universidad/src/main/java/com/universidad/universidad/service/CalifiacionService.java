package com.universidad.universidad.service;

import com.universidad.universidad.dto.CalificacioneDTO;
import com.universidad.universidad.model.Calificacion;
import com.universidad.universidad.model.Estudiante;
import com.universidad.universidad.repository.CalificacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CalifiacionService implements  ICalificacionService{
    @Autowired
    CalificacionRepository calificacionRepository;

    /**
     * Creamos nuevos calificaciones con sus respectivos alumno
     * @param calificacion
     */
    @Override
    public void crearCalificacion(Calificacion calificacion) {
        calificacionRepository.listaCalificaciones.add(calificacion);
    }

    /**
     * Obtenemos las calificaciones de un determinado alumno filtrado por su matricula
     * @param matricula
     * @return Calificaciones alumno concreto
     */
    @Override
    public Calificacion obtenerCalificacionMatricula(String matricula) {
        return calificacionRepository.listaCalificaciones.stream()
                .filter(p -> p.getEstudiante().getNumeroMatricula().equalsIgnoreCase(matricula))
                .findFirst()
                .orElse(null);
    }

    private CalificacioneDTO toCalificacionDTO(Calificacion calificacion) {
        Estudiante estudiante = calificacion.getEstudiante();
        return new CalificacioneDTO(calificacion.getPromedio(),
                estudiante.getNombre() + " " + estudiante.getApellido(),
                calificacion.getCalificacion1(),
                calificacion.getCalificacion2(),
                calificacion.getCalificacion3());
    }

    /**
     * Lista de calificaciones ordenada por patron dto
     * @return lista Calificacines patron dto
     */
    public List<CalificacioneDTO> listaCalificacionOrdenada() {
        return calificacionRepository.listaCalificaciones.stream()
                .sorted(Comparator.comparingDouble(Calificacion::getPromedio).reversed())
                .map(this::toCalificacionDTO) // Utilizando el método crearCalificacionDTO
                .collect(Collectors.toList());
    }

    /**
     * extraer la lista de estudiantes de las calificaciones
     * @return lista estudiantes
     */
    @Override
    public List<Estudiante> obtenerEstudiantes() {
        return calificacionRepository.listaCalificaciones.stream()
                .map(Calificacion::getEstudiante)
                .toList();
    }
}
