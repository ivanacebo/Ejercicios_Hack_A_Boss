package org.example;

import clase.Evento;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Evento> eventos = Arrays.asList(
                new Evento("Evento 1", LocalDate.of(2024, 3, 27), "Reunion"),
                new Evento("Evento 2", LocalDate.of(2024, 3, 15), "Conferencia"),
                new Evento("Evento 3", LocalDate.of(2024, 4, 27), "Taller"),
                new Evento("Evento 4", LocalDate.of(2024, 4, 27), "Reunion"),
                new Evento("Evento 5", LocalDate.of(2024, 4, 27), "Taller"),
                new Evento("Evento 6", LocalDate.of(2024, 3, 12), "Conferencia"),
                new Evento("Evento 7", LocalDate.of(2024, 3, 15), "Reunion"),
                new Evento("Evento 8", LocalDate.of(2024, 3, 15), "Taller"),
                new Evento("Evento 9", LocalDate.of(2024, 5, 27), "Reunion"),
                new Evento("Evento 10", LocalDate.of(2024, 3, 14), "Conferencia"),
                new Evento("Evento 11", LocalDate.of(2024, 3, 22), "Reunion"),
                new Evento("Evento 12", LocalDate.of(2024, 3, 24), "Taller"),
                new Evento("Evento 13", LocalDate.of(2024, 3, 22), "Conferencia"),
                new Evento("Evento 14", LocalDate.of(2024, 3, 24), "Reunion")
        );

        LocalDate fechaEspecifica = LocalDate.of(2024, 4, 27);

        System.out.println("Eventos en un dia determinado");
        eventos.stream()
                .filter(evento -> evento.getFecha().isEqual(fechaEspecifica))
                .forEach(System.out::println);

        System.out.println("");
        System.out.println("Evento agrupado por categoria y contamos cuantos eventos hay ");
        eventos.stream()
                .collect(Collectors.groupingBy(Evento::getCategoria, Collectors.counting()))
                .forEach((categoria, cantidad) -> System.out.println(categoria + " : " + cantidad));

        System.out.println("");
        System.out.println("Evento más próximo en el tiempo");
        eventos.stream()
                .min(Comparator.comparing(Evento::getFecha))
                .ifPresentOrElse(
                        evento -> System.out.println("El evento más próximo es: " + evento),
                        () -> System.out.println("No hay eventos próximos")
                );
    }
}