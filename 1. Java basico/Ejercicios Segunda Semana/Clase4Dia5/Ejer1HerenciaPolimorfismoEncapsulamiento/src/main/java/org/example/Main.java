package org.example;

import clases.Animal;
import clases.Ave;
import clases.Mamifero;
import clases.Reptil;

public class Main {
    public static void main(String[] args) {

        Mamifero delfin = new Mamifero("Delfina", 15, "lisa", "piscívoro", 1,
                "Gestación", "gris oscuro", "océano");
        Ave alcon = new Ave("Halcón Peregrino", 5, "plumaje", "carnívoro", "Pequeña",
                "alto", "Negro", "aguilera");
        Reptil anaconda = new Reptil("Anaconda verde", 20, "escamas", "carnívoro", 5.21,
                "gruesas", "venenosa", "selva amazónica");


        System.out.println(delfin.saludar());
        System.out.println(alcon.saludar());
        System.out.println(anaconda.saludar());

        /*
        La forma para crear un tipo de animal intentando meter un mamífero es de la siguiente forma:
        Esto usara la clase padre animal pero la subclase o clase hija mamífero.
         */
        Animal animal1 = new Mamifero("Delfina", 15, "lisa", "piscívoro", 1,
                "Gestación", "gris oscuro", "océano");
        System.out.println(animal1.saludar());

        /*
        Si usamos el public todos podran acceder a los atributos de nuestra clase independientemente de donde se encuentren.
        Si usamos el protected podran acceder tan solo las subclases que extiendan de la clase principal y dependera del package donde estemos (main).
        Si usamos el private significa que los atributos solo pueden ser accedidos desde la misma clase y no desde fuera de esta. Los metodos no tiene logica que sean private.
         */

    }
}