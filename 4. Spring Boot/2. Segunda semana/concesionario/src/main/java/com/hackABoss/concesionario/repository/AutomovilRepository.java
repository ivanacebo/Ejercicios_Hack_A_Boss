package com.hackABoss.concesionario.repository;

import com.hackABoss.concesionario.model.Automovil;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AutomovilRepository implements IAutomovilRepository {

    private List<Automovil> listaAutomoviles;

    @PostConstruct
    public void init() {
        listaAutomoviles = cargarAutomoviles();
    }

    @Override
    public void añadirAutomovil(Automovil auto) {
        listaAutomoviles.add(auto);
    }

    @Override
    public List<Automovil> traerAutomoviles() {
        return listaAutomoviles;
    }

    @Override
    public List<Automovil> cargarAutomoviles() {
        List<Automovil> autos = new ArrayList<>();
        autos.add(new Automovil(1L, "Toyota", "Corolla", 15000.0, 200000.0, "XYZ123"));
        autos.add(new Automovil(2L, "Honda", "Civic", 18000.0, 180000.0, "ABC456"));
        autos.add(new Automovil(3L, "Ford", "Fiesta", 12000.0, 150000.0, "DEF789"));
        autos.add(new Automovil(4L, "Chevrolet", "Camaro", 35000.0, 50000.0, "GHI101"));
        autos.add(new Automovil(5L, "BMW", "X5", 45000.0, 80000.0, "JKL112"));
        autos.add(new Automovil(6L, "Mercedes-Benz", "C-Class", 40000.0, 70000.0, "MNO131"));
        autos.add(new Automovil(7L, "Audi", "A4", 38000.0, 60000.0, "PQR141"));
        autos.add(new Automovil(8L, "Nissan", "Altima", 20000.0, 120000.0, "STU151"));
        autos.add(new Automovil(9L, "Volkswagen", "Jetta", 22000.0, 100000.0, "VWX161"));
        autos.add(new Automovil(10L, "Hyundai", "Elantra", 19000.0, 110000.0, "YZA171"));
        autos.add(new Automovil(11L, "Toyota", "RAV4", 27000.0, 90000.0, "BCD182"));
        autos.add(new Automovil(12L, "Honda", "Accord", 32000.0, 75000.0, "EFG193"));
        autos.add(new Automovil(13L, "Ford", "Mustang", 40000.0, 60000.0, "HIJ204"));
        autos.add(new Automovil(14L, "Chevrolet", "Silverado", 38000.0, 70000.0, "KLM215"));
        autos.add(new Automovil(15L, "BMW", "3 Series", 42000.0, 65000.0, "NOP226"));
        autos.add(new Automovil(16L, "Mercedes-Benz", "E-Class", 55000.0, 50000.0, "QRS237"));
        autos.add(new Automovil(17L, "Audi", "Q5", 48000.0, 55000.0, "TUV248"));
        autos.add(new Automovil(18L, "Nissan", "Rogue", 30000.0, 80000.0, "VWX259"));
        autos.add(new Automovil(19L, "Volkswagen", "Tiguan", 34000.0, 70000.0, "YZA260"));
        autos.add(new Automovil(20L, "Hyundai", "Tucson", 29000.0, 85000.0, "BCD271"));
        return autos;
    }
}