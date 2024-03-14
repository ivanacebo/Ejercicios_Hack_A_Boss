package org.example;

import clase.Empleado;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Empleado> empleados = Arrays.asList(
                new Empleado("Empleado1", 1500.0, "Administrativo"),
                new Empleado("Empleado2", 1600.0, "Técnico"),
                new Empleado("Empleado3", 1700.0, "Gerente"),
                new Empleado("Empleado4", 1800.0, "Operario"),
                new Empleado("Empleado5", 1900.0, "Analista"),
                new Empleado("Empleado6", 2000.0, "Administrativo"),
                new Empleado("Empleado7", 2100.0, "Técnico"),
                new Empleado("Empleado8", 2200.0, "Gerente"),
                new Empleado("Empleado9", 2300.0, "Operario"),
                new Empleado("Empleado10", 2400.0, "Analista")
        );

        // Obtenemos la media de salarios para luego pintar los empleados que tengan mas salario que esta media.
        double mediaSalario = empleados.stream().mapToDouble(empleado -> empleado.getSalario()).average().orElse(0.00);
        System.out.println(" -- Empleados que tienen un salario mayor a la media -- ");
        empleados.stream().filter(p -> p.getSalario() > mediaSalario).forEach(System.out::println);

        // Agrupamos por categoira y obtenemos salario promedio de dicha categoria.
        System.out.println("");
        System.out.println("Empleados unidos por categoria y salario medio");
        Map<String, Double> salarioPromedioCategoria = empleados.stream().collect(Collectors
                .groupingBy(categoria -> categoria.getCategoria(), Collectors.averagingDouble(salario -> salario.getSalario())));

        salarioPromedioCategoria.forEach((categoria, salarioPromedio) -> {
            System.out.println("Categoria " + categoria + " Salario promedio " + salarioPromedio);
        });

        // Empleado con el salario mas alto
        System.out.println("");
        System.out.println("Empleado con el sueldo mas alto");
        System.out.println(empleados.stream().max(Comparator.comparing(Empleado::getSalario)).orElse(new Empleado()));

    }
}