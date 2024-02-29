package org.example;

import clases.Verdura;

public class Main {
    public static void main(String[] args) {

        Verdura [] verduras = {
                new Verdura(1, "Berenjena", "verde", 78.5, "Debe cocinarse"),
                new Verdura(2, "Zanahoria", "naranja", 52.0, "Puede comerse cruda o cocida"),
                new Verdura(3, "Brócoli", "verde", 55.0, "Puede comerse crudo o cocido"),
                new Verdura(4, "Calabacín", "verde", 17.0, "Puede comerse crudo o cocido"),
                new Verdura(5, "Pimiento", "rojo", 31.0, "Puede comerse crudo o cocido"),

        };

        for (int i=0; i< verduras.length; i++) {
            System.out.println("Las " + verduras[i].getNombre() + " tiene " + verduras[i].getCalorias() + " calorias.");
        }

        verduras[3] = new Verdura(4, "Espinaca", "verde", 23.0, "Puede comerse cruda o cocida");
        verduras[0] = new Verdura(1, "Lechuga", "verde", 15.0, "Se come cruda");

        System.out.println("Los datos de nuestras verduras son:\n");
        for (int j=0; j< verduras.length; j++) {
            System.out.println("nombre: " + verduras[j].getNombre() + "\n" +
                    "color: " + verduras[j].getColor() + "\n" +
                    "calorias: " + verduras[j].getCalorias() + "\n" +
                    "como se come: " + verduras[j].getDebeCocinarse() +
                    "\n");
        }

        System.out.println("Las verduras verdes son:\n");
        for (int i=0; i< verduras.length; i++) {
            if (verduras[i].getColor() == "verde") {
                System.out.println("nombre: " + verduras[i].getNombre() + "\n" +
                        "color: " + verduras[i].getColor() + "\n" +
                        "calorias: " + verduras[i].getCalorias() + "\n" +
                        "como se come: " + verduras[i].getDebeCocinarse() +
                        "\n");
            }
        }
    }
}