package com.hackABoss.concesionario.model;

import lombok.*;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Automovil {

    private Long id;
    private String marca;
    private String modelo;
    private Double precio;
    private Double kilometros;
    private String chasis;
}
