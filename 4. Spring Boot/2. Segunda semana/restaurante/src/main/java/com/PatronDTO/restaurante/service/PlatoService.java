package com.PatronDTO.restaurante.service;

import com.PatronDTO.restaurante.dto.IngredienteDTO;
import com.PatronDTO.restaurante.dto.PlatoDTO;
import com.PatronDTO.restaurante.model.Ingrediente;
import com.PatronDTO.restaurante.model.Plato;
import com.PatronDTO.restaurante.repository.IngredienteReporitory;
import com.PatronDTO.restaurante.repository.PlatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;


@Service
public class PlatoService implements IPlatoService{

    @Autowired
    private IngredienteReporitory ingredienteReporitory;

    @Autowired
    private PlatoRepository platoRepository;

    @Override
    public List<Ingrediente> listaIngredientes() {
        return ingredienteReporitory.listaIngredientes();
    }

    @Override
    public List<Plato> listaPlatos() {
        return platoRepository.listaPlatos();
    }

    @Override
    public PlatoDTO buscarPlato(String plato) {

        Plato platoBuscado = platoRepository.listaPlatos().stream()
                .filter( p -> p.getNombre().equalsIgnoreCase(plato))
                .findFirst()
                .orElse(new Plato());

        return toPlatoDTO(platoBuscado);
    }


    private PlatoDTO toPlatoDTO(Plato plato) {

        List<IngredienteDTO> ingredientesDTO = plato.getIngredientes().stream()
                .map(ingrediente -> new IngredienteDTO(ingrediente.getName(), ingrediente.getCalories()))
                .toList();

        Integer totalCalorias = ingredientesDTO.stream()
                .mapToInt(IngredienteDTO::getCaloriasIngrediente)
                .sum();

        IngredienteDTO ingredienteMayorCalorias = ingredientesDTO.stream()
                .max(Comparator.comparingDouble(IngredienteDTO::getCaloriasIngrediente))
                .orElse(new IngredienteDTO());

        return new PlatoDTO(plato.getNombre(), totalCalorias, ingredienteMayorCalorias, ingredientesDTO);
    }

}
