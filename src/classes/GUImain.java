package classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUImain extends JFrame implements MainFrameCallback {
    private JFrame f;

    public GUImain() {
        //  initComponents();
        //  setupGUI();

        f = new JFrame("Facturando");

        f.setJMenuBar(new MyBar(this));
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    } // End public MainInterface()

    /*
        public void setupGUI() {
            setBackground(new Color(122, 150, 110));
            setMinimumSize(new Dimension(1366, 768));
            setTitle("Facturando");
            setExtendedState(Frame.MAXIMIZED_BOTH);
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            setBackground(Color.red);
            MyBar b = new MyBar(this);
            setJMenuBar(b);
            setVisible(true);
        }
    */
    @Override
    public void consultaFacturasMIActionPerformed(ActionEvent e) {
        GUIconsultaFacturas consultasFactura = new GUIconsultaFacturas("Consulta Facturas");
        consultasFactura.setVisible(true);
    }

    @Override
    public void consultaCajaMIActionPerformed(ActionEvent e) {
        GUIconsultaCaja consultasCaja = new GUIconsultaCaja("Consulta Cajas por Fecha");
        consultasCaja.setVisible(true);
    }

    @Override
    public void listaProveedoresMIActionPerformed(ActionEvent e) {
        GUIListaProveedores listaProveedores = new GUIListaProveedores("Lista de Proveedores");
        listaProveedores.setVisible(true);
    }

    @Override
    public void registrarProveedorMIActionPerformed(ActionEvent e) {
        GUIRegistrarProveedor registrarProveedor = new GUIRegistrarProveedor("Registrar Proveedor");
        registrarProveedor.setVisible(true);
    }

    @Override
    public void cerrarCajaMIActionPerformed(ActionEvent e) {
        String confirmation = JOptionPane.showInputDialog("Seguro desea cerrar la caja? Escriba SI para continuar");
        if (confirmation.equals("SI")) {
            // TODO, set acumulator for totalCaja, set counter for totalVentas, pass all values to database, reset to 0 both var when confirmation == "SI"
            JOptionPane.showMessageDialog(null, "Caja cerrada con exito");
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese SI en mayúsculas para cerrar  la caja correctamente");
        }
    }

    @Override
    public void nuevaVentaMIActionPerformed(ActionEvent e) {
        GUINuevaVenta nuevaVenta = new GUINuevaVenta("Nueva Venta");
        nuevaVenta.setVisible(true);
    }

    @Override
    public void listaProductosMIActionPerformed(ActionEvent e) {
        GUIListaProductos listaProductos = new GUIListaProductos("Lista de Productos");
        listaProductos.setVisible(true);
    }

    @Override
    public void registrarProductoMIACtionPerformed(ActionEvent e) {
        GUIRegistrarProducto registrarProducto = new GUIRegistrarProducto("Registrar Producto");
        registrarProducto.setVisible(true);
    }

    @Override
    public void listaClientesMIActionPerformed(ActionEvent e) {
        GUIListaClientes listaClientes = new GUIListaClientes("Lista de Clientes");
        listaClientes.setVisible(true);
    }

    @Override
    public void registrarClienteMIActionPerformed(ActionEvent e) {
        GUIRegistrarCliente registrarCliente = new GUIRegistrarCliente("Registrar Cliente");
        registrarCliente.setVisible(true);
    }
}
