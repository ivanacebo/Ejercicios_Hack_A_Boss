package com.hackABoss.concesionario.service;

import com.hackABoss.concesionario.model.Automovil;

import com.hackABoss.concesionario.repository.IAutomovilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Service
public class AutomovilService implements IAutomovilService{

    @Autowired
    private IAutomovilRepository automovilRepository;

    @Override
    public void añadirAutomovil(Automovil auto) {
        automovilRepository.añadirAutomovil(auto);
    }

    @Override
    public List<Automovil> traerAutomoviles() {
        return automovilRepository.traerAutomoviles();
    }

    @Override
    public List<Automovil> listaAutomovilPrecio() {
        return automovilRepository.traerAutomoviles().stream()
                .sorted(Comparator.comparingDouble(Automovil::getPrecio))
                .toList();
    }

    @Override
    public List<Automovil> traerAutomovilesPrecio(Double minimo, Double maximo) {
        return automovilRepository.traerAutomoviles().stream()
                .filter(m -> m.getPrecio() > minimo && m.getPrecio() < maximo)
                .sorted(Comparator.comparingDouble(Automovil::getPrecio))
                .toList();
    }

    @Override
    public Automovil traerAutomovilId(Long id) {
        return automovilRepository.traerAutomoviles().stream()
                .filter(p -> p.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
