import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;

public class RevistaVentana extends javax.swing.JFrame {
    private JComboBox revistasCB;
    private JLabel editoralLB;
    private JLabel autorLB;
    private JLabel nombreLB;
    private JPanel panelGeneral;

    public RevistaVentana(Biblioteca biblioteca) {
        setTitle("Revistas");
        add(panelGeneral);
        setSize(400, 300);
        setMinimumSize(new Dimension(250, 200));

        ArrayList<Revista> revistas = biblioteca.getRevistas();
        Vector comboBoxItems = new Vector();
        for (Revista r : revistas) {
            comboBoxItems.add(r.getTitulo());
        }
        revistasCB.setModel(new DefaultComboBoxModel(comboBoxItems));
        revistasCB.setSelectedIndex(-1);
        revistasCB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Revista revista = revistas.get(revistasCB.getSelectedIndex());
                nombreLB.setText(revista.getTitulo());
                autorLB.setText(revista.getAutor().toString());
                editoralLB.setText(revista.getEditorial().toString());
            }
        });
    }
}
