package CRUD;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class CRUDClientes {
  private final Connection conexion;

  public CRUDClientes(Connection conexion) {
      this.conexion = conexion;
  }
  
  /*CREATE TABLE `Encomiendas` (
  `cod_encomienda` varchar(10) NOT NULL,
  `estatusE` char(1) NOT NULL,
  `distancia_recorrida` float NOT NULL,
  `precio_peso` float NOT NULL,
  `precio_total` float NOT NULL,
  `identificacionT` char(15) DEFAULT NULL,
  `identificacionC` varchar(15) NOT NULL,
  `identificacionE` varchar(10) NOT NULL,
  `cod_ciudades` varchar(10) NOT NULL,
  `cod_estados` varchar(10) NOT NULL,
  `cod_pais` varchar(10) NOT NULL,
)*/
  
  public void comboboxEncomiendas(JComboBox cb, String CICliente) {
    try {
      String SQL = "SELECT cod_encomienda FROM Encomiendas WHERE identificacionC='"+CICliente+"' ORDER BY cod_encomienda ASC";
      PreparedStatement consulta = conexion.prepareStatement(SQL);
      ResultSet resultado = consulta.executeQuery();
      cb.addItem("Seleccione una opcion");
      while (resultado.next()) {
        cb.addItem(resultado.getString("cod_encomienda"));
      }
    } catch (SQLException ex) {
      JOptionPane.showMessageDialog(null, "Fallo: "+ex.getMessage());
    }
  }
  
    
  public String[] buscarCliente(String CICliente, String codEncomienda) {
        
    String[] datosCliente = new String[10];

    try {
      String SQL = "SELECT * FROM Encomiendas WHERE identificacionC = ? AND cod_encomienda = ?";
      PreparedStatement consulta = this.conexion.prepareStatement(SQL);
      consulta.setString(1, CICliente);
      consulta.setString(2, codEncomienda);
      System.out.println("Consulta exitosa");
      ResultSet resultado = consulta.executeQuery();

      while (resultado.next()) {
          datosCliente[0] = resultado.getString("estatusE");
          datosCliente[1] = resultado.getString("precio_total");
          datosCliente[2] = resultado.getString("destinatario");
          datosCliente[3] = resultado.getString("cod_pais");
          datosCliente[4] = resultado.getString("cod_estados");
          datosCliente[5] = resultado.getString("cod_ciudades");
          datosCliente[6] = resultado.getString("identificacionT");
          datosCliente[7] = resultado.getString("fecha_creada");
          datosCliente[8] = resultado.getString("fecha_salida");
          datosCliente[9] = resultado.getString("fecha_llegada");
      }                            
    } catch (HeadlessException | SQLException e) {
        System.out.println("Fallo en la consulta" + e.getMessage());
    }
    return datosCliente;
  }
  
  public String[] buscarTransportista(String CITransportista) {   
    String[] datosCliente = new String[2];
    try {
      String SQL = "SELECT * FROM Transportistas WHERE identificacionT = ?";
      PreparedStatement consulta = this.conexion.prepareStatement(SQL);
      consulta.setString(1, CITransportista);
      System.out.println("Consulta exitosa");
      ResultSet resultado = consulta.executeQuery();
      while (resultado.next()) {
          datosCliente[0] = resultado.getString("nombreT");
          datosCliente[1] = resultado.getString("apellidoT");
      }                            
    } catch (HeadlessException | SQLException e) {
        System.out.println("Fallo en la consulta" + e.getMessage());
    }
    return datosCliente;
  }
}
