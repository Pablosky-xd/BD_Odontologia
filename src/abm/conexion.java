
package abm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class conexion {
    private String db       = "odontologia";
    private String usuario  = "root";
    private String password = "12345";
    private String servidor = "localhost";
    private String puerto   = "3306";
    private String url      = "jdbc:mysql://" + servidor + ":" + puerto + "/" + db + "?useUnicode=true&characterEncoding=UTF-8";
    private Connection conn = null;
    
    public Connection getAbrirConexion(){
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url,usuario,password);
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error al Conectar DB\n" + e);
            System.exit(0);
        }
        return conn;
        
    }
    
            
}
