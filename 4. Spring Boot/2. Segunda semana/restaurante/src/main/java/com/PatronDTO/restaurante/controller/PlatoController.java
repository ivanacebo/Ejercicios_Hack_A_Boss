package com.PatronDTO.restaurante.controller;

import com.PatronDTO.restaurante.dto.PlatoDTO;
import com.PatronDTO.restaurante.model.Ingrediente;
import com.PatronDTO.restaurante.model.Plato;
import com.PatronDTO.restaurante.service.IPlatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/restaurante")
public class PlatoController {

    @Autowired
    private IPlatoService platoService;

    /**
     * Ver lista de Ingredientes que tenemos
     * @return lista ingredientes
     */
    @GetMapping("/lista/ingredientes")
    public List<Ingrediente> listaIngredientes () {
        return platoService.listaIngredientes();
    }

    /**
     * Ver lista de Platos que tenemos
     * @return lista platos
     */
    @GetMapping("/lista/platos")
    public List<Plato> listaPlatos () {
        return platoService.listaPlatos();
    }


    @GetMapping("/{nombre}")
    public PlatoDTO buscarPlato (@PathVariable String nombre) {
        return platoService.buscarPlato(nombre);
    }
}
