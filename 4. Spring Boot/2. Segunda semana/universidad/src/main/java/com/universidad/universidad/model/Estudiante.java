package com.universidad.universidad.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.text.DateFormat;

@Data
@Getter @Setter
@AllArgsConstructor
public class Estudiante {

    private String numeroMatricula;
    private String nombre;
    private String apellido;
    private String fechaNacimiento;
}
