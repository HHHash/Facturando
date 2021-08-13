package classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIRegistrarProveedor extends JFrame {
    private JPanel registrarProveedorPanel;
    private JTextField nombreEmpresaTF;
    private JTextField apellidoTF;
    private JTextField nombreTF;
    private JTextField telefonoTF;
    private JTextField cuilTF;
    private JTextField mailTF;
    private JButton registrarButton;
    private JButton cancelarButton;
    private JLabel nombreLabel;
    private JLabel apellidoLabel;
    private JLabel nombreEmpresaLabel;
    private JLabel telefonoLabel;
    private JLabel cuilLabel;
    private JLabel mailLabel;
    private JTextField ciudadTF;
    private JTextField direccionTF;
    private JLabel ciudadLabel;
    private JLabel direccionLabel;

    public GUIRegistrarProveedor(String title) {
        super(title);
        buttonListeners();
        initScreen();
        pack();
        setVisible(true);
    }

    public void buttonListeners() {
        cancelarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        registrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO pass variables to database, if there's no column avaliable, create one.
                cleanTextFields();
                JOptionPane.showMessageDialog(null, "Se ha registrado el proveedor.");
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
        this.setContentPane(registrarProveedorPanel);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.setMinimumSize(new Dimension(500, 400));
        this.setMaximumSize(new Dimension(500, 400));
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }
}