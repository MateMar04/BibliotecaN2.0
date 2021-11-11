import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class BibliotecaVentana extends javax.swing.JFrame {
    private JButton verLibrosButton;
    private JButton verRevistasButton;
    private JButton verClientesButton;
    private JPanel panelGeneral;
    private JLabel cantLibrosLB;
    private JLabel cantRevistasLB;
    private JLabel cantPublicacionesLB;

    public BibliotecaVentana(Biblioteca biblioteca) {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Biblioteca");
        add(panelGeneral);
        setSize(400, 300);
        setMinimumSize(new Dimension(350, 200));

        cantLibrosLB.setText(String.valueOf(biblioteca.cantLibros()));
        cantRevistasLB.setText(String.valueOf(biblioteca.cantRevistas()));
        cantPublicacionesLB.setText(String.valueOf(biblioteca.cantPublicaciones()));


        verLibrosButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                new LibroVentana().setVisible(true);
            }
        });
        verRevistasButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                new RevistaVentana().setVisible(true);
            }
        });
        verClientesButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                new ClienteVentana(biblioteca).setVisible(true);
            }
        });
    }
}
