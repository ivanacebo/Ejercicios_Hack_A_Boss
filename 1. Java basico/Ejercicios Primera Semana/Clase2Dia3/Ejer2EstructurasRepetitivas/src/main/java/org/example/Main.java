package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double precio;
        double total = 0;
        boolean acabar = false;
        Scanner scanner = new Scanner (System.in).useLocale(Locale.US);

        while (!acabar) {
            System.out.println("Digame el precio del producto");
            precio = scanner.nextDouble();

            if (precio != 0) {
                total += precio;
                acabar = false;
            } else {
                acabar = true;
                System.out.println("El total de su compra asciende a " + total);
                System.out.println("Muchas gracias por su compra");
            }
        }
    }
}