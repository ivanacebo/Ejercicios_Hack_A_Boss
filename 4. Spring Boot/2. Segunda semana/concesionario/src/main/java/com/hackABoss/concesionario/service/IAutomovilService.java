package com.hackABoss.concesionario.service;

import com.hackABoss.concesionario.model.Automovil;

import java.util.List;

public interface IAutomovilService {

    public void añadirAutomovil(Automovil auto);

    public List<Automovil> traerAutomoviles ();

    public List<Automovil> listaAutomovilPrecio ();

    public List<Automovil> traerAutomovilesPrecio(Double minimo, Double maximo);

    public Automovil traerAutomovilId (Long id);
}
