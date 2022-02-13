package CRUD;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class CRUDTransVuelos {
  private final Connection conexion;
  
  public CRUDTransVuelos(Connection conexion) {
        this.conexion = conexion;
  }
  
  public void insertarDatos(String cod_vuelos, String hora_salida, String hora_llegada, String hora_estimada_S,String hora_estimada_LL
          , String hora_retraso, String descripcion_retraso, String fecha_llegada, String fecha_salida, String identificacionT) { 
  try {
      String SQL = "INSERT INTO Vuelos(cod_vuelos,hora_salida,hora_llegada,hora_estimada_S,hora_estimada_LL,hora_retraso"
              + ",descripcion_retraso,fecha_llegada,fecha_salida,identificacionT)"
              + " VALUES (?,?,?,?,?,?,?,?,?,?)";
      PreparedStatement consulta = this.conexion.prepareStatement(SQL);
      consulta.setString(1, cod_vuelos);
      consulta.setString(2, hora_salida);
      consulta.setString(3, hora_llegada);
      consulta.setString(4, hora_estimada_S);
      consulta.setString(5, hora_estimada_LL);
      consulta.setString(6, hora_retraso);
      consulta.setString(7, descripcion_retraso);
      consulta.setString(8, fecha_llegada);
      consulta.setString(9, fecha_salida);
      consulta.setString(10, identificacionT);
      consulta.execute();
      System.out.println("Registro insertado exitosamente");
    } catch (HeadlessException | SQLException e) {
      JOptionPane.showMessageDialog(null, "Error al insertar registro: " + e.getMessage());
    }
  }
  
  public void eliminarDatos(String cod_vuelos, String identificacionT) { 
  try {
      String SQL = "DELETE FROM Vuelos WHERE cod_vuelos=? AND identificacionT=?"
              + " VALUES (?,?)";
      PreparedStatement consulta = this.conexion.prepareStatement(SQL);
      consulta.setString(1, cod_vuelos);
      consulta.setString(2, identificacionT);
      consulta.execute();
      System.out.println("Registro insertado exitosamente");
    } catch (HeadlessException | SQLException e) {
      JOptionPane.showMessageDialog(null, "Error al insertar registro: " + e.getMessage());
    }
  }
  
  public String[] buscarVuelos(String cod_vuelos, String identificacionT) {
        
    String[] datosVuelos = new String[10];

    try {
      String SQL = "SELECT * FROM Vuelos WHERE cod_vuelos = ? AND identificacionT = ?";
      PreparedStatement consulta = this.conexion.prepareStatement(SQL);
      consulta.setString(1, cod_vuelos);
      consulta.setString(2, identificacionT);
      ResultSet resultado = consulta.executeQuery();
      while (resultado.next()) {
        datosVuelos[0] = resultado.getString("cod_vuelos");
        datosVuelos[1] = resultado.getString("modeloV");
        datosVuelos[2] = resultado.getString("marcaV");
        datosVuelos[3] = resultado.getString("colorV");
        datosVuelos[4] = resultado.getString("tipoV");
        datosVuelos[5] = resultado.getString("tipoV");
        datosVuelos[6] = resultado.getString("tipoV");
        datosVuelos[7] = resultado.getString("tipoV");
        datosVuelos[8] = resultado.getString("tipoV");
        datosVuelos[9] = resultado.getString("identificacionT");
      }                            
    } catch (HeadlessException | SQLException e) {
      JOptionPane.showMessageDialog(null, "Fallo en la consulta" + e.getMessage());
    }
    return datosVuelos;
  }
}
