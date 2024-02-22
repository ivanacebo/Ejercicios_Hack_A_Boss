package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Vamos a realizar distintas operaciones con sus dos números");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digame su primer número a utilizar");
        double num1 = scanner.nextDouble();
        System.out.println("Digame su segundo número a utilizar");
        double num2 = scanner.nextDouble();

        System.out.println("Vamos a hacer los cálculos");
        System.out.println("Suma: " + (num1+num2));
        System.out.println("Resta: " + (num1-num2));
        System.out.println("Multiplicación: " + (num1*num2));
        System.out.println("División; " + (num1/num2));
    }
}