package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Esta es la clase Pelicula
 */
@AllArgsConstructor
@Data
public class Pelicula {
    private int id;
    private String titulo;
    private String genero;
    private int año;
    private String descripcion;
    private String director;
}