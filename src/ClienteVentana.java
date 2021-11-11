import javax.swing.*;
import java.awt.*;

public class ClienteVentana extends javax.swing.JFrame {
    private JComboBox clientesCB;
    private JLabel nombreLB;
    private JLabel telefonoLB;
    private JLabel mailLB;
    private JLabel direccionLB;
    private JPanel panelGeneral;

    public ClienteVentana() {
        setTitle("Clientes");
        add(panelGeneral);
        setSize(400, 300);
        setMinimumSize(new Dimension(250, 200));
    }
}
