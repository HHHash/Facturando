package classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//TODO: change jpanel for jframe
public class GUIRegistrarCliente extends JFrame {

    public GUIRegistrarCliente(String title) {
        buttonListeners();
        initScreen();
        setVisible(true);
    }

    public void buttonListeners() {
        registrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO pass variables to database, if there's no row avaliable, create one.
                 if(isUserValid()){
                     UserRepository.getInstance().addUser(new UserModel(nombreTF.getText(), apellidoTF.getText(), nombreEmpresaTF.getText(),
                             telefonoTF.getText(), cuilTF.getText(), mailTF.getText(), ciudadTF.getText(), direccionTF.getText()));
                 }
                //cleanTextFields();
            }
        });

        cancelarButton.addActionListener(e -> {
            try {
                dispose();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        });
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

    public boolean isUserValid(){
      if(nombreTF.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "El nombre es obligatorio");
            return false;
        } else if(apellidoTF.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "El apellido es obligatorio");
          return false;
      }
        return true;
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

