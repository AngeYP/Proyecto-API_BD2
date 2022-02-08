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
  
  public String[] buscarEmpleado(String CIEmpleado) {
        
    String[] datosEmp = new String[3];

    try {
      String SQL = "SELECT * FROM Empleados WHERE identificacionE = ?";
      PreparedStatement consulta = this.conexion.prepareStatement(SQL);
      consulta.setString(1, CIEmpleado);
      ResultSet resultado = consulta.executeQuery();

      while (resultado.next()) {
          datosEmp[0] = resultado.getString("nombreE");
          datosEmp[1] = resultado.getString("apellidoE");
          datosEmp[2] = resultado.getString("nombre_nucleos");
      }                            
    } catch (HeadlessException | SQLException e) {
        JOptionPane.showMessageDialog(null, "Fallo en la consulta" + e.getMessage());
    }
    return datosEmp;
  }
}