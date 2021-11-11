import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;

public class LibroVentana extends javax.swing.JFrame {
    private JComboBox librosCB;
    private JLabel nombreLB;
    private JLabel autorLB;
    private JLabel editorialLB;
    private JPanel panelGeneral;

    public LibroVentana(Biblioteca biblioteca) {
        setTitle("Libros");
        add(panelGeneral);
        setSize(400, 300);
        setMinimumSize(new Dimension(250, 200));

        ArrayList<Libro> libros = biblioteca.getLibros();
        Vector comboBoxItems = new Vector();
        for (Libro l : libros) {
            comboBoxItems.add(l.getTitulo());
        }
        librosCB.setModel(new DefaultComboBoxModel(comboBoxItems));
        librosCB.setSelectedIndex(-1);


        librosCB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (librosCB.getSelectedIndex() != -1) {
                    Libro libro = libros.get(librosCB.getSelectedIndex());
                    nombreLB.setText(libro.getTitulo());
                    autorLB.setText(libro.getAutor().toString());
                    editorialLB.setText(libro.getEditorial().toString());
                }
            }
        });
    }
}
