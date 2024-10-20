package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Ventana ermegente con mas detalles de la pelicula
 */
public class VentanadeDetalle extends JDialog {
    private JPanel panel1;
    private JButton button1;
    private JLabel Titulo;
    private JLabel Director;
    private JLabel Descripcion;

    public VentanadeDetalle() {
        setContentPane(panel1);
        setModal(true);
        getRootPane().setDefaultButton(button1);
        setTitle( Session.peliculaSelected.getTitulo());
        setLocationRelativeTo(null);

        Titulo.setText(Session.peliculaSelected.getTitulo());
        Descripcion.setText(Session.peliculaSelected.getDescripcion());
        Director.setText(Session.peliculaSelected.getDirector());

        pack();

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });
    }

    private void onOK() {
        dispose();
    }
}
