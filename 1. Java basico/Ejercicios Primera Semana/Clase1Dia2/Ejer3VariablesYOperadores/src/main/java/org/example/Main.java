package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Calcularemos el área de un triángulo");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime el valor de la base de su triángulo");
        double base = scanner.nextDouble();
        System.out.println("Digame cuanto vale la altura de su triángulo");
        double altura = scanner.nextDouble();

        double area = (base*altura)/2;

        System.out.printf("El área de su triángulo es: %.2f%n", area);
    }
}