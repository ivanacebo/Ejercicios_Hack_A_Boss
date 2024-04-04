package com.hackaboss.GestionEventosAcademicos.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Participante {

    private Long id;
    private String nombre;
    private String apellido;
}
