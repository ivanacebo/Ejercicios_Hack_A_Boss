package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {

        /*
        CREATE DATABASE IF NOT EXISTS universidad;

        USE universidad;

        CREATE TABLE IF NOT EXISTS estudiantes (
            id INT AUTO_INCREMENT PRIMARY KEY,
            nombre VARCHAR(100) NOT NULL,
            edad INT NOT NULL,
            calificacion FLOAT NOT NULL
        );
         */

        String url = "jdbc:mysql://localhost:3306/universidad";
        String usuario = "root";
        String contrasena = "";

        try {
            Connection conexion = DriverManager.getConnection(url, usuario, contrasena);
            System.out.println("Conexión establecida");

            Statement statement = conexion.createStatement();
            String insertar = "INSERT INTO estudiantes (nombre, edad, calificacion) VALUES ('Ramon', 28, 8.5)";
            String insertar1 = "INSERT INTO estudiantes (nombre, edad, calificacion) VALUES ('Jacoba', 22, 6.5)";
            String insertar2= "INSERT INTO estudiantes (nombre, edad, calificacion) VALUES ('Roque', 32, 9.5)";

            int filasAfectadas = statement.executeUpdate(insertar);
            int filasAfectadas1 = statement.executeUpdate(insertar1);
            int filasAfectadas2= statement.executeUpdate(insertar2);

            if (filasAfectadas > 0 && filasAfectadas1 > 0 && filasAfectadas2 > 0) {
                System.out.println("Se insertó correctamente");
            } else {
                System.out.println("No se pudo insertar.");
            }

            String sql = "Select * from estudiantes";
            ResultSet resultado = statement.executeQuery(sql);

            while (resultado.next()) {
                int id = resultado.getInt("id");
                String nombre = resultado.getString("nombre");
                int edad = resultado.getInt("edad");
                float calificacion = resultado.getFloat("calificacion");

                System.out.println("ID: " + id + ". El estudiante " + nombre + " con " + edad + " años tiene como calificación " + calificacion);
            }

            resultado.close();
            statement.close();
            conexion.close();

        } catch (Exception e) {
            System.out.println("Error. No conseguimos conectar");
            e.printStackTrace();
        }

    }
}



