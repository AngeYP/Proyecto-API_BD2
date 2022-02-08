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
  
  public String[] buscarCliente(String CICliente) {
        
    String[] datosCliente = new String[11];

    try {
      String SQL = "SELECT * FROM Clientes WHERE identificacionC = ?";
      PreparedStatement consulta = this.conexion.prepareStatement(SQL);
      consulta.setString(1, CICliente);
      System.out.println("Consulta exitosa");
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
        System.out.println("Fallo en la consulta" + e.getMessage());
    }
    return datosCliente;
  }
  
  public void insertarDatos(String CICliente, char Nacionalidad, String Nombre, String Apellido, String Email, String Telefono1, String Telefono2, 
      float Saldo, String Pais, String Estado, String Ciudad) {
    try {
      String SQL = "INSERT INTO Clientes(identificacionC,nacionalidadC,nombreC,apellidoC,emailC,telefono1C,telefono2C,saldoC,cod_ciudades,cod_estados,cod_pais) "
              + " VALUES (?,?,?,?,?,?,?,?,?,?,?)";
      PreparedStatement consulta = this.conexion.prepareStatement(SQL);
      consulta.setString(1, CICliente);
      consulta.setString(2, String.valueOf(Nacionalidad));
      consulta.setString(3, Nombre);
      consulta.setString(4, Apellido);
      consulta.setString(5, Email);
      consulta.setString(6, Telefono1);
      consulta.setString(7, Telefono2);
      consulta.setFloat(8, Saldo);
      consulta.setString(9, Pais);
      consulta.setString(10, Estado);
      consulta.setString(11, Ciudad);
      consulta.execute();
      System.out.println("Registro insertado exitosamente");
    } catch (HeadlessException | SQLException e) {
      JOptionPane.showMessageDialog(null, "Error al insertar registro: " + e.getMessage());
    }
  }
  
  public void actualizarDatos(String CICliente, char Nacionalidad, String Nombre, String Apellido, String Email,
      String Telefono1, String Telefono2, String Pais, String Estado, String Ciudad) {
    try {
      String SQL = "UPDATE Clientes SET nacionalidadC=?,nombreC=?,apellidoC=?,emailC=?,telefono1C=?,telefono2C=?,cod_ciudades=?,cod_estados=?,cod_pais=? WHERE identificacionC=?";
      PreparedStatement consulta = this.conexion.prepareStatement(SQL);
      consulta.setString(1, String.valueOf(Nacionalidad));
      consulta.setString(2, Nombre);
      consulta.setString(3, Apellido);
      consulta.setString(4, Email);
      consulta.setString(5, Telefono1);
      consulta.setString(6, Telefono2);
      consulta.setString(7, Ciudad);
      consulta.setString(8, Estado);
      consulta.setString(9, Pais);
      consulta.setString(10, CICliente);
      consulta.execute();
      System.out.println("Registro editado exitosamente");
    } catch (Exception e) {
      System.out.println("Error al editar el registro" + e.getMessage());
    }
  }
  
  public void eliminarRegistro(String CICliente) {
    String SQL = "DELETE FROM Clientes WHERE identificacionC=?";
    try {
      PreparedStatement consulta = conexion.prepareStatement(SQL);
      consulta.setString(1, CICliente);
      consulta.executeUpdate();
      System.out.println("Registro eliminado exitosamente");
    } catch (Exception e) {
      System.out.println("Error al eliminar registro " + e.getMessage());
    }
  }
}
