package CRUD;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class CRUDEmpleadoArt {
  private final Connection conexion;
  
  public CRUDEmpleadoArt(Connection conexion) {
        this.conexion = conexion;
  }
  
  public void insertarDatos(String CodEncomienda, String CodPaquete, String NombArticulo, String Cantidad, String Precio) { 
  try {
      String SQL = "INSERT INTO Detalles_Art(nombreArt,cantidad_art,precio_art,cod_paquete,cod_encomienda)"
              + " VALUES (?,?,?,?,?)";
      PreparedStatement consulta = this.conexion.prepareStatement(SQL);
      consulta.setString(1, NombArticulo);
      consulta.setFloat(2, Float.valueOf(Cantidad));
      consulta.setFloat(3, Float.valueOf(Precio));
      consulta.setString(4, CodPaquete);
      consulta.setString(5, CodEncomienda);
      consulta.execute();
      System.out.println("Registro insertado exitosamente");
    } catch (HeadlessException | SQLException e) {
      JOptionPane.showMessageDialog(null, "Error al insertar registro: " + e.getMessage());
    }
  }
  
  public void eliminarDatos(String CodEncomienda, String CodPaquete, String NombArticulo) { 
  try {
      String SQL = "DELETE FROM Detalles_Art WHERE cod_encomienda=? AND cod_paquete=? AND nombreArt=?";
      PreparedStatement consulta = this.conexion.prepareStatement(SQL);
      consulta.setString(1, CodEncomienda);
      consulta.setString(2, CodPaquete);
      consulta.setString(3, NombArticulo);
      consulta.execute();
      System.out.println("Registro insertado exitosamente");
    } catch (HeadlessException | SQLException e) {
      JOptionPane.showMessageDialog(null, "Error al insertar registro: " + e.getMessage());
    }
  }
  
  /*********LLENAR COMBOBOX DE PLACAS*********/
  public void comboboxCodArticulos(JComboBox cb, String CodEncomienda, String CodPaquete) {
    try {
      String SQL = "SELECT nombreArt FROM Detalles_Art WHERE cod_encomienda='"+CodEncomienda+"' AND cod_paquete='"+CodPaquete+"' ORDER BY nombreArt ASC";
      PreparedStatement consulta = conexion.prepareStatement(SQL);
      ResultSet resultado = consulta.executeQuery();
      cb.addItem("Seleccione una opcion");
      while (resultado.next()) {
        cb.addItem(resultado.getString("nombreArt"));
      }
    } catch (SQLException ex) {
      JOptionPane.showMessageDialog(null, "Fallo1: "+ex.getMessage());
    }
  }
  
  public Float[] buscarArticulos(String NombArticulos,String CodPaquete, String CodEncomienda) {        
    Float[] DatosPaquete = new Float[2];
    try {
      String SQL = "SELECT * FROM Detalles_Art WHERE cod_paquete = ? AND cod_encomienda = ? AND nombreArt = ?";
      PreparedStatement consulta = this.conexion.prepareStatement(SQL);
      consulta.setString(1, CodPaquete);
      consulta.setString(2, CodEncomienda);
      consulta.setString(3, NombArticulos);
      ResultSet resultado = consulta.executeQuery();
      while (resultado.next()) {
        DatosPaquete[0] = resultado.getFloat("cantidad_art");
        DatosPaquete[1] = resultado.getFloat("precio_art");
      }                            
    } catch (HeadlessException | SQLException e) {
      JOptionPane.showMessageDialog(null, "Fallo en la consulta" + e.getMessage());
    }
    return DatosPaquete;
  }  
}
