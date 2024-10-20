package org.example;

import java.util.ArrayList;

/**
 * Aqui es donde se almacena las peliculas
 */

public class Pantalla2 {
    public static ArrayList<Pelicula> peliculas;

    static {
        peliculas = new ArrayList<>();
        peliculas.add(new Pelicula(1,"Origen","Sci-Fi",2010,"Un ladrón que roba secretos corporativos a través del uso de la tecnología de compartir sueños recibe una oportunidad para borrar su historial criminal.","Christopher Nolan"));
        peliculas.add(new Pelicula(2,"Matrix", "Acción",1999,"Un hacker de ordenadores aprende de rebeldes misteriosos sobre la verdadera naturaleza de su realidad y su papel en la guerra contra sus controladores.","Lana Wachowski"));
        peliculas.add(new Pelicula(3,"Interstellar", "Sci-Fi",2014,"Un equipo de exploradores viaja a través de un agujero de gusano en el espacio en un intento de asegurar la supervivencia de la humanidad.","Christopher Nolan"));
        peliculas.add(new Pelicula(4,"Star Wars: Episodio IV - Una nueva esperanza", "Sci-Fi",1977,"Un joven granjero se une a una rebelión contra un imperio galáctico tiránico.","George Lucas"));
    }
}
