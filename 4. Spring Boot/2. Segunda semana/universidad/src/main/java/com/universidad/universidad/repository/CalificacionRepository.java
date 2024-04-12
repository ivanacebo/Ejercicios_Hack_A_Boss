package com.universidad.universidad.repository;

import com.universidad.universidad.model.Calificacion;
import com.universidad.universidad.model.Estudiante;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CalificacionRepository {

    public List<Calificacion> listaCalificaciones = new ArrayList<>();

    public CalificacionRepository () {

        listaCalificaciones.add(new Calificacion(1L, 8.5, 7.2, 9.0, 8.2, new Estudiante("001", "Juan", "García", "12/05/2000")));
        listaCalificaciones.add(new Calificacion(2L, 6.8, 8.0, 7.5, 7.4, new Estudiante("002", "María", "López", "25/09/2001")));
        listaCalificaciones.add(new Calificacion(3L, 9.0, 9.5, 8.7, 9.1, new Estudiante("003", "Carlos", "Martínez", "03/11/1999")));
        listaCalificaciones.add(new Calificacion(4L, 7.0, 6.5, 7.8, 7.1, new Estudiante("004", "Ana", "Sánchez", "18/07/2002")));
        listaCalificaciones.add(new Calificacion(5L, 8.8, 9.2, 8.5, 8.8, new Estudiante("005", "Pedro", "Fernández", "09/03/2001")));
        listaCalificaciones.add(new Calificacion(6L, 7.5, 8.0, 7.2, 7.6, new Estudiante("006", "Laura", "González", "22/08/2000")));
        listaCalificaciones.add(new Calificacion(7L, 8.0, 7.9, 8.3, 8.1, new Estudiante("007", "David", "Pérez", "30/04/2002")));
        listaCalificaciones.add(new Calificacion(8L, 9.2, 8.8, 9.5, 9.2, new Estudiante("008", "Sara", "Díaz", "14/12/1999")));
        listaCalificaciones.add(new Calificacion(9L, 7.8, 8.5, 8.0, 8.1, new Estudiante("009", "Daniel", "Rodríguez", "07/10/2003")));
        listaCalificaciones.add(new Calificacion(10L, 8.5, 9.0, 8.7, 8.7, new Estudiante("010", "Lucía", "Ruiz", "28/06/2000")));
    }
}
