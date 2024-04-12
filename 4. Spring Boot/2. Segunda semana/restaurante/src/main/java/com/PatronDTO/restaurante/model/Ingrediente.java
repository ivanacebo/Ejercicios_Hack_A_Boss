package com.PatronDTO.restaurante.model;

import lombok.*;

@Data
@Setter @Getter
@AllArgsConstructor
@NoArgsConstructor
public class Ingrediente {

    private Long id;
    private String name;
    private Integer calories;
}
