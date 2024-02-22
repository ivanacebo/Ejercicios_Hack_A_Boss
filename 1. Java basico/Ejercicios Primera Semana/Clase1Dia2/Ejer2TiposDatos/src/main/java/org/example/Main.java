package org.example;

public class Main {
    public static void main(String[] args) {

        int numero = 10;
        double numeroDecimal = 18.2;
        boolean empezamos = true;
        String frase = "Aqui mostramos el valor del string";

        System.out.println("Su número es: " + numero);
        System.out.println("Su número decimal es: " + numeroDecimal);
        System.out.println("El booleano escrito tiene la condición de: " + empezamos);
        System.out.println("La frase escrita dice; " + frase);

        /**
         * Si aisgnamos valores que no corresponden a cada tipo de dato el probrama o IDE en este caso peta y no deja avanzar
         * diciendonos que tenemos un error en el codigo una vez llegue a él.
         * Podemos observar tambien como arriba a la derehca del IDE nos sale un icono rojo con una exclamación o en el propio
         * código como se pone en rojo cuando le asigamos valores no válidos.
         *
         * Por otro lado el String podemos asignarle cualquier valor siempre que este entre esas comillas pero
         * se le va a asignar como si fuera texto no numero en este caso.
         */
    }
}