package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int contador = 0;
        double temperatura;
        double promedio = 0;
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double [] temperaturas = new double [7];

        while (contador < 7) {
            System.out.println("Digame la temperatura del día");
            temperatura = scanner.nextDouble();
            temperaturas [contador] = temperatura;
            contador ++;
        }

        for (int i = 0; i < temperaturas.length; i++) {
            promedio += temperaturas [i];
            System.out.println("Las distintas temperaturas la semana fueron: " + temperaturas[i] + "ªC");
        }

        promedio = promedio / contador;

        System.out.printf("La temperatura media es de: %.2fºC", promedio);

    }
}