package CRUD;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class CRUDEmpleadoRecarga {
  private final Connection conexion;
  
  public CRUDEmpleadoRecarga(Connection conexion) {
        this.conexion = conexion;
  }
  
  public void insertarDatos(String CICliente, String CIEmpleado, float Saldo) { 
    java.sql.Timestamp date = new java.sql.Timestamp(new java.util.Date().getTime());
    try {
      String SQL = "INSERT INTO Recargas(identificacionC,identificacionE,fecha_recarga,saldo_recarga)"
              + " VALUES (?,?,?,?)";
      PreparedStatement consulta = this.conexion.prepareStatement(SQL);
      consulta.setString(1, CICliente);
      consulta.setString(2, CIEmpleado);
      consulta.setTimestamp(3, date);
      consulta.setFloat(4, Saldo);
      consulta.execute();
      System.out.println("Registro insertado exitosamente");
    } catch (HeadlessException | SQLException e) {
      JOptionPane.showMessageDialog(null, "Error al insertar registro: " + e.getMessage());
    }
  }
}
