package com.hackABoss.concesionario.repository;

import com.hackABoss.concesionario.model.Automovil;

import java.util.List;

public interface IAutomovilRepository {

    public void añadirAutomovil(Automovil auto);

    public List<Automovil> traerAutomoviles ();

    public List<Automovil> cargarAutomoviles();
}
