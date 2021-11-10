import javax.swing.*;

public class BibliotecaVentana extends javax.swing.JFrame {
    private JButton verLibrosButton;
    private JButton verRevistasButton;
    private JButton verClientesButton;
    private JPanel panelGeneral;
    private JLabel cantLibrosLB;
    private JLabel cantRevistasLB;
    private JLabel cantPublicacionesLB;

    public BibliotecaVentana() {
        setTitle("Biblioteca");
        add(panelGeneral);
        setSize(400, 400);
        setResizable(false);
    }
}
