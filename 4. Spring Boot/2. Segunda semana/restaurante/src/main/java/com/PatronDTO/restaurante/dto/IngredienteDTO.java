package com.PatronDTO.restaurante.dto;

import lombok.*;

@Data
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class IngredienteDTO {
    private String NombreIngrediente;
    private Integer caloriasIngrediente;
}
