package classes;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class GUIListaClientes extends JFrame {
    private JPanel listaClientesPanel;
    private JTable table1;
    private JTextField buscarTF;
    private JButton buscarClienteButton;
    private DefaultTableModel model;
    private String title;
    private String nombre;
    private String apellido;
    private String nombreEmpresa;
    private String telefono;
    private String cuil;
    private String mail;
    private String ciudad;
    private String direccion;
    private JScrollBar scrollbar;
    private int ID;

    GUIRegistrarCliente reg = new GUIRegistrarCliente(title);

    public GUIListaClientes(String title) {
        super(title);
        initScreen();
        initComponents();
        pack();
        setVisible(true);
    }

    private void initScreen() {
        this.setContentPane(listaClientesPanel);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.setMinimumSize(new Dimension(1200, 768));
        this.setMaximumSize(new Dimension(1200, 768));
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    private void initComponents() {
        scrollbar = new JScrollBar();
        Object[] columns = {"ID", "Nombres", "Apellidos", "Nombre de la Empresa", "Número de Teléfono"
                , "CUIL", "E-Mail", "Ciudad", "Dirección"};
        model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        table1.setModel(model);
        table1.add(scrollbar);
    }
}

