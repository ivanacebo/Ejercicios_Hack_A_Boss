package com.PatronDTO.restaurante.dto;

import lombok.*;

import java.util.List;

@Data
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class PlatoDTO {

    private String nombrePlato;
    private Integer totalCalorias;
    private IngredienteDTO ingredienteMayorCalorias;
    private List<IngredienteDTO> ingredientes;

}
