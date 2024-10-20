package org.example;

import lombok.Data;

/**
 * Copia de las peliculas
 */

@Data
public class CopiaPelicula {
    private int id;
    private int id_pelicula;
    private int id_usuario;
    private String estado;
    private String soporte;



    public CopiaPelicula(int id, int id_pelicula, int id_usuario, String estado, String soporte) {
        this.id = id;
        this.id_pelicula = id_pelicula;
        this.id_usuario = id_usuario;
        this.estado = estado;
        this.soporte = soporte;


    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_pelicula() {
        return id_pelicula;
    }

    public void setId_pelicula(int id_pelicula) {
        this.id_pelicula = id_pelicula;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getSoporte() {
        return soporte;
    }

    public void setSoporte(String soporte) {
        this.soporte = soporte;
    }

}


