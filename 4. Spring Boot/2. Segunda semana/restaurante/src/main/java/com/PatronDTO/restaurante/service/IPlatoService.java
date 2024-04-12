package com.PatronDTO.restaurante.service;

import com.PatronDTO.restaurante.dto.PlatoDTO;
import com.PatronDTO.restaurante.model.Ingrediente;
import com.PatronDTO.restaurante.model.Plato;

import java.util.List;

public interface IPlatoService {

    public List<Ingrediente> listaIngredientes();
    public List<Plato> listaPlatos();

    public PlatoDTO buscarPlato(String plato);
}
