package org.example;

import clase.Directorio;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Directorio menuPrincipal = new Directorio(1, "DIRECTORIO PRINCIPAL");

        List<Directorio> listMenus1 = Arrays.asList(
                new Directorio(2, "DIRECTORIO -> Nivel 1"),
                new Directorio(3, "DIRECTORIO -> Nivel 1"),
                new Directorio(4, "DIRECTORIO -> Nivel 1")
        );
        menuPrincipal.setSubdirectorios(listMenus1);

        List<Directorio> listMenus2 = Arrays.asList(
                new Directorio(5, "SUBDIRECTORIO 1 -> Nivel 2"),
                new Directorio(6, "SUBDIRECTORIO 2 -> Nivel 2")
        );
        menuPrincipal.getSubdirectorios().get(0).setSubdirectorios(listMenus2);

        List<Directorio> listMenus3 = Arrays.asList(
                new Directorio(7, "SUBDIRECTORIO 1 -> Nivel 2")
        );
        menuPrincipal.getSubdirectorios().get(1).setSubdirectorios(listMenus3);

        List<Directorio> listMenus21 = Arrays.asList(
                new Directorio(8, "SUB -SUBDIRECTORIO -> Nivel 3")
        );
        menuPrincipal.getSubdirectorios().get(1).getSubdirectorios().get(0).setSubdirectorios(listMenus21);
        menuPrincipal.getSubdirectorios().get(0).getArchivos().add("archivo1.txt");
        menuPrincipal.getSubdirectorios().get(0).getArchivos().add("archivo2.txt");
        menuPrincipal.getSubdirectorios().get(0).getSubdirectorios().get(0).getArchivos().add("archivo3.txt");

        mostrarDirectorios(menuPrincipal,"");

    }

    public static void mostrarDirectorios(Directorio menu, String prefijo) {
        System.out.println(prefijo + menu.getDescripcion());

        for (Directorio menuHijo : menu.getSubdirectorios()) {
            String nuevoPrefijo = prefijo + "|-- ";
            mostrarDirectorios(menuHijo, nuevoPrefijo); // Llamada recursiva con un nuevo prefijo
        }

        for (String archivo : menu.getArchivos()) {
            System.out.println(prefijo + "|   |-- " + archivo);
        }
    }

}