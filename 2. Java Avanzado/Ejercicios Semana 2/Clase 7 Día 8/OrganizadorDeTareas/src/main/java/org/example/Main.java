package org.example;

import clase.Proyecto;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Proyecto proyecto = new Proyecto(1, "Proyecto: Desarrollo de Software");

        boolean continuar = true;
        while (continuar) {
            try {
                System.out.println("\nSelecciona una opción:");
                System.out.println("1. Agregar tarea principal al proyecto");
                System.out.println("2. Agregar subtarea a una tarea existente");
                System.out.println("3. Mostrar estructura de tareas");
                System.out.println("4. Salir");
                System.out.print("Opción: ");
                int opcion = scanner.nextInt();
                scanner.nextLine(); // Consumir el salto de línea después de leer un int

                switch (opcion) {
                    case 1:
                        System.out.print("Nombre de la tarea principal: ");
                        String nombreTareaPrincipal = scanner.nextLine();
                        Proyecto tareaPrincipal = new Proyecto(obtenerNuevoId(proyecto), nombreTareaPrincipal);
                        proyecto.getSubdirectorios().add(tareaPrincipal);
                        System.out.println("Tarea principal agregada correctamente al proyecto.");
                        break;
                    case 2:
                        if (proyecto.getSubdirectorios().isEmpty()) {
                            System.out.println("No hay tareas principales en el proyecto. Agrega una tarea principal primero.");
                        } else {
                            System.out.print("Selecciona el índice de la tarea principal: ");
                            int indiceTareaPrincipal = scanner.nextInt();
                            scanner.nextLine(); // Consumir el salto de línea después de leer un int
                            if (indiceTareaPrincipal < 0 || indiceTareaPrincipal >= proyecto.getSubdirectorios().size()) {
                                System.out.println("Índice de tarea principal no válido.");
                            } else {
                                Proyecto tareaPadre = proyecto.getSubdirectorios().get(indiceTareaPrincipal);
                                System.out.print("Nombre de la subtarea: ");
                                String nombreSubtarea = scanner.nextLine();
                                Proyecto subtarea = new Proyecto(obtenerNuevoId(proyecto), nombreSubtarea);
                                tareaPadre.getSubdirectorios().add(subtarea);
                                System.out.println("Subtarea agregada correctamente a la tarea principal.");
                            }
                        }
                        break;
                    case 3:
                        System.out.println("Estructura de tareas:");
                        System.out.println("");
                        mostrarMenus(proyecto, "");
                        break;
                    case 4:
                        continuar = false;
                        System.out.println("¡Hasta luego!");
                        break;
                    default:
                        System.out.println("Opción no válida.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Debes ingresar un número entero.");
                scanner.nextLine(); // Limpiar el búfer de entrada
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        scanner.close();
    }


    public static void mostrarMenus(Proyecto menu, String prefijo) {
        System.out.println(prefijo + menu.getDescripcion());
        for (Proyecto menuHijo : menu.getSubdirectorios()) {
            String nuevoPrefijo = prefijo + "|-- ";
            mostrarMenus(menuHijo, nuevoPrefijo); // Llamada recursiva con un nuevo prefijo
        }
    }

    public static int obtenerNuevoId(Proyecto proyecto) {
        int maxId = 0;
        for (Proyecto tareaPrincipal : proyecto.getSubdirectorios()) {
            if (tareaPrincipal.getId() > maxId) {
                maxId = tareaPrincipal.getId();
            }
            for (Proyecto subtarea : tareaPrincipal.getSubdirectorios()) {
                if (subtarea.getId() > maxId) {
                    maxId = subtarea.getId();
                }
            }
        }
        return maxId + 1;
    }
}
