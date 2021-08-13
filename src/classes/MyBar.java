package classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyBar extends JMenuBar {


    public MyBar(MainFrameCallback callback) {

        JMenuBar menuBar1 = this;
        JMenu productosMenu = new JMenu();
        JMenu cajaMenu = new JMenu();
        JMenu proveedoresMenu = new JMenu();
        JMenu consultasMenu = new JMenu();
        JMenuItem registrarClienteMI = new JMenuItem();
        JMenuItem listaClientesMI = new JMenuItem();
        JMenuItem registrarProductoMI = new JMenuItem();
        JMenuItem listaProductosMI = new JMenuItem();
        JMenuItem nuevaVentaMI = new JMenuItem();
        JMenuItem cerrarCajaMI = new JMenuItem();
        JMenuItem registrarProveedorMI = new JMenuItem();
        JMenuItem listaProveedoresMI = new JMenuItem();
        JMenuItem consultaCajaMI = new JMenuItem();
        JMenuItem consultaFacturasMI = new JMenuItem();
        JLabel bg = new JLabel();

        JMenu clientesMenu = new JMenu();

        // clientesMenuComponents
        clientesMenu.setText("Clientes");
        clientesMenu.setPreferredSize(new Dimension(200, 50));
        menuBar1.add(clientesMenu);

        registrarClienteMI.setText("Registrar Cliente");
        registrarClienteMI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                callback.registrarClienteMIActionPerformed(e);
            }
        });
        clientesMenu.add(registrarClienteMI);

        listaClientesMI.setText("Lista de Clientes");
        listaClientesMI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                callback.listaClientesMIActionPerformed(e);
            }
        });
        clientesMenu.add(listaClientesMI);
        // end of clientesMenuComponents

        // productosMenuComponents
        productosMenu.setText("Productos");
        productosMenu.setPreferredSize(new Dimension(200, 50));
        menuBar1.add(productosMenu);

        registrarProductoMI.setText("Nuevo Producto");
        registrarProductoMI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                callback.registrarProductoMIACtionPerformed(e);
            }
        });
        productosMenu.add(registrarProductoMI);

        listaProductosMI.setText("Lista de Productos");
        listaProductosMI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                callback.listaProductosMIActionPerformed(e);
            }
        });
        productosMenu.add(listaProductosMI);
        // end of productosMenuComponents

        // cajaMenuComponents
        cajaMenu.setText("Caja");
        cajaMenu.setPreferredSize(new Dimension(200, 50));
        menuBar1.add(cajaMenu);

        nuevaVentaMI.setText("Nueva venta");
        nuevaVentaMI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                callback.nuevaVentaMIActionPerformed(e);
            }
        });
        cajaMenu.add(nuevaVentaMI);

        cerrarCajaMI.setText("Cerrar Caja");
        cerrarCajaMI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                callback.cerrarCajaMIActionPerformed(e);
            }
        });
        cajaMenu.add(cerrarCajaMI);
        // end of cajaMenuComponents

        // proveedoresMenuComponents
        proveedoresMenu.setText("Proveedores");
        proveedoresMenu.setPreferredSize(new Dimension(200, 50));
        menuBar1.add(proveedoresMenu);

        registrarProveedorMI.setText("Nuevo Proveedor");
        registrarProveedorMI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                callback.registrarProveedorMIActionPerformed(e);
            }
        });
        proveedoresMenu.add(registrarProveedorMI);

        listaProveedoresMI.setText("Lista de Proveedores");
        listaProveedoresMI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                callback.listaProveedoresMIActionPerformed(e);
            }
        });
        proveedoresMenu.add(listaProveedoresMI);
        // end of proveedoresMenuComponents

        // consultasMenuComponents
        consultasMenu.setText("Consultas");
        consultasMenu.setPreferredSize(new Dimension(200, 50));
        menuBar1.add(consultasMenu);

        consultaCajaMI.setText("Consulta Cajas por Fecha");
        consultaCajaMI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                callback.consultaCajaMIActionPerformed(e);
            }
        });
        consultasMenu.add(consultaCajaMI);

        consultaFacturasMI.setText("Consultas Facturas");
        consultaFacturasMI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                callback.consultaFacturasMIActionPerformed(e);
            }
        });
        consultasMenu.add(consultaFacturasMI);

        setVisible(true);
        // end of consultasMenuComponents
    }
}