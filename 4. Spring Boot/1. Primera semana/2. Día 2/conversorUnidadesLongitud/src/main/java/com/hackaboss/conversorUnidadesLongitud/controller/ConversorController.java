package com.hackaboss.conversorUnidadesLongitud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/conversor")
public class ConversorController {

    /**
     * localhost:8080/conversor?parametro=163
     * convertimos cm en metros
     * @param parametro recibido los cm que se quieren convertir
     * @return un mensaje con el resultado
     */
    @GetMapping
    public String conversor (@RequestParam Double parametro) {
        Double convertir = parametro/100;
        return parametro + " Cm son " + convertir + " metros";
    }
}
