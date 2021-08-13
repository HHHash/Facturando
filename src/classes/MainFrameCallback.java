package classes;

import java.awt.event.ActionEvent;

public interface MainFrameCallback {
    void registrarClienteMIActionPerformed(ActionEvent e);

    void listaClientesMIActionPerformed(ActionEvent e);

    void registrarProductoMIACtionPerformed(ActionEvent e);

    void listaProductosMIActionPerformed(ActionEvent e);

    void nuevaVentaMIActionPerformed(ActionEvent e);

    void cerrarCajaMIActionPerformed(ActionEvent e);

    void registrarProveedorMIActionPerformed(ActionEvent e);

    void listaProveedoresMIActionPerformed(ActionEvent e);

    void consultaCajaMIActionPerformed(ActionEvent e);

    void consultaFacturasMIActionPerformed(ActionEvent e);
}
