package CRUD;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class CRUDEmpleadoCliente {
  private final Connection conexion;
  
  public CRUDEmpleadoCliente(Connection conexion) {
        this.conexion = conexion;
  }
  
  public String[] buscarEmpleado(String CICliente) {
        
    String[] datosCliente = new String[11];

    try {
      String SQL = "SELECT * FROM Clientes WHERE identificacionC = ?";
      PreparedStatement consulta = this.conexion.prepareStatement(SQL);
      consulta.setString(1, CICliente);
      ResultSet resultado = consulta.executeQuery();

      while (resultado.next()) {
          datosCliente[0] = resultado.getString("identificacionC");
          datosCliente[1] = resultado.getString("nacionalidadC");
          datosCliente[2] = resultado.getString("nombreC");
          datosCliente[3] = resultado.getString("apellidoC");
          datosCliente[4] = resultado.getString("emailC");
          datosCliente[5] = resultado.getString("telefono1C");
          datosCliente[6] = resultado.getString("telefono2C");
          datosCliente[7] = resultado.getString("saldoC");
          datosCliente[8] = resultado.getString("cod_ciudades");
          datosCliente[9] = resultado.getString("cod_estados");
          datosCliente[10] = resultado.getString("cod_pais");
      }                            
    } catch (HeadlessException | SQLException e) {
        JOptionPane.showMessageDialog(null, "Fallo en la consulta" + e.getMessage());
    }
    return datosCliente;
  }
}
