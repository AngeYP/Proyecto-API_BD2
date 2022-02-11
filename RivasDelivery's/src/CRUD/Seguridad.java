/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
 * @author Gustavo
 */
public class Seguridad {
    
    private final Connection conexion;

    public Seguridad(Connection conexion) {
        this.conexion = conexion;
    }
    
    /***********BUSCAR EMPLEADO************/
  public String buscarEmpleado(String cedula) {
        
    String NombPais = null;

    try {
      String SQL = "SELECT identificacionE FROM Empleados WHERE identificacionE = ?";
      PreparedStatement consulta = this.conexion.prepareStatement(SQL);
      consulta.setString(1, cedula);
      ResultSet resultado = consulta.executeQuery();
      while (resultado.next()) {
        NombPais = resultado.getString("identificacionE");
      }                            
    } catch (HeadlessException | SQLException e) {
      JOptionPane.showMessageDialog(null, "Fallo en la consulta" + e.getMessage());
    }
    return NombPais;
  }
  
    /***********BUSCAR EMPLEADO************/
  public String buscarCliente(String cedula) {
        
    String NombPais = null;

    try {
      String SQL = "SELECT identificacionC FROM Clientes WHERE identificacionC = ?";
      PreparedStatement consulta = this.conexion.prepareStatement(SQL);
      consulta.setString(1, cedula);
      ResultSet resultado = consulta.executeQuery();
      while (resultado.next()) {
        NombPais = resultado.getString("identificacionC");
      }                            
    } catch (HeadlessException | SQLException e) {
      JOptionPane.showMessageDialog(null, "Fallo en la consulta" + e.getMessage());
    }
    return NombPais;
  }
  
    /***********BUSCAR EMPLEADO************/
  public String buscarTransportista(String cedula) {
        
    String NombPais = null;

    try {
      String SQL = "SELECT identificacionT FROM Transportistas WHERE identificacionT = ?";
      PreparedStatement consulta = this.conexion.prepareStatement(SQL);
      consulta.setString(1, cedula);
      ResultSet resultado = consulta.executeQuery();
      while (resultado.next()) {
        NombPais = resultado.getString("identificacionT");
      }                            
    } catch (HeadlessException | SQLException e) {
      JOptionPane.showMessageDialog(null, "Fallo en la consulta" + e.getMessage());
    }
    return NombPais;
  }
    
}
