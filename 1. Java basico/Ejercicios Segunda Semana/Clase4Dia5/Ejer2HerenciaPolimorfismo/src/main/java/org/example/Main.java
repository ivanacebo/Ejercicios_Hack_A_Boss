package org.example;

import clase.*;

public class Main {
    public static void main(String[] args) {

        Vestimenta[] vestimenta = {
                new Zapato(1, "Zapato Casual", 59.99, "Nike", "42", "Negro", "Cuero", "Cordones"),
                new Zapato(2, "Zapato Deportivo", 79.99, "Adidas", "41", "Blanco", "Malla", "Velcro"),
                new Zapato(3, "Zapatilla Urbana", 49.99, "Puma", "40", "Azul", "Textil", "Elástico"),
                new Pantalon(4, "Pantalón Vaquero", 39.99, "Levi's", "M", "Azul", "Recto", "Denim"),
                new Pantalon(5, "Pantalón Deportivo", 29.99, "Under Armour", "L", "Gris", "Jogger", "Algodón"),
                new Pantalon(6, "Pantalón Cargo", 44.99, "Dickies", "S", "Verde", "Slim Fit", "Poliéster"),
                new Camiseta(7, "Camiseta Básica", 14.99, "H&M", "L", "Blanco", "Corta", "Redondo"),
                new Camiseta(8, "Camiseta Estampada", 19.99, "Zara", "XL", "Negro", "Larga", "V"),
                new Camiseta(9, "Camiseta Polo", 24.99, "Ralph Lauren", "M", "Rojo", "Corta", "Polo"),
                new Sombrero(10, "Gorra Trucker", 24.99, "New Era", "Única", "Azul", "Gorra", "Ajustable"),
                new Sombrero(11, "Sombrero Panamá", 39.99, "Brixton", "L", "Beige", "Sombrero", "59 cm"),
                new Sombrero(12, "Gorra Snapback", 29.99, "Mitchell & Ness", "Única", "Negro", "Gorra", "Ajustable")
        };

        for (int i=0; i < vestimenta.length; i++) {
            vestimenta[i].mostrar();
        }

    }
}