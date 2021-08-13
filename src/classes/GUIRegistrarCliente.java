package classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

import static com.sun.deploy.uitoolkit.ToolkitStore.dispose;
import static jdk.nashorn.internal.objects.NativeError.printStackTrace;
//TODO: change jpanel for jframe
public class GUIRegistrarCliente extends JFrame {

    public GUIRegistrarCliente(String  title) {
        buttonListeners();
        initScreen();
        setVisible(true);
    }

    public void buttonListeners() {
        cancelarButton.addActionListener(e -> {
            try {
                dispose();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        });

        registrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO pass variables to database, if there's no row avaliable, create one.
                try {
                    insert(id, nombre, apellido, nombreEmpresa, telefono, cuil, mail, ciudad, direccion);
                    JOptionPane.showMessageDialog(null, "Se ha registrado el cliente.");
                } catch (SQLException exception) {
                    printStackTrace(exception);
                }
                //cleanTextFields();
            }
        });
    }

    private void cleanTextFields() {
        telefonoTF.setText("");
        apellidoTF.setText("");
        cuilTF.setText("");
        mailTF.setText("");
        nombreTF.setText("");
        nombreEmpresaTF.setText("");
        ciudadTF.setText("");
        direccionTF.setText("");
    }

    private void initScreen() {
this.add(registrarClientePanel);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.setMinimumSize(new Dimension(500, 400));
        this.setMaximumSize(new Dimension(500, 400));
        this.setResizable(false);
        this.setUndecorated(true);
        this.setLocationRelativeTo(null);
    }

    private void getText(){
        nombre = nombreTF.getText();
        apellido = apellidoTF.getText();
        nombreEmpresa = nombreEmpresaTF.getText();
        telefono = telefonoTF.getText();
        cuil = cuilTF.getText();
        mail = mailTF.getText();
        ciudad = ciudadTF.getText();
        direccion = direccionTF.getText();
    }

    public void insert(int id, String nombre, String apellido, String nombreEmpresa, String telefono,
                       String cuil, String mail, String ciudad, String direccion) throws SQLException {
        id = 1;
        getText();
        if (nombre != null || apellido != null) {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/facturando", "root", "");
            Statement statement = connection.createStatement();
            statement.executeUpdate("INSERT INTO clientes(ID, nombres, apellidos, nombreEmpresa, numeroTelefono, cuil, email," +
                    "ciudad, direccion) VALUES('"+id+"','"+nombre+"','"+apellido+"','"+nombreEmpresa+"','"+telefono+"','"+cuil+"" +
                    "','"+mail+"','"+ciudad+"','"+direccion+")");
                    id++;
        } else {
            JOptionPane.showMessageDialog(null, "El nombre y el apellido son obligatorios");
        }
    }

    //Var Declaration
    private int id;
    private JPanel registrarClientePanel;
    private JTextField nombreTF;
    private JTextField apellidoTF;
    private JTextField nombreEmpresaTF;
    private JTextField telefonoTF;
    private JTextField cuilTF;
    private JTextField mailTF;
    private JTextField ciudadTF;
    private JTextField direccionTF;
    private String nombre;
    private String apellido;
    private String nombreEmpresa;
    private String telefono;
    private String cuil;
    private String mail;
    private String ciudad;
    private String direccion;
    private JButton registrarButton;
    private JButton cancelarButton;
    private JLabel nombreLabel;
    private JLabel apellidoLabel;
    private JLabel nombreEmpresaLabel;
    private JLabel telefonoLabel;
    private JLabel cuilLabel;
    private JLabel mailLabel;
    private JLabel ciudadLabel;
    private JLabel direccionLabel;
    private JTable table;
}
