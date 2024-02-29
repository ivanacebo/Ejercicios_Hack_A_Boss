package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int [][] asientos = new int[5][5];
        Scanner scanner =new Scanner(System.in);
        boolean finReservas = false;
        int hacer;
        int fila;
        int asiento;

        while (!finReservas) {
            System.out.println("Digame que quiere realizar: \n"  +
                    "0: Salir del programa \n" +
                    "1: Reservar un asiento \n" +
                    "2: Obsevar que asientos estan vacios");
            hacer = scanner.nextInt();

            switch (hacer) {
                case 0:
                    System.out.println("Finalizada todas las reservas");
                    finReservas = true;
                    break;
                case 1:
                    System.out.println("Digame que fila quiere reservar. Valor entre 0 y 4");
                    fila = scanner.nextInt();
                    System.out.println("Digame que asiento quiere reservar. Valor entre 0 y 4");
                    asiento = scanner.nextInt();

                    if (asientos [fila] [asiento] == 0) {
                        System.out.println("El asiento esta vacio por lo que queda reservado para usted");
                        asientos [fila] [asiento] = 1;
                    }else {
                        System.out.println("Este asiento esta ya reservado. Busque otro asiento.");
                    }
                    break;
                case 2:
                    for (int i = 0; i < asientos.length; i++) {
                        for (int j = 0; j < asientos[i].length; j++) {
                            System.out.print(asientos[i][j] == 0 ? "O " : "X ");
                        }
                        System.out.println();
                    }
                    break;
                default:
                    System.out.println("Usted no ha escogido ninguno de los casos que se le pide");
            }

        }
    }
}