package CRUD;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class CRUDEmpleadoTransVeh {
  private final Connection conexion;
  
  public CRUDEmpleadoTransVeh(Connection conexion) {
        this.conexion = conexion;
  }
  
  public void insertarDatos(String CITransportista, String Codigo, String Placa, String Tipo, String Modelo, String Marca, String Color) { 
  try {
      String SQL = "INSERT INTO Vehiculos_Motor(cod_vehiculos,placa,modeloV,marcaV,colorV,tipoV,identificacionT)"
              + " VALUES (?,?,?,?,?,?,?)";
      PreparedStatement consulta = this.conexion.prepareStatement(SQL);
      consulta.setString(1, Codigo);
      consulta.setString(2, Placa);
      consulta.setString(3, Modelo);
      consulta.setString(4, Marca);
      consulta.setString(5, Color);
      consulta.setString(6, Tipo);
      consulta.setString(7, CITransportista);
      consulta.execute();
      System.out.println("Registro insertado exitosamente");
    } catch (HeadlessException | SQLException e) {
      JOptionPane.showMessageDialog(null, "Error al insertar registro: " + e.getMessage());
    }
  }
  
  public void eliminarDatos(String CITransportista, String Codigo) { 
  try {
      String SQL = "DELETE FROM Vehiculos_Motor WHERE identificacionT=? AND cod_vehiculos=?"
              + " VALUES (?,?)";
      PreparedStatement consulta = this.conexion.prepareStatement(SQL);
      consulta.setString(1, CITransportista);
      consulta.setString(2, Codigo);
      consulta.execute();
      System.out.println("Registro insertado exitosamente");
    } catch (HeadlessException | SQLException e) {
      JOptionPane.showMessageDialog(null, "Error al insertar registro: " + e.getMessage());
    }
  }
  
    /*********LLENAR COMBOBOX DE PLACAS*********/
  public void comboboxPlacas(JComboBox cb, String CITransportista) {
    try {
      String SQL = "SELECT placa FROM Vehiculos_Motor WHERE identificacionT=? ORDER BY placa ASC";
      PreparedStatement consulta = conexion.prepareStatement(SQL);
      consulta.setString(1, CITransportista);
      ResultSet resultado = consulta.executeQuery();
      cb.addItem("Seleccione una opcion");
      while (resultado.next()) {
        cb.addItem(resultado.getString("placa"));
      }
    } catch (SQLException ex) {
      JOptionPane.showMessageDialog(null, "Fallo: "+ex.getMessage());
    }
  }
  
  public String[] buscarVehiculos(String Placa) {
        
    String[] DatosVehiculos = new String[5];

    try {
      String SQL = "SELECT * FROM Vehiculos_Motor WHERE placa = ?";
      PreparedStatement consulta = this.conexion.prepareStatement(SQL);
      consulta.setString(1, Placa);
      ResultSet resultado = consulta.executeQuery();
      while (resultado.next()) {
        DatosVehiculos[0] = resultado.getString("cod_vehiculos");
        DatosVehiculos[1] = resultado.getString("modeloV");
        DatosVehiculos[2] = resultado.getString("marcaV");
        DatosVehiculos[3] = resultado.getString("colorV");
        DatosVehiculos[4] = resultado.getString("tipoV");
      }                            
    } catch (HeadlessException | SQLException e) {
      JOptionPane.showMessageDialog(null, "Fallo en la consulta" + e.getMessage());
    }
    return DatosVehiculos;
  }
}
