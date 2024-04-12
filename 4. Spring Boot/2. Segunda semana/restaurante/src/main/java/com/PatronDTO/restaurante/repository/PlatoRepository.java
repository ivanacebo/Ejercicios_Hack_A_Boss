package com.PatronDTO.restaurante.repository;

import com.PatronDTO.restaurante.model.Ingrediente;
import com.PatronDTO.restaurante.model.Plato;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class PlatoRepository {

    @Autowired
    private IngredienteReporitory ingredienteReporitory;

    public List<Plato> listaPlatos() {
        File file = null;
        try {
            file = ResourceUtils.getFile("C:\\Users\\Ivan\\OneDrive\\Desktop\\Hack a Boss\\4. Spring Boot\\2. Segunda semana\\restaurante\\archivos\\platos.json");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null; // Devuelve null si no se puede cargar el archivo
        }

        ObjectMapper objectMapper = new ObjectMapper();
        List<Plato> platos = null;
        try {
            // Lee el archivo JSON como un array de objetos JSON
            JsonNode platosJson = objectMapper.readTree(file);

            // Inicializa la lista de platos
            platos = new ArrayList<>();

            // Itera sobre cada objeto JSON en el array
            for (JsonNode platoJson : platosJson) {
                // Obtiene el ID y el nombre del plato del objeto JSON
                int id = platoJson.get("id").asInt();
                String nombre = platoJson.get("nombre").asText();

                // Obtiene los IDs de los ingredientes del plato
                List<Integer> ingredientesIds = new ArrayList<>();
                for (JsonNode ingredienteIdJson : platoJson.get("ingredientes")) {
                    ingredientesIds.add(ingredienteIdJson.asInt());
                }

                // Obtiene los objetos de Ingrediente correspondientes a los IDs
                List<Ingrediente> ingredientes = new ArrayList<>();
                for (int ingredienteId : ingredientesIds) {
                    Ingrediente ingrediente = ingredienteReporitory.obtenerIngredientePorId(ingredienteId);
                    if (ingrediente != null) {
                        ingredientes.add(ingrediente);
                    }
                }

                // Crea el objeto Plato y lo agrega a la lista de platos
                Plato plato = new Plato(id, nombre, ingredientes);
                platos.add(plato);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return platos;
    }

}
