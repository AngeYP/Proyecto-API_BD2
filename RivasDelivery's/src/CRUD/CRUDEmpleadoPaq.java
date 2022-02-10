package CRUD;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class CRUDEmpleadoPaq {
  private final Connection conexion;
  
  public CRUDEmpleadoPaq(Connection conexion) {
        this.conexion = conexion;
  }
  
  public void insertarDatos(String CodEncomienda, String CodPaquete, String Peso, String Alto, String Ancho, String Profundidad) { 
  try {
      String SQL = "INSERT INTO Vehiculos_Motor(cod_paquete,peso_paq,alto_paq,ancho_paq,profundidad,cod_destino)"
              + " VALUES (?,?,?,?,?,?,?)";
      PreparedStatement consulta = this.conexion.prepareStatement(SQL);
      consulta.setString(1, CodPaquete);
      consulta.setString(2, Peso);
      consulta.setString(3, Alto);
      consulta.setString(4, Ancho);
      consulta.setString(5, Profundidad);
      consulta.setString(6, CodEncomienda);
      consulta.execute();
      System.out.println("Registro insertado exitosamente");
    } catch (HeadlessException | SQLException e) {
      JOptionPane.showMessageDialog(null, "Error al insertar registro: " + e.getMessage());
    }
  }
  
  public void eliminarDatos(String CodEncomienda, String CodPaquete) { 
  try {
      String SQL = "DELETE FROM Paquetes WHERE cod_destino=? AND cod_paquete=?"
              + " VALUES (?,?)";
      PreparedStatement consulta = this.conexion.prepareStatement(SQL);
      consulta.setString(1, CodEncomienda);
      consulta.setString(2, CodPaquete);
      consulta.execute();
      System.out.println("Registro insertado exitosamente");
    } catch (HeadlessException | SQLException e) {
      JOptionPane.showMessageDialog(null, "Error al insertar registro: " + e.getMessage());
    }
  }
  
  /*********LLENAR COMBOBOX DE PLACAS*********/
  public void comboboxCodPaquetes(JComboBox cb, String CodEncomienda) {
    try {
      String SQL = "SELECT cod_paquete FROM Paquetes WHERE cod_destino=? ORDER BY cod_paquete ASC";
      PreparedStatement consulta = conexion.prepareStatement(SQL);
      consulta.setString(1, CodEncomienda);
      ResultSet resultado = consulta.executeQuery();
      cb.addItem("Seleccione una opcion");
      while (resultado.next()) {
        cb.addItem(resultado.getString("cod_paquete"));
      }
    } catch (SQLException ex) {
      JOptionPane.showMessageDialog(null, "Fallo: "+ex.getMessage());
    }
  }
  
  public String[] buscarPaq(String CodPaquete, String CodEncomienda) {
        
    String[] DatosPaquete = new String[4];

    try {
      String SQL = "SELECT * FROM Paquetes WHERE cod_paquete = ? AND cod_destino=?";
      PreparedStatement consulta = this.conexion.prepareStatement(SQL);
      consulta.setString(1, CodPaquete);
      consulta.setString(2, CodEncomienda);
      ResultSet resultado = consulta.executeQuery();
      while (resultado.next()) {
        DatosPaquete[0] = resultado.getString("peso_paq");
        DatosPaquete[1] = resultado.getString("alto_paq");
        DatosPaquete[2] = resultado.getString("ancho_paq");
        DatosPaquete[3] = resultado.getString("profundidad");
      }                            
    } catch (HeadlessException | SQLException e) {
      JOptionPane.showMessageDialog(null, "Fallo en la consulta" + e.getMessage());
    }
    return DatosPaquete;
  }
}
