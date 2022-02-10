package CRUD;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class CRUDAdministradorNucleo {
  private final Connection conexion;
  
  public CRUDAdministradorNucleo(Connection conexion) {
        this.conexion = conexion;
  }
  
  public String[] buscarNucleo(String cod_nucleo) {
        
    String[] datosNucleo = new String[7];

    try {
      String SQL = "SELECT * FROM Nucleos WHERE cod_nucleo = ?";
      PreparedStatement consulta = this.conexion.prepareStatement(SQL);
      consulta.setString(1, cod_nucleo);
      System.out.println("Consulta exitosa");
      ResultSet resultado = consulta.executeQuery();

      while (resultado.next()) {
          datosNucleo[0] = resultado.getString("cod_nucleo");
          datosNucleo[1] = resultado.getString("nombre_nucleo");
          datosNucleo[2] = resultado.getString("num_telefonoN");
          datosNucleo[3] = resultado.getString("identificacionE");
          datosNucleo[4] = resultado.getString("cod_ciudades");
          datosNucleo[5] = resultado.getString("cod_estados");
          datosNucleo[6] = resultado.getString("cod_pais");
      }                            
    } catch (HeadlessException | SQLException e) {
        System.out.println("Fallo en la consulta" + e.getMessage());
    }
    
//    System.out.println("["+datosCliente[10]+"]");
    return datosNucleo;
  }
  
  public void insertarDatos(String cod_nucleo, String nombre_nucleo, String num_telefonoN, String identificacionE, String cod_ciudades, String cod_estados, String cod_pais) {
    try {
      String SQL = "INSERT INTO Nucleos(cod_nucleo,nombre_nucleo,num_telefonoN,identificacionE,cod_ciudades,cod_estados,cod_pais) "
              + " VALUES (?,?,?,?,?,?,?)";
      PreparedStatement consulta = this.conexion.prepareStatement(SQL);
      consulta.setString(1, cod_nucleo);
      consulta.setString(2, nombre_nucleo);
      consulta.setString(3, num_telefonoN);
      consulta.setString(4, identificacionE);
      consulta.setString(5, cod_ciudades);
      consulta.setString(6, cod_estados);
      consulta.setString(7, cod_pais);
      consulta.execute();
      System.out.println("Registro insertado exitosamente");
    } catch (HeadlessException | SQLException e) {
      JOptionPane.showMessageDialog(null, "Error al insertar registro: " + e.getMessage());
    }
  }
  
  public void actualizarDatos(String cod_nucleo, String nombre_nucleo, String num_telefonoN, String identificacionE, String cod_ciudades, String cod_estados, String cod_pais) {
    try {
      String SQL = "UPDATE Nucleos SET nombre_nucleo=?,num_telefonoN=?,identificacionE=?,cod_ciudades=?,cod_estados=?,cod_pais=? WHERE cod_nucleo=?";
      PreparedStatement consulta = this.conexion.prepareStatement(SQL);
      consulta.setString(1, nombre_nucleo);
      consulta.setString(2, num_telefonoN);
      consulta.setString(3, identificacionE);
      consulta.setString(4, cod_ciudades);
      consulta.setString(5, cod_estados);
      consulta.setString(6, cod_pais);
      consulta.setString(7, cod_nucleo);
      consulta.execute();
      System.out.println("Registro editado exitosamente");
    } catch (Exception e) {
      System.out.println("Error al editar el registro" + e.getMessage());
    }
  }
  
  public void eliminarRegistro(String cod_nucleo) {
    String SQL = "DELETE FROM Nucleos WHERE cod_nucleo=?";
    try {
      PreparedStatement consulta = conexion.prepareStatement(SQL);
      consulta.setString(1, cod_nucleo);
      consulta.executeUpdate();
      System.out.println("Registro eliminado exitosamente");
    } catch (Exception e) {
      System.out.println("Error al eliminar registro " + e.getMessage());
    }
  }
}