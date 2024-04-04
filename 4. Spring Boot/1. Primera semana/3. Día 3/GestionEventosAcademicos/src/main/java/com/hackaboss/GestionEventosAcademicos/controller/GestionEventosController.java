package com.hackaboss.GestionEventosAcademicos.controller;

import com.hackaboss.GestionEventosAcademicos.model.Evento;
import com.hackaboss.GestionEventosAcademicos.model.Participante;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/evento")
public class GestionEventosController {

    List<Evento> listaEventos =  new ArrayList<>();

    /**
     * Agregamos a una lista eventos
     * @param nuevoEvento JSON de evento a añadir
     * @return status de creado y JSON añadido
     */
    @PostMapping
    public ResponseEntity<Evento> crearEvento (@RequestBody Evento nuevoEvento) {
        listaEventos.add(nuevoEvento);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevoEvento);
    }

    /**
     * Mostramos la lista de todos los eventos
     * @return lista completa o lista vacia
     */
    @GetMapping
    public List<Evento> listaEventos () {
        if (listaEventos.isEmpty()) {
            return Collections.emptyList(); //Devolvemos una lista vacia
        } else {
            //Devolvemos la lista
            return listaEventos;
        }
    }

    /**
     * Filtramos la lista por un id en concreto
     * @param id recibimos el id a filtrar
     * @return evento con un determinado id
     */
    @GetMapping("/{id}")
    public Evento detalleEvento (@PathVariable Long id) {
        return listaEventos.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
