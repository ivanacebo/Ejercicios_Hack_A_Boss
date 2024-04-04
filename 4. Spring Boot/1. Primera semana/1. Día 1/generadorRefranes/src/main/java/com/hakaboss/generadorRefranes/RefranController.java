package com.hakaboss.generadorRefranes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

@RestController
public class RefranController {

    private final List<String> refranes = List.of(
            "No hay mal que por bien no venga",
            "Al que madruga Dios lo ayuda",
            "A quien madruga, Dios le ayuda",
            "Más vale tarde que nunca",
            "No dejes para mañana lo que puedas hacer hoy",
            "En boca cerrada no entran moscas",
            "Más vale prevenir que lamentar",
            "La unión hace la fuerza",
            "El que mucho abarca, poco aprieta",
            "Camarón que se duerme se lo lleva la corriente"
    );

    /**
     * Se accede a http://localhost:8080/refran
     * @return un refrán de forma aleatoria
     */
    @GetMapping("/refran")
    public String obtenerRefranes () {
        Random random = new Random();
        return refranes.get(random.nextInt(refranes.size()));
    }

}
