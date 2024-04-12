package com.universidad.universidad.service;

import com.universidad.universidad.dto.CalificacioneDTO;
import com.universidad.universidad.model.Calificacion;
import com.universidad.universidad.model.Estudiante;

import java.util.List;

public interface ICalificacionService {

    public void crearCalificacion (Calificacion calificacion);
    public Calificacion obtenerCalificacionMatricula (String matricula);
    public List<CalificacioneDTO> listaCalificacionOrdenada ();

    public List<Estudiante> obtenerEstudiantes();

}
