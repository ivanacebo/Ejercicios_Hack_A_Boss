package com.hackaboss.GestionEventosAcademicos.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Evento {

    private Long id;
    private String titulo;
    private String descripción;
    private String fecha;
    private String hora;
    private String lugar;
    private String ponente;
    private List<Participante> participantes;
}
