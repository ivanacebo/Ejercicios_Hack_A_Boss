package org.example;

import clase.Manager;

public class Main {
    public static void main(String[] args) {

        Manager manager = new Manager(5);

        manager.introducirDato("Indice 0 -> primer valor del vector");
        manager.introducirDato("Indice 1 -> segundo valor del vector");
        manager.introducirDato("Indice 2 -> tercer valor del vector");
        manager.introducirDato("Indice 3 -> cuarto valor del vector");
        manager.introducirDato("Indice 4 -> quinto valor del vector");

        System.out.println(manager.obtenerDato(0));
        System.out.println(manager.obtenerDato(1));
        System.out.println(manager.obtenerDato(2));
        System.out.println(manager.obtenerDato(3));
        System.out.println(manager.obtenerDato(4));

        /*
        A partir de aqui nos muestra el mensaje que impusimos en la excepción estandar de Java IndexOutOfBoundsException
        mostrando por la consola dicho mensaje.
         */
        System.out.println(manager.obtenerDato(5));
        System.out.println(manager.obtenerDato(6));
        System.out.println(manager.obtenerDato(7));

    }
}