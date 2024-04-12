package com.universidad.universidad.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter @Setter
@AllArgsConstructor
public class Calificacion {

    private Long id;
    private Double calificacion1;
    private Double calificacion2;
    private Double calificacion3;
    private Double promedio;
    private Estudiante estudiante;
}
