package org.example;

import clase.Reserva;
import clase.ReservaInvalidaException;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*
        No pedimos al usuario datos sino que creamos 15 reservas aleatorias en las que vamos modificando nombre o destino
        para comprobar si estos datos necesarios quedan vacios nos salta la exception y tambien modificamos el numero
        de asientos deseados que al ser superior al de asientos disponibles nos salta la excepcion implementada.
         */

        try {
            List<Reserva> reservas = Arrays.asList(
                    // new Reserva(1, "Reserva1", "Destino1", "Fecha1", 200), Al usar una cantidad mayor de 100 me salta la exception

                    new Reserva(2, "Reserva2", "Destino2", "Fecha2", 3),
                    new Reserva(3, "Reserva3", "Destino3", "Fecha3", 1),
                    new Reserva(4, "Reserva4", "Destino4", "Fecha4", 4),
                    new Reserva(5, "Reserva5", "Destino5", "Fecha5", 2),
                    new Reserva(6, "Reserva6", "Destino6", "Fecha6", 3),
                    new Reserva(7, "Reserva7", "Destino7", "Fecha7", 2),
                    new Reserva(8, "Reserva8", "Destino8", "Fecha8", 1),
                    new Reserva(9, "Reserva9", "Destino9", "Fecha9", 5),

                    //new Reserva(10, "", "Destino10", "Fecha10", 2), Daria la excepción implementada de datos invalidos

                    new Reserva(11, "Reserva11", "Destino11", "Fecha11", 3),
                    new Reserva(12, "Reserva12", "Destino12", "Fecha12", 2),

                    //new Reserva(13, "", "Destino13", "Fecha13", 4), Daria la excepción implementada de datos invalidos

                    new Reserva(14, "Reserva14", "Destino14", "Fecha14", 2),
                    new Reserva(15, "Reserva15", "Destino15", "Fecha15", 12)
            );
            reservas.forEach(System.out::println);
        } catch (ReservaInvalidaException e) {
            System.out.println(e.getMessage());
        }
    }
}