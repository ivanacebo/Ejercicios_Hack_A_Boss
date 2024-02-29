package org.example;

import clases.Producto;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Producto> productos = new ArrayList<>();

        Producto producto1 = new Producto(1, "Camisa", "Nike", "Ropa", 20.0, 40.0, 50);
        Producto producto2 = new Producto(2, "Pantalón", "Adidas", "Ropa", 30.0, 60.0, 30);
        Producto producto3 = new Producto(3, "Zapatillas", "Reebok", "Calzado", 50.0, 100.0, 20);
        Producto producto4 = new Producto(4, "Gorra", "New Era", "Accesorio", 15.0, 30.0, 100);
        Producto producto5 = new Producto(5, "Bolso", "Puma", "Accesorio", 25.0, 50.0, 40);
        Producto producto6 = new Producto(6, "Reloj", "Casio", "Accesorio", 40.0, 80.0, 15);
        Producto producto7 = new Producto(7, "Calcetines", "Under Armour", "Ropa", 10.0, 20.0, 80);
        Producto producto8 = new Producto(8, "Chaqueta", "North Face", "Ropa", 80.0, 160.0, 25);
        Producto producto9 = new Producto(9, "Gafas de sol", "Ray-Ban", "Accesorio", 60.0, 120.0, 35);
        Producto producto10 = new Producto(10, "Mochila", "JanSport", "Accesorio", 35.0, 70.0, 60);


        productos.add(producto1);
        productos.add(producto2);
        productos.add(producto3);
        productos.add(producto4);
        productos.add(producto5);
        productos.add(producto6);
        productos.add(producto7);
        productos.add(producto8);
        productos.add(producto9);
        productos.add(producto10);

        Producto productoMayorPrecioVenta = productos.get(0);
        Producto productoMenorPrecioCosto = productos.get(0);
        Producto productoMayorStock = productos.get(0);

        for (Producto producto : productos) {
            if (producto.getPrecioVenta() > productoMayorPrecioVenta.getPrecioVenta()) {
                productoMayorPrecioVenta = producto;
            } else if (producto.getPrecioCosto() < productoMenorPrecioCosto.getPrecioCosto()) {
                productoMenorPrecioCosto = producto;
            } else if (producto.getCantidadStock() > productoMayorStock.getCantidadStock()) {
                productoMayorStock = producto;
            }
        }

        System.out.println("El producto con mayor precio de venta es: " + productoMayorPrecioVenta.getNombre());
        System.out.println("El producto con menor precio de costo es: " + productoMenorPrecioCosto.getNombre());

        System.out.println("Borramos el producto de la posición 5. (empieza desde 0)");
        productos.remove(4);

        System.out.println("El producto " + productoMayorStock.getNombre() + " tiene como stock " + productoMayorStock.getCantidadStock());
        int nuevoStock = productoMayorStock.getCantidadStock() - 3;
        productoMayorStock.setCantidadStock(nuevoStock);
        System.out.println("El producto con mayor cantidad de stock es: " + productoMayorStock.getNombre() + ". Su nuevo stock es: " + nuevoStock);
    }
}