package org.example;

import clase.Inventario;
import clase.InventarioException;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*
        No pedimos al usuario que ingrese datos puesto que coomo es un ejercicio simple ingresamos datos a mano
        Creando asi los fallos para comprobar que nos salten las excepciones por consola.
        Utilizamos también programación funcional.
         */

        try {
            List<Inventario> inventarioProductos = Arrays.asList(

                // new Inventario("Camiseta", 0, 50), Excepcion, el precio del producto no puede ser menor que 0

                new Inventario("Pantalón", 35.50, 40),
                new Inventario("Zapatos deportivos", 59.99, 30),

                //new Inventario("Chaqueta", 45.75, 0),Exception, la cantidad disponible del producto no puede ser 0.

                new Inventario("Bufanda", 12.99, 60),
                new Inventario("Gorra", 8.75, 45),
                new Inventario("Sudadera", 30.50, 35),
                new Inventario("Calcetines", 5.00, 100),
                new Inventario("Reloj", 99.99, 15),
                new Inventario("Mochila", 42.49, 25),

                //new Inventario("", 18.25, 70), Exception, un producto siempre tiene que tener un nombre.

                new Inventario("Bolsa de playa", 20.75, 55),
                new Inventario("Paraguas", 15.99, 40),
                new Inventario("Cinturón", 22.50, 30),
                new Inventario("Guantes", 9.50, 80)
            );

            inventarioProductos.forEach(System.out::println);
        } catch (InventarioException e) {
            System.out.println(e.getMessage());
        }




    }
}