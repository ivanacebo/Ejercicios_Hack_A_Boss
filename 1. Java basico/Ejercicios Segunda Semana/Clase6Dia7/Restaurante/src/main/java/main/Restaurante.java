package main;

import java.util.List;
import main.logica.Controladora;
import main.logica.Plato;

public class Restaurante {

    public static void main(String[] args) {
        
        Plato plato1 = new Plato("Pasta Carbonara", "Cocinar la pasta al dente y mezclar con una salsa de huevo, queso parmesano, panceta y pimienta negra", 18.50);
        Plato plato2 = new Plato("Filete Mignon con puré de papas", "Sellar el filete mignon en una sartén caliente y acompañarlo con un puré de papas cremoso", 24.99);
        Plato plato3 = new Plato("Sushi Variado", "Preparar una selección de sushi con arroz, pescado fresco, aguacate y algas nori", 18.50);
        Plato plato4 = new Plato("Ensalada César con Pollo", "Mezclar lechuga romana, crutones, queso parmesano y aderezo césar, añadiendo trozos de pollo a la parrilla", 18.50);
        Plato plato5 = new Plato("Paella Marinera", "Cocinar arroz con mariscos, pimientos, azafrán y guisantes en un caldo de pescado aromático", 20.25);

        Controladora control = new Controladora();

        // Alta platos en base de datos
        System.out.println("Platos creados");
        control.crearPlato(plato1);
        control.crearPlato(plato2);
        control.crearPlato(plato3);
        control.crearPlato(plato4);
        control.crearPlato(plato5);

        // Eliminar el plato con id:2
        System.out.println("Plato eliminado");
        control.eliminarPlato(2);

        // Ver datos de la base de datos
        List<Plato> platos = control.traerPlatos();
        for (Plato platillos : platos) {
            System.out.println(platillos.toString());
        }

        System.out.println("Plato modificado");
        Plato plato = control.traerPlato(5);
        plato.setPrecio(19.52);
        control.editarPlato(plato);
        
        Plato verCambio = control.traerPlato(5);
        System.out.println(verCambio.toString());
        
        System.out.println("");
        System.out.println("Buscar platos por precio consulta");
        List<Plato> platosPorPrecio = control.buscarPlatoPrecio(18.50);
        for (Plato pla : platosPorPrecio){
            System.out.println(pla.toString());
        }
    }
}
