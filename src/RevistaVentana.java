import javax.swing.*;
import java.awt.*;

public class RevistaVentana extends javax.swing.JFrame{
    private JComboBox comboBox1;
    private JLabel editoralLB;
    private JLabel autorLB;
    private JLabel nombreLB;
    private JPanel panelGeneral;

    public RevistaVentana() {
        setTitle("Revistas");
        add(panelGeneral);
        setSize(400, 300);
        setMinimumSize(new Dimension(250, 200));
    }
}
