/*package classes;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SQLSentences {
    private Connection con;
    PreparedStatement prepStat;
    ResultSet result;

    public SQLSentences() {
        con = new Connection();
    }

    public boolean insert(String data[], String ins) {
        boolean state = false;
        try {
            prepStat = con.connected().prepareStatement(ins);
            for (int i = 0; i <= data.length-1; i++) {
                prepStat.setString(i+1, data[i]);
            }
            prepStat.execute();
            prepStat.close();
            state = true;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return state;
    }

    public Object[][] getTabla(String colName[], String tabla, String sql) {
        int registros = 0;
        try {
            prepStat = con.connected().prepareStatement("select count(*) as total from " + tabla);
            result = prepStat.executeQuery();
            result.next();
            registros = result.getInt("total");
            result.close();
        } catch (SQLException e) {
            System.out.println(e);
        }

        Object[][] data = new String[registros][colName.length];
        String col[] = new String[colName.length];

        try {
            prepStat = con.connected().prepareStatement(sql);
            result = prepStat.executeQuery();
            int i = 0;
            while (result.next()) {
                for (int j = 0 ; j <= colName.length-1 ; j++) {
                    col[j] = result.getString(colName[j]);
                    data[i][j] = col[j];
                }
                i++;
            }
            result.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
        return data;
    }

    public boolean existencia(String campo, String fromWhere) {
        int registros = 0;
        try {
            prepStat = con.connected().prepareStatement("select count("+ campo +
                    ") as total " + fromWhere);
            result = prepStat.executeQuery();
            result.next();
            registros = result.getInt("total");
            result.close();
        } catch (SQLException e) {
            System.out.println(e);
        }

        if (registros > 0) {
            return true;
        } else {
            return false;
        }
    }

    public String stringData(String colName, String SQLSentence) {
        String data = "";
        try {
            prepStat = con.connected().prepareStatement(SQLSentence);
            result = prepStat.executeQuery();
            while(result.next()) {
                data = result.getString(colName);
            }
            result.close();
        } catch(SQLException e) {
            System.out.println(e);
        }
        return data;
    }

    public Object[] poblarCombox(String tabla, String colName, String sql) {
        int registros = 0;
        try {
            prepStat = con.connected().prepareStatement("select count(*) as total from " + tabla);
            result = prepStat.executeQuery();
            result.next();
            registros = result.getInt("total");
            result.close();
        } catch (SQLException e) {
            System.out.println(e);
        }

        Object[] data = new Object[registros];
        try {
            prepStat = con.connected().prepareStatement(sql);
            result = prepStat.executeQuery();
            int i = 0;
            while (result.next()) {
                data[i] = result.getObject(colName);
                i++;
            }
            result.close();
        } catch(SQLException e) {
            System.out.println(e);
        }
        return data;
    }

    public Double datosTotalFactura(String campo, String sql) {
        double data = 0;
        try {
            prepStat = con.connected().prepareStatement(sql);
            result = prepStat.executeQuery();
            while(result.next()) {
                data = result.getDouble(campo);
            }
            result.close();
        } catch(SQLException e) {
            System.out.println(e);
        }
        return data;
    }
}
*/