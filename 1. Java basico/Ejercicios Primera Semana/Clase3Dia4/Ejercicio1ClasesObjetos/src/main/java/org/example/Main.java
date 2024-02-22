package org.example;

import clases.Electrodomestico;

public class Main {
    public static void main(String[] args) {

        Electrodomestico electrodomestico1 = new Electrodomestico(1, "Maytag", "modelo 1",  500, "Blanco");
        Electrodomestico electrodomestico2 = new Electrodomestico(2, "Bosch", "modelo 2", 680, "negro");
        Electrodomestico electrodomestico3 = new Electrodomestico(3, "Tefal", "modelo 3", 385.25, "blanco");
        Electrodomestico electrodomestico4 =new Electrodomestico();

        electrodomestico1.mostrarDatos();
        electrodomestico2.mostrarDatos();
        electrodomestico3.mostrarDatos();

        // El modelo cuatro, sus datos, sera NULL hasta que no se introduzcan con los setters
        System.out.println("La marca del modelo creado sin parametroes es: " + electrodomestico4.getMarca());
        electrodomestico4.setCod(4);
        electrodomestico4.setMarca("Tefal");
        electrodomestico4.setModelo("modelo 4");
        electrodomestico4.setConsumo(528.24);
        electrodomestico4.setColor("negro");

        electrodomestico4.mostrarDatos();
    }
}