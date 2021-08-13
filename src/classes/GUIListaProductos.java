package classes;

import javax.swing.*;

import javax.swing.*;
import java.awt.*;

public class GUIListaProductos extends JFrame {
    private JPanel listaProductosPanel;

    public GUIListaProductos(String title) {
        super(title);
        initScreen();
        initComponents();
        pack();
        setVisible(true);
    }

    private void initScreen() {
        this.setContentPane(listaProductosPanel);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.setMinimumSize(new Dimension(800, 768));
        this.setMaximumSize(new Dimension(800, 768));
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    private void initComponents() {

    }
}
