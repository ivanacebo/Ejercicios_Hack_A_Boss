package org.example;

import clases.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Vehiculo> vehiculos = new ArrayList<>();

        Date year2018 = new Date(118, 0, 1); // 2018
        Auto autoElectrico1 = new Auto(1, "ABC123", "Tesla", "Model S", year2018, 80000, 100, 400);

        Date year2016 = new Date(116, 0, 1); // 2016
        Auto autoElectrico2 = new Auto(2, "DEF456", "Nissan", "Leaf", year2016, 35000, 100, 250);

        Date year2017 = new Date(117, 0, 1); // 2017
        Camioneta camionetaCombustion1 = new Camioneta(3, "GHI789", "Toyota", "Hilux", year2017, 40000, 80, 10);

        Date year2015 = new Date(115, 0, 1); // 2015
        Camioneta camionetaCombustion2 = new Camioneta(4, "JKL012", "Ford", "Ranger", year2015, 45000, 70, 12);

        Date year2014 = new Date(114, 0, 1); // 2014
        Moto motoCombustion1 = new Moto(5, "MNO345", "Honda", "CBR600RR", year2014, 12000, "600cc", "4 tiempos", 15);

        Date year2013 = new Date(113, 0, 1); // 2013
        Moto motoCombustion2 = new Moto(6, "PQR678", "Yamaha", "YZF-R6", year2013, 11000, "600cc", "4 tiempos", 14);

        vehiculos.add(autoElectrico1);
        vehiculos.add(autoElectrico2);
        vehiculos.add(camionetaCombustion1);
        vehiculos.add(camionetaCombustion2);
        vehiculos.add(motoCombustion1);
        vehiculos.add(motoCombustion2);

        // Mostrar los vehículos agregados
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo);
            System.out.println("El vehiculo tiene " + vehiculo.antiguedadVehiculo() + " años.");
            if (vehiculo instanceof Electrico) {
                Electrico electrico = (Electrico) vehiculo;
                electrico.cargarEnergia();
            } else {
                Combustion combustion = (Combustion) vehiculo;
                combustion.recargarCombustible();
            }
        }
    }
}