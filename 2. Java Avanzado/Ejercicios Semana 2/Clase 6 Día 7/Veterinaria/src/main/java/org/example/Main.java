package org.example;

import clase.Mascota;
import clase.RegistroMascota;

public class Main {
    public static void main(String[] args) {

        RegistroMascota registro = new RegistroMascota();
        registro.generarDatosAleatorios(20); //Generamos 20 datos aleatorios
        Mascota nuevaMascota = new Mascota("Mascota añadida", 10, "Perro");

        registro.agregarMascota(nuevaMascota); //Agregamos mascota

        System.out.println(" -- Buscamos las mascotas que tienen un determinado nombre --");
        registro.buscarMascotaNombre("Luna");
        System.out.println("");
        System.out.println(" -- La lista de mascotas de las especie de gato es --");
        registro.buscarMastotaEspecie("Gato");
        System.out.println("");
        System.out.println("El total de registro de mascotas es de: " + registro.cantidadTotalMascotas());

    }
}