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
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.Date;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CRUDEmpleadoAsignarEncom {
  private final Connection conexion;
  
  public CRUDEmpleadoAsignarEncom(Connection conexion) {
        this.conexion = conexion;
  }
  
  public DefaultTableModel mostrarDatosConFechas(String Estatus, String Nucleos, String FechaIni, String FechaFin) {
    String[] titulos = {"Codigo Encomienda", "Cedula Cliente", "Fecha Procesada","Pais", "Estado", "Ciudad", "Transportista"};
    String[] registros = new String[67];
    DefaultTableModel tabla = new DefaultTableModel(null, titulos);
    
    try {
        Date date1= Date.valueOf(FechaIni);
        Date date2 = Date.valueOf(FechaFin);
      String SQL = "SELECT * FROM Encomiendas WHERE estatusE = ? AND cod_nucleo = ? AND fecha_creada <= "+FechaIni+" AND fecha_creada >="+FechaFin;
      PreparedStatement consulta = this.conexion.prepareStatement(SQL);
      consulta.setString(1, Estatus);
      consulta.setString(2, Nucleos);
      ResultSet resultado = consulta.executeQuery();
      while (resultado.next()) {
        registros[0] = resultado.getString("cod_encomienda");
        registros[1] = resultado.getString("identificacionC");
        registros[2] = resultado.getString("fecha_creada");
        registros[3] = resultado.getString("cod_pais");
        registros[4] = resultado.getString("cod_estados");
        registros[5] = resultado.getString("cod_ciudades");
        registros[6] = resultado.getString("identificacionT");
        tabla.addRow(registros);
      }
    } catch (SQLException e) {
      JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
    }
    return tabla;
  }
  
  public DefaultTableModel mostrarDatosSinFechas(String Estatus, String Nucleos) {
    String[] titulos = {"Codigo Encomienda", "Cedula Cliente", "Fecha Procesada","Pais", "Estado", "Ciudad", "Transportista"};
    String[] registros = new String[67];
    DefaultTableModel tabla = new DefaultTableModel(null, titulos);
    try {
      String SQL = "SELECT * FROM Encomiendas WHERE estatusE = ? AND cod_nucleo = ?";
      PreparedStatement consulta = this.conexion.prepareStatement(SQL);
      consulta.setString(1, Estatus);
      consulta.setString(2, Nucleos);
      ResultSet resultado = consulta.executeQuery();
      while (resultado.next()) {
        registros[0] = resultado.getString("cod_encomienda");
        registros[1] = resultado.getString("identificacionC");
        registros[2] = resultado.getString("fecha_creada");
        registros[3] = resultado.getString("cod_pais");
        registros[4] = resultado.getString("cod_estados");
        registros[5] = resultado.getString("cod_ciudades");
        registros[6] = resultado.getString("identificacionT");
        tabla.addRow(registros);
      }
    } catch (SQLException e) {
      JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
    }
    return tabla;
  }
  
  public DefaultTableModel mostrarDatosConInicio(String Estatus, String Nucleos, String FechaIni) {
    String[] titulos = {"Codigo Encomienda", "Cedula Cliente", "Fecha Procesada","Pais", "Estado", "Ciudad", "Transportista"};
    String[] registros = new String[67];
    DefaultTableModel tabla = new DefaultTableModel(null, titulos);
    try {
      String SQL = "SELECT * FROM Encomiendas WHERE estatusE = ? AND cod_nucleo = ? AND fecha_creada <= "+FechaIni;
      PreparedStatement consulta = this.conexion.prepareStatement(SQL);
      consulta.setString(1, Estatus);
      consulta.setString(2, Nucleos);
      ResultSet resultado = consulta.executeQuery();
      while (resultado.next()) {
        registros[0] = resultado.getString("cod_encomienda");
        registros[1] = resultado.getString("identificacionC");
        registros[2] = resultado.getString("fecha_creada");
        registros[3] = resultado.getString("cod_pais");
        registros[4] = resultado.getString("cod_estados");
        registros[5] = resultado.getString("cod_ciudades");
        registros[6] = resultado.getString("identificacionT");
        tabla.addRow(registros);
      }
    } catch (SQLException e) {
      JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
    }
    return tabla;
  }
  
    public DefaultTableModel mostrarDatosConFin(String Estatus, String Nucleos, String FechaFin) {
    String[] titulos = {"Codigo Encomienda", "Cedula Cliente", "Fecha Procesada","Pais", "Estado", "Ciudad", "Transportista"};
    String[] registros = new String[67];
    DefaultTableModel tabla = new DefaultTableModel(null, titulos);
    try {
      String SQL = "SELECT * FROM Encomiendas WHERE estatusE = ? AND cod_nucleo = ? AND fecha_creada >= "+FechaFin;
      PreparedStatement consulta = this.conexion.prepareStatement(SQL);
      consulta.setString(1, Estatus);
      consulta.setString(2, Nucleos);
      ResultSet resultado = consulta.executeQuery();
      while (resultado.next()) {
        registros[0] = resultado.getString("cod_encomienda");
        registros[1] = resultado.getString("identificacionC");
        registros[2] = resultado.getString("fecha_creada");
        registros[3] = resultado.getString("cod_pais");
        registros[4] = resultado.getString("cod_estados");
        registros[5] = resultado.getString("cod_ciudades");
        registros[6] = resultado.getString("identificacionT");
        tabla.addRow(registros);
      }
    } catch (SQLException e) {
      JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
    }
    return tabla;
  }
    
  /*********LLENAR COMBOBOX DE TRANSPORTISTA*********/
  public void comboboxTransportista(JComboBox cb, String CodEncomienda) {

    try {
      String SQL = "SELECT * FROM Solicitan WHERE cod_encomienda = ? ORDER BY identificacionT ASC";
      PreparedStatement consulta = conexion.prepareStatement(SQL);
      consulta.setString(1, CodEncomienda);
      ResultSet resultado = consulta.executeQuery();
      cb.addItem("Seleccione una opcion");
      while (resultado.next()) {
        cb.addItem(resultado.getString("identificacionT"));
      }
    } catch (SQLException ex) {
      JOptionPane.showMessageDialog(null, "Fallo: "+ex.getMessage());
    }
  }
  
  public String[] buscarTrasportista (String cedulaTransp) {
    String[] datosTransp = new String[2];
    try {
      String SQL = "SELECT * FROM Transportistas WHERE identificacionT = ?";
      PreparedStatement consulta = this.conexion.prepareStatement(SQL);
      consulta.setString(1, cedulaTransp);
      ResultSet resultado = consulta.executeQuery();
      while (resultado.next()) {
          datosTransp[0] = resultado.getString("nombreT");
          datosTransp[1] = resultado.getString("apellidoT");
      }                            
    } catch (HeadlessException | SQLException e) {
        JOptionPane.showMessageDialog(null, "Fallo en la consulta: " + e.getMessage());
    }
    return datosTransp;
  }
  
  public void actualizarDatos(String CodEncomienda, String cedulaTransp) {
    try {
      String SQL = "UPDATE Encomiendas SET identificacionT=?,estatusE=? WHERE cod_encomienda=?";
      PreparedStatement consulta = this.conexion.prepareStatement(SQL);
      consulta.setString(1, cedulaTransp);
      consulta.setString(2, "T");
      consulta.setString(3, CodEncomienda);
      consulta.execute();
      System.out.println("Registro editado exitosamente");
    } catch (Exception e) {
      System.out.println("Error al editar el registro" + e.getMessage());
    }
  }
  
  public String[] buscarDatosTrasportista (String cedulaTransp) {
    String[] datosTransp = new String[6];
    try {
      String SQL = "SELECT * FROM Transportistas WHERE identificacionT = ?";
      PreparedStatement consulta = this.conexion.prepareStatement(SQL);
      consulta.setString(1, cedulaTransp);
      ResultSet resultado = consulta.executeQuery();
      while (resultado.next()) {
          datosTransp[0] = resultado.getString("nombreT");
          datosTransp[1] = resultado.getString("apellidoT");
          datosTransp[2] = resultado.getString("telefono1T");
          datosTransp[3] = resultado.getString("emailT");
          datosTransp[4] = resultado.getString("antecedentes_penalesT");
          datosTransp[5] = resultado.getString("pedidos_realizadosT");
      }                            
    } catch (HeadlessException | SQLException e) {
        JOptionPane.showMessageDialog(null, "Fallo en la consulta: " + e.getMessage());
    }
    return datosTransp;
  }
}
