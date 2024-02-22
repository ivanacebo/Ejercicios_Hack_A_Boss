package org.example;

import clases.Persona;

public class Main {
    public static void main(String[] args) {

        Persona[] personas = {
                new Persona(1, "Manolo Canteli", 39, "Calle Facundo", "653265236"),
                new Persona(2, "Salazar Slicerin", 30, "Hodwarts", "985632458"),
                new Persona(3, "Legolas el Elfo", 54, "Mordor", "632145268"),
                new Persona(4, "David Costas", 28, "Calle Oviedo", "632145287"),
                new Persona(5, "Cleopatra", 18, "Calle Oriente Medio", "698747896")
        };

        for (int i = 0; i < personas.length; i++) {
            System.out.printf(personas[i].getNombre() + " tiene " + personas[i].getEdad() + " de edad \n");
        }

        personas[0].setNombre("Gandalf el Gris");
        personas[1].setNombre("Harry Potter");
        personas[2].setNombre("John Nieve");
        personas[3].setNombre("Satoru Gojo");
        personas[4].setNombre("Monkey D. Luffy");

        for (int i = 0; i < personas.length; i++) {
            System.out.printf("Vector - " + i + " cambia el nombre a " + personas[i].getNombre() +"\n");
        }

        System.out.println("Las personas mayores de 30 años son:");
        for (int i = 0; i < personas.length; i++) {
            if (personas[i].getEdad() > 30) {
                System.out.println(personas[i].getNombre() + " con " + personas[i].getEdad()+ " años.");
            }
        }
    }
}