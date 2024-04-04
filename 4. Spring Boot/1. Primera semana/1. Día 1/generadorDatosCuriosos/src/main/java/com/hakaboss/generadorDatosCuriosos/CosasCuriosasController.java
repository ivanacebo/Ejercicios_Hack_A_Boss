package com.hakaboss.generadorDatosCuriosos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

@RestController
public class CosasCuriosasController {

    private final List<String> curiosidades = List.of(
            "Los delfines tienen la capacidad de reconocer y recordar estos silbidos específicos incluso después de mucho tiempo",
            "Las hormigas son capaces de llevar objetos que son hasta 50 veces su propio peso",
            "Los elefantes son los únicos mamíferos que no pueden saltar",
            "Las cebras tienen rayas únicas, al igual que las huellas dactilares de los humanos",
            "El pulpo tiene tres corazones",
            "Los pingüinos pueden tener solo un compañero de vida",
            "Los camellos tienen párpados gruesos y largas pestañas para proteger sus ojos del viento y la arena",
            "Los koalas tienen huellas dactilares similares a las de los humanos",
            "El ojo del avestruz es más grande que su cerebro",
            "Los flamencos nacen con plumas grises y obtienen su color rosa de su dieta",
            "Los gorilas pueden comunicarse utilizando más de 20 señales vocales diferentes",
            "Los murciélagos pueden vivir hasta 30 años"
    );

    /**
     * Se entra aqui con http://localhost:8080/curiosidades
     * @return de forma aleatoria una curiosidad
     */
    @GetMapping("/curiosidades")
    public String obtenerCuriosidades () {
        Random random = new Random();
        return curiosidades.get(random.nextInt(curiosidades.size()));
    }

}
