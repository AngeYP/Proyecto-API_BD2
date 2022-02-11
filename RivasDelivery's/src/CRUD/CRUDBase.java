package CRUD;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class CRUDBase {
  private final Connection conexion;
  
  public CRUDBase(Connection conexion) {
        this.conexion = conexion;
  }
  
  /***********BUSCAR NOMBRE DEL PAIS************/
  public String buscarNombPais(String CodPais) {
        
    String NombPais = null;

    try {
      String SQL = "SELECT nombre_pais FROM Paises WHERE cod_pais = ?";
      PreparedStatement consulta = this.conexion.prepareStatement(SQL);
      consulta.setString(1, CodPais);
      ResultSet resultado = consulta.executeQuery();
      while (resultado.next()) {
        NombPais = resultado.getString("nombre_pais");
      }                            
    } catch (HeadlessException | SQLException e) {
      JOptionPane.showMessageDialog(null, "Fallo en la consulta" + e.getMessage());
    }
    return NombPais;
  }
  
  /***********BUSCAR CODIGO DEL PAIS************/
  public String buscarCodPais(String NombPais) {
        
    String CodPais = null;

    try {
      String SQL = "SELECT cod_pais FROM Paises WHERE nombre_pais = ?";
      PreparedStatement consulta = this.conexion.prepareStatement(SQL);
      consulta.setString(1, NombPais);
      ResultSet resultado = consulta.executeQuery();
      while (resultado.next()) {
        CodPais = resultado.getString("cod_pais");
      }                            
    } catch (HeadlessException | SQLException e) {
      JOptionPane.showMessageDialog(null, "Fallo en la consulta" + e.getMessage());
    }
    return CodPais;
  }
  
  /***********BUSCAR NOMBRE DEL ESTADO************/
  public String buscarNombEstado(String CodPais, String CodEstado) {

    String NombPais = null;

    try {
      String SQL = "SELECT nombre_estados FROM Estados WHERE cod_pais = ? AND cod_estados = ?";
      PreparedStatement consulta = this.conexion.prepareStatement(SQL);
      consulta.setString(1, CodPais);
      consulta.setString(2, CodEstado);
      ResultSet resultado = consulta.executeQuery();
      while (resultado.next()) {
        NombPais = resultado.getString("nombre_estados");
      }                            
    } catch (HeadlessException | SQLException e) {
      JOptionPane.showMessageDialog(null, "Fallo en la consulta" + e.getMessage());
    }
    return NombPais;
  }

  /***********BUSCAR CODIGO DEL ESTADO************/
  public String buscarCodEstado(String NombEstado, String CodPais) {
        
    String CodEstado = null;

    try {
      String SQL = "SELECT cod_estados FROM Estados WHERE nombre_estados = ? AND cod_pais = ?";
      PreparedStatement consulta = this.conexion.prepareStatement(SQL);
      consulta.setString(1, NombEstado);
      consulta.setString(2, CodPais);
      ResultSet resultado = consulta.executeQuery();
      while (resultado.next()) {
        CodEstado = resultado.getString("cod_estados");
      }                            
    } catch (HeadlessException | SQLException e) {
      JOptionPane.showMessageDialog(null, "Fallo en la consulta" + e.getMessage());
    }
    return CodEstado;
  }
  
  /***********BUSCAR NOMBRE DE LA CIUDAD************/
  public String buscarNombCiudad(String CodPais, String CodEstado, String CodCiudades) {
        
    String NombEstado = null;

    try {
      String SQL = "SELECT nombre_ciudades FROM Ciudades WHERE cod_pais = ? AND cod_estados = ? AND cod_ciudades = ?";
      PreparedStatement consulta = this.conexion.prepareStatement(SQL);
      consulta.setString(1, CodPais);
      consulta.setString(2, CodEstado);
      consulta.setString(3, CodCiudades);
      ResultSet resultado = consulta.executeQuery();
      while (resultado.next()) {
        NombEstado = resultado.getString("nombre_ciudades");
      }                            
    } catch (HeadlessException | SQLException e) {
      JOptionPane.showMessageDialog(null, "Fallo en la consulta" + e.getMessage());
    }
    return NombEstado;
  }
  
  /***********BUSCAR CODIGO DE LA CIUDAD************/
  public String buscarCodCiudad(String CodPais, String CodEstado, String NombCiudades) {

    String CodCiudad = null;

    try {
      String SQL = "SELECT cod_ciudades FROM Ciudades WHERE cod_pais = ? AND cod_estados = ? AND nombre_ciudades = ?";
      PreparedStatement consulta = this.conexion.prepareStatement(SQL);
      consulta.setString(1, CodPais);
      consulta.setString(2, CodEstado);
      consulta.setString(3, NombCiudades);
      ResultSet resultado = consulta.executeQuery();
      while (resultado.next()) {
        CodCiudad = resultado.getString("cod_ciudades");
      }                            
    } catch (HeadlessException | SQLException e) {
      JOptionPane.showMessageDialog(null, "Fallo en la consulta" + e.getMessage());
    }
    return CodCiudad;
  }
  
  /********LLENAR EL COMBOBOX DE PAISES*********/
  public void obtenerPais(JComboBox cb) {
    try {
      String SQL = "SELECT * FROM Paises ORDER BY nombre_pais ASC";
      PreparedStatement consulta = this.conexion.prepareStatement(SQL);
      ResultSet resultado = consulta.executeQuery();
      cb.addItem("Seleccione una opcion");
      while (resultado.next()) {
          cb.addItem(resultado.getString("nombre_pais"));
      }
    } catch (SQLException ex) {
      JOptionPane.showMessageDialog(null, "Fallo: " + ex.getMessage());
    }
  }
  
  /*********LLENAR COMBOBOX DE PAISES*********/
  public void comboboxPaises(JComboBox cb) {
    try {
      String SQL = "SELECT * FROM Paises ORDER BY nombre_pais ASC";
      PreparedStatement consulta = conexion.prepareStatement(SQL);
      ResultSet resultado = consulta.executeQuery();
      cb.addItem("Seleccione una opcion");
      while (resultado.next()) {
        cb.addItem(resultado.getString("nombre_pais"));
      }
    } catch (SQLException ex) {
      JOptionPane.showMessageDialog(null, "Fallo: "+ex.getMessage());
    }
  }
  
  /*********LLENAR COMBOBOX DE ESTADOS*********/
  public void comboboxEstados(JComboBox cb, String codpais) {

    try {
      String SQL = "SELECT * FROM Estados WHERE cod_pais = ? ORDER BY nombre_estados ASC";
      PreparedStatement consulta = conexion.prepareStatement(SQL);
      consulta.setString(1, codpais);
      ResultSet resultado = consulta.executeQuery();
      cb.addItem("Seleccione una opcion");
      while (resultado.next()) {
        cb.addItem(resultado.getString("nombre_estados"));
      }
    } catch (SQLException ex) {
      JOptionPane.showMessageDialog(null, "Fallo: "+ex.getMessage());
    }
  }
  
  /*********LLENAR COMBOBOX DE CIUDADES*********/
  public void comboboxCiudad(JComboBox cb, String codpais, String codestado) {

    try {
      String SQL = "SELECT * FROM Ciudades WHERE cod_pais = ? AND cod_estados = ? ORDER BY nombre_ciudades ASC";
      PreparedStatement consulta = conexion.prepareStatement(SQL);
      consulta.setString(1, codpais);
      consulta.setString(2, codestado);
      ResultSet resultado = consulta.executeQuery();
      cb.addItem("Seleccione una opcion");
      while (resultado.next()) {
        cb.addItem(resultado.getString("nombre_ciudades"));
      }
    } catch (SQLException ex) {
      JOptionPane.showMessageDialog(null, "Fallo: "+ex.getMessage());
    }
  }
  
  /*********BUSCAR EL NUCLEO DEL EMPLEADO*********/
  public String buscarNucleoEmp(String CIEmpleado) {
        
    String NucleoEmp = null;

    try {
      String SQL = "SELECT cod_nucleos FROM Empleados WHERE identificacionE = ?";
      PreparedStatement consulta = this.conexion.prepareStatement(SQL);
      consulta.setString(1, CIEmpleado);
      ResultSet resultado = consulta.executeQuery();
      while (resultado.next()) {
        NucleoEmp = resultado.getString("cod_nucleos");
      }                            
    } catch (HeadlessException | SQLException e) {
      JOptionPane.showMessageDialog(null, "Fallo en la consulta" + e.getMessage());
    }
    return NucleoEmp;
  }
  
  /*********BUSCAR EL NOMBRE DEL NUCLEO*********/
  public String buscarNombNucleo(String CodNucleo) {
        
    String NombNucleo = null;

    try {
      String SQL = "SELECT nombre_nucleo FROM Nucleo WHERE cod_nucleo = ?";
      PreparedStatement consulta = this.conexion.prepareStatement(SQL);
      consulta.setString(1, CodNucleo);
      ResultSet resultado = consulta.executeQuery();
      while (resultado.next()) {
        NombNucleo = resultado.getString("nombre_nucleo");
      }                            
    } catch (HeadlessException | SQLException e) {
      JOptionPane.showMessageDialog(null, "Fallo en la consulta" + e.getMessage());
    }
    return NombNucleo;
  }
}
