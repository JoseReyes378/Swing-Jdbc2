package org.example;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Pantalla principal donde esta el listado de las peliculas
 */

public class PantallaPrincipal extends JFrame {
    private JPanel Panel;
    private JTable table1;
    private JButton VolveralLogin;
    private JButton cerrarLaAplicacionButton;
    private JLabel ListadodePeliculas;

    private DefaultTableModel model;

    public PantallaPrincipal() {

        String[] cabecera = {"Id","Titulo","Genero","Año","Descripcion","Director"};
        model = new DefaultTableModel(cabecera,0);
        table1.setModel(model);

        for(Pelicula g : Pantalla2.peliculas){
            Object[] row = { g.getId(),g.getTitulo(), g.getGenero(), g.getAño(), g.getDescripcion(), g.getDirector() };
            model.addRow(row);
        }

        setContentPane(Panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Listado de tus peliculas");
        pack();
        setLocationRelativeTo(null);

        table1.getSelectionModel().addListSelectionListener(
                (ListSelectionEvent e) -> {
                    if(e.getValueIsAdjusting()) return;
                    System.out.println( table1.getSelectedRow() );
                    var id = (Integer) model.getValueAt(table1.getSelectedRow(), 0);
                    var titulo = model.getValueAt(table1.getSelectedRow(), 1).toString();
                    var genero = model.getValueAt(table1.getSelectedRow(), 2).toString();
                    var año = (Integer) model.getValueAt(table1.getSelectedRow(), 3);
                    var descripcion = model.getValueAt(table1.getSelectedRow(), 4).toString();
                    var director = model.getValueAt(table1.getSelectedRow(), 5).toString();

                    System.out.println(id+" "+titulo+" "+genero+" "+año+" "+descripcion+" "+director);

                    Session.peliculaSelected = new Pelicula(id,titulo,genero,año,descripcion,director);

                    var info = new VentanadeDetalle();
                    info.setVisible(true);
                }
        );

        VolveralLogin.addActionListener((ActionEvent e)->{
            ((JFrame) SwingUtilities.getWindowAncestor(Panel)).dispose();
        });

        cerrarLaAplicacionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

}
