package com.hackABoss.concesionario.controller;

import com.hackABoss.concesionario.model.Automovil;
import com.hackABoss.concesionario.service.IAutomovilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vehiculos")
public class AutomovilController {

    @Autowired
    private IAutomovilService automovilService;

    @PostMapping
    public Automovil añadirAutomovil (@RequestBody Automovil automovil) {
        automovilService.añadirAutomovil(automovil);
        return automovil;
    }

    @GetMapping
    public List<Automovil> traerAutomoviles () {
        return automovilService.traerAutomoviles();
    }

    @GetMapping("/orden")
    public List<Automovil> listaVehiculosPrecio () {
        return automovilService.listaAutomovilPrecio();
    }

    @GetMapping("/{id}")
    public Automovil traerAutomovilId (@PathVariable Long id) {
        return automovilService.traerAutomovilId(id);
    }

    @GetMapping("/precios")
    public List<Automovil> traerAutomovilesPrecio (@RequestParam("desde") Double minimo, @RequestParam("hasta") Double maximo) {
        return automovilService.traerAutomovilesPrecio(minimo, maximo);
    }

}
