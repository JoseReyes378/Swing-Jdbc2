package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Clase para poder iniciar sesion
 */

public class Login extends JFrame {
    private JTextField txtUsuario;
    private JPasswordField txtContrasena;
    private JButton IniciarSesion;
    private JButton Cerrar;
    private JLabel Usuario;
    private JLabel Contraseña;

    public Login() {
        // Configuración de la ventana
        setTitle("Inicio de Sesión");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centrar la ventana
        setLayout(new GridLayout(3, 2, 10, 10)); // Establece el layout de la ventana

        // Inicialización de componentes
        Usuario = new JLabel("Usuario:");
        txtUsuario = new JTextField();
        Contraseña = new JLabel("Contraseña:");
        txtContrasena = new JPasswordField();
        IniciarSesion = new JButton("IniciarSesion");
        Cerrar = new JButton("Cerrar");

        // Agregar componentes a la ventana
        add(Usuario);
        add(txtUsuario);
        add(Contraseña);
        add(txtContrasena);
        add(IniciarSesion);
        add(Cerrar);

        // Acciones para los botones
        IniciarSesion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = txtUsuario.getText();
                String contrasena = new String(txtContrasena.getPassword());

                // Verificar las credenciales
                if (usuario.equals("juanperez") && contrasena.equals("password123")) {
                    var info = new PantallaPrincipal();
                    info.setVisible(true);
                } else if (usuario.equals("mariagonzalez") && contrasena.equals("mypassword")) {
                    var info = new PantallaPrincipal();
                    info.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        Cerrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });


    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Login login = new Login();
            login.setVisible(true);
        });
    }
}