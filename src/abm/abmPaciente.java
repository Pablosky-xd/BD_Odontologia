package abm;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.modeloPaciente;

/**
 *
 * @author Pablo Gauto
 */
public class abmPaciente extends conexion {

    public DefaultTableModel cargarTabla(String condicion) {
        Object encabezado[] = new Object[7];
        encabezado[0] = "CODIGO";
        encabezado[1] = "NOMBRE";
        encabezado[2] = "APELLIDO";
        encabezado[3] = "CIUDAD";
        encabezado[4] = "CI";
        encabezado[5] = "TELEFONO";
        encabezado[6] = "GMAIL";
        
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(encabezado);
        
        PreparedStatement preparaConsulta = null;
        ResultSet dato = null;
        Connection conex = getAbrirConexion();
        String sql = "";
        
        try {
           sql = "SELECT *FROM PACIENTE " + condicion;
           preparaConsulta = conex.prepareStatement(sql);
           dato = preparaConsulta.executeQuery();
           
           while(dato.next() == true){
              Object filas[] = new Object[7];
              
              filas[0] = dato.getInt("id_paciente");
              filas[1] = dato.getString("nombre");
              filas[2] = dato.getString("apellido");
              filas[3] = dato.getString("ciudad");
              filas[4] = dato.getString("ci");
              filas[5] = dato.getString("telefono");
              filas[6] = dato.getString("gmail");
              modelo.addRow(filas);
           }
                
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"ERROR:" + e);
        }
        return modelo;
    }
    
    public boolean InsertarRegistro(modeloPaciente modelo){
        PreparedStatement preparaConsulta = null;
        Connection conex = getAbrirConexion();
        String sql = "";
        
        try {
            sql = "INSERT INTO paciente(nombre, apellido, ciudad, ci, telefono, gmail)VALUES(?,?,?,?,?,?)";
            preparaConsulta = conex.prepareStatement(sql);
            preparaConsulta.setString(1, modelo.getNombre());
            preparaConsulta.setString(2, modelo.getApellido());
            preparaConsulta.setString(3, modelo.getCiudad());
            preparaConsulta.setString(4, modelo.getCi());
            preparaConsulta.setString(5, modelo.getTelefono());
            preparaConsulta.setString(6, modelo.getGmail());
            preparaConsulta.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR: " + e);
            return false;
        }
    }
}
