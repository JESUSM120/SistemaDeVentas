
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class conexion {
    
	Connection conexion = null;
    String usuario = "sa";
    String contrasena = "123";
    String db = "sistemaVentas";
    String puerto = "1433";

    public Connection getConnection() {
        try {
            String cadena = "jdbc:sqlserver://DESKTOP-SH31L6B: " + puerto + ";" + "databaseName=" + db;
            conexion = DriverManager.getConnection(cadena, usuario, contrasena);
            //JOptionPane.showMessageDialog(null,"Conexion Exitosa");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Conexion no exitosa"+e.toString());
        }
        return conexion;

    
}
}