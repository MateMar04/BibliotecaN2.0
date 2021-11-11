import javax.swing.*;
import java.awt.*;

public class LibroVentana extends javax.swing.JFrame {
    private JComboBox librosCB;
    private JLabel nombreLB;
    private JLabel autorLB;
    private JLabel editorialLB;
    private JPanel panelGeneral;

    public LibroVentana() {
        setTitle("Libros");
        add(panelGeneral);
        setSize(400, 300);
        setMinimumSize(new Dimension(250, 200));
    }
}
