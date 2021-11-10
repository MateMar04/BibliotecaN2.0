import javax.swing.*;

public class BibliotecaVentana extends javax.swing.JFrame {
    private JButton verLibrosButton;
    private JButton verRevistasButton;
    private JButton verClientesButton;
    private JPanel panelGeneral;

    public BibliotecaVentana() {
        setTitle("Biblioteca");
        add(panelGeneral);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
