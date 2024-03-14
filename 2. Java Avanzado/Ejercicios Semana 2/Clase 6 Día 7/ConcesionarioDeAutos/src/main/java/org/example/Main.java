package org.example;

import clase.Auto;
import clase.InventarioAuto;

import java.util.List;

public class Main {
    public static void main(String[] args) {


        InventarioAuto<Auto> inventarioAutos = new InventarioAuto<>();

        inventarioAutos.agregarAuto(new Auto("Toyota", "Corolla", "2023", 25000.0));
        inventarioAutos.agregarAuto(new Auto("Ford", "Focus", "2022", 22000.0));
        inventarioAutos.agregarAuto(new Auto("Hyundai", "Civic", "2024", 28000.0));
        inventarioAutos.agregarAuto(new Auto("Chevrolet", "Camaro", "2023", 40000.0));
        inventarioAutos.agregarAuto(new Auto("Volkswagen", "Golf", "2022", 23000.0));
        inventarioAutos.agregarAuto(new Auto("BMW", "X5", "2024", 60000.0));
        inventarioAutos.agregarAuto(new Auto("Mercedes-Benz", "E-Class", "2023", 55000.0));
        inventarioAutos.agregarAuto(new Auto("Audi", "A4", "2022", 45000.0));
        inventarioAutos.agregarAuto(new Auto("Hyundai", "Elantra", "2024", 26000.0));
        inventarioAutos.agregarAuto(new Auto("Hyundai", "Optima", "2023", 27000.0));

        // Imprimir autos por año
        System.out.println("Autos del año 2023:");
        List<Auto> autosPorAno = inventarioAutos.buscarAutosPorAno("2023");
        for (Auto auto : autosPorAno) {
            System.out.println(auto);
        }

        System.out.println("");

        // Imprimir autos por marca
        System.out.println("Autos de la marca Hyundai:");
        List<Auto> autosPorMarca = inventarioAutos.buscarAutosPorMarca("Hyundai");
        for (Auto auto : autosPorMarca) {
            System.out.println(auto);
        }

        System.out.println("");

        System.out.println("Valor total del inventario " + inventarioAutos.calcularValorTotalInventario());

    }
}