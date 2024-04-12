package com.PatronDTO.restaurante.repository;

import com.PatronDTO.restaurante.model.Ingrediente;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

@Repository
public class IngredienteReporitory {

    private List<Ingrediente> ingredientes; // Definición de la variable ingredientes

    public IngredienteReporitory() {
        cargarIngredientesDesdeArchivo();
    }

    private void cargarIngredientesDesdeArchivo() {
        File file = new File("C:\\Users\\Ivan\\OneDrive\\Desktop\\Hack a Boss\\4. Spring Boot\\2. Segunda semana\\restaurante\\archivos\\ingredients.json");
        ObjectMapper objectMapper = new ObjectMapper();
        TypeReference<List<Ingrediente>> typeRef = new TypeReference<>() {};
        try {
            ingredientes = objectMapper.readValue(file, typeRef);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Ingrediente> listaIngredientes() {
        return ingredientes;
    }

    public Ingrediente obtenerIngredientePorId(int id) {
        for (Ingrediente ingrediente : ingredientes) {
            if (ingrediente.getId() == id) {
                return ingrediente;
            }
        }
        return null;
    }
}
