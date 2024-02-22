package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digame du edad: ");
        int edad = scanner.nextInt();

        if (edad >= 18) {
            System.out.println("Usted es mayor de edad por lo que puede entrar al recital");
        } else {
            System.out.println("usted es menor de edad por lo que no tiene permitida la entrada al recital");
        }
    }
}