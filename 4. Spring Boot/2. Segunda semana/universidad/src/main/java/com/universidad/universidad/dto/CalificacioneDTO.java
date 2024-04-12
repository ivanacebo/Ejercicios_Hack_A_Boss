package com.universidad.universidad.dto;

import lombok.*;

@Data
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class CalificacioneDTO {

    private Double media;

    private String nombreAlumno;
    private Double calificacion1;
    private Double calificacion2;
    private Double calificacion3;

}
