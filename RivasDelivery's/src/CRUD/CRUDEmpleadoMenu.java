/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUD;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author angel
 */
public class CRUDEmpleadoMenu {
  private final Connection conexion;
  
  public CRUDEmpleadoMenu(Connection conexion) {
        this.conexion = conexion;
  }
  
  public String[] buscarEmpleado(String identificacionE) {
        
    String[] datosCliente = new String[11];

    try {
      String SQL = "SELECT * FROM Empleados WHERE identificacionE = ?";
      PreparedStatement consulta = this.conexion.prepareStatement(SQL);
      consulta.setString(1, identificacionE);
      System.out.println("Consulta exitosa");
      ResultSet resultado = consulta.executeQuery();

      while (resultado.next()) {
          datosCliente[0] = resultado.getString("identificacionE");
          datosCliente[1] = resultado.getString("nombreE");
          datosCliente[2] = resultado.getString("apellidoE");
          datosCliente[3] = resultado.getString("emailE");
          datosCliente[4] = resultado.getString("telefono1E");
          datosCliente[5] = resultado.getString("telefono2E");
          datosCliente[6] = resultado.getString("cod_nucleos");
      }                            
    } catch (HeadlessException | SQLException e) {
        System.out.println("Fallo en la consulta" + e.getMessage());
    }
    
//    System.out.println("["+datosCliente[10]+"]");
    return datosCliente;
  }
  
  public void insertarDatos(String identificacionE, String nombreE, String apellidoE, String emailE, String telefono1E, String telefono2E, String cod_nucleos) {
    try {
      String SQL = "INSERT INTO Empleados(identificacionE,nombreE,apellidoE,emailE,telefono1E,telefono2E,cod_nucleos) "
              + " VALUES (?,?,?,?,?,?,?)";
      PreparedStatement consulta = this.conexion.prepareStatement(SQL);
      consulta.setString(1, identificacionE);
      consulta.setString(2, nombreE);
      consulta.setString(3, apellidoE);
      consulta.setString(4, emailE);
      consulta.setString(5, telefono1E);
      consulta.setString(6, telefono2E);
      consulta.setString(7, cod_nucleos);
      consulta.execute();
      System.out.println("Registro insertado exitosamente");
    } catch (HeadlessException | SQLException e) {
      JOptionPane.showMessageDialog(null, "Error al insertar registro: " + e.getMessage());
    }
  }
  
  public void actualizarDatos(String identificacionE, String nombreE, String apellidoE, String emailE, String telefono1E,
      String telefono2E, String cod_nucleos) {
    try {
      String SQL = "UPDATE Empleados SET nombreE=?,apellidoE=?,emailE=?,telefono1E=?,telefono2E=?,cod_nucleos=? WHERE identificacionE=?";
      PreparedStatement consulta = this.conexion.prepareStatement(SQL);
      consulta.setString(1, nombreE);
      consulta.setString(2, apellidoE);
      consulta.setString(3, emailE);
      consulta.setString(4, telefono1E);
      consulta.setString(5, telefono2E);
      consulta.setString(6, cod_nucleos);
      consulta.setString(7, identificacionE);
      consulta.execute();
      System.out.println("Registro editado exitosamente");
    } catch (Exception e) {
      System.out.println("Error al editar el registro" + e.getMessage());
    }
  }
  
  public void eliminarRegistro(String identificacionE) {
    String SQL = "DELETE FROM Empleados WHERE identificacionE=?";
    try {
      PreparedStatement consulta = conexion.prepareStatement(SQL);
      consulta.setString(1, identificacionE);
      consulta.executeUpdate();
      System.out.println("Registro eliminado exitosamente");
    } catch (Exception e) {
      System.out.println("Error al eliminar registro " + e.getMessage());
    }
  }
}