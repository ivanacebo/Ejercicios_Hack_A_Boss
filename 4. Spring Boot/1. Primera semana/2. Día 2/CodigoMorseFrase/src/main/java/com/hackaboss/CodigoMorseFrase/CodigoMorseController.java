package com.hackaboss.CodigoMorseFrase;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/codigo")
public class CodigoMorseController {

    // Lista valores codigo morse con mapa clave / valor
    private static final Map<String, Character> morseMap = Map.ofEntries(
            Map.entry(".-", 'A'), Map.entry("-...", 'B'), Map.entry("-.-.", 'C'), Map.entry("-..", 'D'),
            Map.entry(".", 'E'), Map.entry("..-.", 'F'), Map.entry("--.", 'G'), Map.entry("....", 'H'),
            Map.entry("..", 'I'), Map.entry(".---", 'J'), Map.entry("-.-", 'K'), Map.entry(".-..", 'L'),
            Map.entry("--", 'M'), Map.entry("-.", 'N'), Map.entry("---", 'O'), Map.entry(".--.", 'P'),
            Map.entry("--.-", 'Q'), Map.entry(".-.", 'R'), Map.entry("...", 'S'), Map.entry("-", 'T'),
            Map.entry("..-", 'U'), Map.entry("...-", 'V'), Map.entry(".--", 'W'), Map.entry("-..-", 'X'),
            Map.entry("-.--", 'Y'), Map.entry("--..", 'Z'), Map.entry("-----", '0'), Map.entry(".----", '1'),
            Map.entry("..---", '2'), Map.entry("...--", '3'), Map.entry("....-", '4'), Map.entry(".....", '5'),
            Map.entry("-....", '6'), Map.entry("--...", '7'), Map.entry("---..", '8'), Map.entry("----.", '9')
    );

    private String buscarCodigoMorse(char caracter) {
        String codigo = null;
        for (Map.Entry<String, Character> entry : morseMap.entrySet()) {
            if (entry.getValue() == caracter) {
                codigo = entry.getKey();
                break;
            }
        }
        return codigo;
    }

    /**
     * localhost:8080/codigo?parametro=codigo java para comprobar el resultado
     * Codigo morse a traves de una frase
     * @param parametro frase del usuario para cambiarla a codigo morse
     * @return frase comparando la frase y el codigo morse
     */
    @GetMapping
    public String codigoMorse(@RequestParam String parametro) {
        StringBuilder codigoMorse = new StringBuilder();
        String[] palabras = parametro.split(" "); // Dividir el parámetro en palabras

        for (String palabra : palabras) {
            for (int i = 0; i < palabra.length(); i++) {
                char letra = palabra.charAt(i);
                if (Character.isLetter(letra)) {
                    letra = Character.toUpperCase(letra);
                    String codigo = buscarCodigoMorse(letra);
                    if (codigo != null) {
                        codigoMorse.append(codigo).append(" ");
                    }
                } else if (Character.isDigit(letra)) {
                    String codigo = buscarCodigoMorse(letra);
                    if (codigo != null) {
                        codigoMorse.append(codigo).append(" ");
                    }
                }
            }
            // Agregar tres espacios en blanco entre palabras
            codigoMorse.append("   ");
        }

        // Eliminar el último espacio en blanco si existe
        if (codigoMorse.length() > 0 && codigoMorse.charAt(codigoMorse.length() - 1) == ' ') {
            codigoMorse.deleteCharAt(codigoMorse.length() - 1);
        }

        return "La frase " + parametro + " en código Morse es: " + codigoMorse.toString();
    }

}
