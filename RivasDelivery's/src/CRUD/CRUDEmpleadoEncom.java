package CRUD;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class CRUDEmpleadoEncom {
  private final Connection conexion;
  
  public CRUDEmpleadoEncom(Connection conexion) {
        this.conexion = conexion;
  }
  
  public String[] buscarEncomienda(String codEncomienda){
    String[] datosEncomienda = new String[8];
    
    try {
      String SQL = "SELECT * FROM Encomiendas WHERE cod_encomienda = ?";
      PreparedStatement consulta = this.conexion.prepareStatement(SQL);
      consulta.setString(1, codEncomienda);
      ResultSet resultado = consulta.executeQuery();

      while (resultado.next()) {
          datosEncomienda[0] = resultado.getString("identificacionC");
          datosEncomienda[1] = resultado.getString("cod_encomienda");
          datosEncomienda[2] = resultado.getString("estatusE");
          datosEncomienda[3] = resultado.getString("distancia_recorrida");
          datosEncomienda[4] = resultado.getString("precio_total");
          datosEncomienda[5] = resultado.getString("destinatario");
          datosEncomienda[6] = resultado.getString("cod_pais");
          datosEncomienda[7] = resultado.getString("cod_estados");
          datosEncomienda[8] = resultado.getString("cod_ciudades");
      }                            
    } catch (HeadlessException | SQLException e) {
        JOptionPane.showMessageDialog(null, "Fallo en la consulta" + e.getMessage());
    }
    return datosEncomienda;
  }
  
  public String[] buscarCliente(String CICliente){
    String[] datosCliente = new String[8];
    
    try {
      String SQL = "SELECT * FROM Clientes WHERE identificacionC = ?";
      PreparedStatement consulta = this.conexion.prepareStatement(SQL);
      consulta.setString(1, CICliente);
      ResultSet resultado = consulta.executeQuery();
      while (resultado.next()) {
          datosCliente[0] = resultado.getString("nombreC");
          datosCliente[1] = resultado.getString("apellidoC");
      }                            
    } catch (HeadlessException | SQLException e) {
        JOptionPane.showMessageDialog(null, "Fallo en la consulta" + e.getMessage());
    }
    return datosCliente;
  }
  
  public void insertarDatos(String CodEncomienda, char Estatus, float Distancia, String Destinatario, String CICliente, String CIEmpleado, String Pais, String Estado, String Ciudad) {
    try {
      String SQL = "INSERT INTO Encomiendas(cod_encomienda,estatusE,distancia_recorrida,precio_peso,precio_total,destinatario,identificacionC,identificacionE,cod_ciudades,cod_estados,cod_pais) "
              + " VALUES (?,?,?,?,?,?,?,?,?,?,?)";
      PreparedStatement consulta = this.conexion.prepareStatement(SQL);
      consulta.setString(1, CodEncomienda);
      consulta.setString(2, String.valueOf(Estatus));
      consulta.setFloat(3, Distancia);
      consulta.setFloat(4, 0);
      consulta.setFloat(5, 0);
      consulta.setString(6, Destinatario);
      consulta.setString(7, CICliente);
      consulta.setString(8, CIEmpleado);
      consulta.setString(9, Ciudad);
      consulta.setString(10, Estado);
      consulta.setString(11, Pais);
      consulta.execute();
      System.out.println("Registro insertado exitosamente");
    } catch (HeadlessException | SQLException e) {
      JOptionPane.showMessageDialog(null, "Error al insertar registro: " + e.getMessage());
    }
  }
  
    /*CREATE TABLE `Encomiendas` (
  `cod_encomienda` varchar(10) NOT NULL,
  `estatusE` char(1) NOT NULL,
  `distancia_recorrida` float NOT NULL,
  `precio_peso` float NOT NULL,
  `precio_total` float NOT NULL,
  `destinatario` varchar(10) NOT NULL,
  `identificacionT` char(15) DEFAULT NULL,
  `identificacionC` varchar(15) NOT NULL,
  `identificacionE` varchar(10) NOT NULL,
  `cod_ciudades` varchar(10) NOT NULL,
  `cod_estados` varchar(10) NOT NULL,
  `cod_pais` varchar(10) NOT NULL,
)*/
  
  public void actualizarDatos(String CodEncomienda, char Estatus, float Distancia, String Destinatario, String Pais, String Estado, String Ciudad) {
    try {
      String SQL = "UPDATE Encomiendas SET estatusE=?,distancia_recorrida=?,destinatario=?,cod_ciudades=?,cod_estados=?,cod_pais=? WHERE cod_encomienda=?";
      PreparedStatement consulta = this.conexion.prepareStatement(SQL);
      consulta.setString(1, String.valueOf(Estatus));
      consulta.setFloat(2, Distancia);
      consulta.setString(3, Destinatario);
      consulta.setString(4, Ciudad);
      consulta.setString(5, Estado);
      consulta.setString(6, Pais);
      consulta.setString(7, CodEncomienda);
      consulta.execute();
      System.out.println("Registro editado exitosamente");
    } catch (SQLException e) {
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
    } catch (SQLException e) {
      System.out.println("Error al eliminar registro " + e.getMessage());
    }
  }
}
