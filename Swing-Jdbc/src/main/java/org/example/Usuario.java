package org.example;


/**
 * Esta es la clase usuario.
 */

public class Usuario {
    private int id;
    private String nombreUsuario;
    private String contraseña;

    // Constructor
    public Usuario(int id, String nombreUsuario, String contraseña) {
        this.id = id;
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    // Método para cambiar la contraseña
    public void cambiarContraseña(String nuevaContraseña) {
        this.contraseña = nuevaContraseña;
        System.out.println("Contraseña actualizada con éxito.");
    }

    // Método para verificar la contraseña
    public boolean verificarContraseña(String contraseña) {
        return this.contraseña.equals(contraseña);
    }

    // Método toString para mostrar la información del usuario
    @Override
    public String toString() {
        return "ID: " + id + ", Nombre de usuario: " + nombreUsuario;
    }
}