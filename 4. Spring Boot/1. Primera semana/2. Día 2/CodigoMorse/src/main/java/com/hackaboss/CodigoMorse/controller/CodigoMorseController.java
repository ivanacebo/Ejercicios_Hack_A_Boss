package com.hackaboss.CodigoMorse.controller;

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
     * localhost:8080/codigo?parametro=codigo para comprobar el resultado
     * @param parametro palabra del usuario para cambiar a codigo morse
     * @return frase donde compara la palabra y su codigo morse asociado
     */
    @GetMapping
    public String codigoMorse(@RequestParam String parametro) {
        StringBuilder codigoMorse = new StringBuilder();
        for (int i = 0; i < parametro.length(); i++) {
            char letra = parametro.charAt(i);
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
        return "La palabra " + parametro + " en código Morse es: " + codigoMorse.toString();
    }


}
