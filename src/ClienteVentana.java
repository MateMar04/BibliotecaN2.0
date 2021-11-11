import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;

public class ClienteVentana extends javax.swing.JFrame {
    private JComboBox clientesCB;
    private JLabel nombreLB;
    private JLabel telefonoLB;
    private JLabel mailLB;
    private JLabel direccionLB;
    private JPanel panelGeneral;
    private JLabel prestamosLB;

    public ClienteVentana(Biblioteca biblioteca) {
        setTitle("Clientes");
        add(panelGeneral);
        setSize(400, 300);
        setMinimumSize(new Dimension(250, 200));

        Vector comboBoxItems = new Vector();
        ArrayList<Cliente> clientes = biblioteca.getClientes();

        for (Cliente cliente : clientes) {
            comboBoxItems.add(cliente.getNombre());
        }

        clientesCB.setModel(new DefaultComboBoxModel(comboBoxItems));
        clientesCB.setSelectedIndex(-1);


        clientesCB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Cliente cliente = clientes.get(clientesCB.getSelectedIndex());
                nombreLB.setText(cliente.getNombre());
                direccionLB.setText(cliente.getDireccion().toString());
                telefonoLB.setText(cliente.getTelefono());
                mailLB.setText(cliente.getMail());

                ArrayList prestamos = new ArrayList();

                for (Prestamo prestamo : biblioteca.getPrestamos()) {
                    ArrayList<Publicacion> publicaciones = prestamo.getPublicaciones();
                    if (prestamo.getCliente() == cliente) {
                        for (Publicacion publicacion : publicaciones) {
                            prestamos.add(publicacion.getTitulo());
                        }
                    }

                }
                prestamosLB.setText(prestamos.toString());
            }
        });
    }
}
