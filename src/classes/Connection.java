/*package classes;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Connection {
    private final String url = "jdbc:mysql://localhost/facturando";
    PreparedStatement psPrepareSentence;
    java.sql.Connection con = null;

    public Connection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            con = DriverManager.getConnection(url, "root", "");
            if (con!=null) {
                System.out.println("Conexion a base de datos lista.");
            } else {
                System.out.println("Conexion a base de datos rechazada");
            }
        } catch(SQLException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
    }

    public java.sql.Connection connected() {
        return con;
    }

    public void desconectar() {
        con = null;
        System.out.println("Conexion finalizada");
    }
}
*/