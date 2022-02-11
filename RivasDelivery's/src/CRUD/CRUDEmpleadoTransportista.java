package CRUD;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class CRUDEmpleadoTransportista {
  private final Connection conexion;
  
  public CRUDEmpleadoTransportista(Connection conexion) {
        this.conexion = conexion;
  }
  
  public String[] buscarTrasportista (String cedulaTransp) {
    String[] datosTransp = new String[14];
    
    try {
      String SQL = "SELECT * FROM Transportistas WHERE identificacionT = ?";
      PreparedStatement consulta = this.conexion.prepareStatement(SQL);
      consulta.setString(1, cedulaTransp);
      ResultSet resultado = consulta.executeQuery();

      while (resultado.next()) {
          datosTransp[0] = resultado.getString("identificacionT");
          datosTransp[1] = resultado.getString("nacionalidadT");
          datosTransp[2] = resultado.getString("nombreT");
          datosTransp[3] = resultado.getString("apellidoT");
          datosTransp[4] = resultado.getString("emailT");
          datosTransp[5] = resultado.getString("telefono1T");
          datosTransp[6] = resultado.getString("telefono2T");
          datosTransp[7] = resultado.getString("lic_conducirT");
          datosTransp[8] = resultado.getString("fecha_ingreso");
          datosTransp[9] = resultado.getString("antecedentes_penalesT");
          datosTransp[10] = resultado.getString("pedidos_realizadosT");
          datosTransp[11] = resultado.getString("saldoT");
          datosTransp[12] = resultado.getString("codigo_curso");
          datosTransp[13] = resultado.getString("cod_nucleos");
      }                            
    } catch (HeadlessException | SQLException e) {
        JOptionPane.showMessageDialog(null, "Fallo en la consulta" + e.getMessage());
    }
    
    return datosTransp;
  }
  
  public void insertarDatos(String CITransportista, char Nacionalidad, String Nombre, String Apellido, String Email, String Telefono1, 
      String Telefono2, String LicenciaC, String AntecedentesP, String CodNucleo) {
    java.sql.Timestamp date = new java.sql.Timestamp(new java.util.Date().getTime());
    try {
      String SQL = "INSERT INTO Transportistas(identificacionT,nacionalidadT,nombreT,apellidoT,emailT,telefono1T,telefono2T,lic_conducirT,fecha_ingreso,antecedentes_penalesT,pedidos_realizadosT,saldoT,cod_nucleos) "
              + " VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
      PreparedStatement consulta = this.conexion.prepareStatement(SQL);
      consulta.setString(1, CITransportista);
      consulta.setString(2, String.valueOf(Nacionalidad));
      consulta.setString(3, Nombre);
      consulta.setString(4, Apellido);
      consulta.setString(5, Email);
      consulta.setString(6, Telefono1);
      consulta.setString(7, Telefono2);
      consulta.setString(8, LicenciaC);
      consulta.setTimestamp(9, date);
      consulta.setString(10, AntecedentesP);
      consulta.setFloat(11, 0);
      consulta.setFloat(12, 0);
      consulta.setString(13, CodNucleo);
      consulta.execute();
      System.out.println("Registro insertado exitosamente");
    } catch (HeadlessException | SQLException e) {
      JOptionPane.showMessageDialog(null, "Error al insertar registro: " + e.getMessage());
    }
  }

  public void actualizarDatos(String CITransportista, String Nacionalidad, String Nombre, String Apellido, String Email, String Telefono1, 
      String Telefono2, String LicenciaC, String AntecedentesP,String codNucleo) {
    try {
        System.out.println(CITransportista);       System.out.println(Nacionalidad);       System.out.println(Nombre);       System.out.println(Apellido);       System.out.println(Email);       System.out.println(Telefono1);       System.out.println(Telefono2);       System.out.println(LicenciaC);       System.out.println(AntecedentesP);       System.out.println(Nacionalidad);
      String SQL = "UPDATE Transportistas SET nacionalidadT=?,nombreT=?,apellidoT=?,emailT=?,telefono1T=?,telefono2T=?,lic_conducirT=?,antecedentes_penalesT=?,cod_nucleos=? WHERE identificacionT=?";
      PreparedStatement consulta = this.conexion.prepareStatement(SQL);
      consulta.setString(1, Nacionalidad);
      consulta.setString(2, Nombre);
      consulta.setString(3, Apellido);
      consulta.setString(4, Email);
      consulta.setString(5, Telefono1);
      consulta.setString(6, Telefono2);
      consulta.setString(7, LicenciaC);
      consulta.setString(8, AntecedentesP);
      consulta.setString(9, codNucleo);
      consulta.setString(10, CITransportista);
      
      consulta.execute();
      System.out.println("Registro editado exitosamente");
    } catch (SQLException e) {
      System.out.println("Error al editar el registro" + e.getMessage());
    }
  }
  
  public void eliminarRegistro(String CITransportista) {
    String SQL = "DELETE FROM Transportistas WHERE identificacionT=?";
    try {
      PreparedStatement consulta = conexion.prepareStatement(SQL);
      consulta.setString(1, CITransportista);
      consulta.executeUpdate();
      System.out.println("Registro eliminado exitosamente");
    } catch (Exception e) {
      System.out.println("Error al eliminar registro " + e.getMessage());
    }
  }
}
