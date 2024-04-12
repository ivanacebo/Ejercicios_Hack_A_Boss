package com.PatronDTO.restaurante.model;

import lombok.*;

import java.util.List;

@Data
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Plato {

    private Integer id;
    private String nombre;
    private List<Ingrediente> ingredientes;
}
