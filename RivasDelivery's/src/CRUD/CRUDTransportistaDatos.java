/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUD;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
/**
 *
 * @author Noel Roberto
 */
public class CRUDTransportistaDatos {
    private final Connection conexion;

    public CRUDTransportistaDatos(Connection conexion) {
        this.conexion = conexion;
    }
    
    public String []datos(String id){
        
        String []tabla=new String[7];
                       
        try {
            String SQL = "SELECT * FROM Transportistas WHERE identificacionT = ?";
            PreparedStatement consulta = this.conexion.prepareStatement(SQL);
            consulta.setString(1, id);
            System.out.println("Consulta exitosa");
            ResultSet resultado = consulta.executeQuery();
            
            while (resultado.next()) {                
                tabla[0] = resultado.getString("identificacionT");
                tabla[1] = resultado.getString("nombreT")+" "+resultado.getString("apellidoT");
                tabla[2] = resultado.getString("emailT");
                tabla[3] = resultado.getString("telefono1T");
                tabla[4] = String.valueOf(resultado.getFloat("saldoT"));
                tabla[5] = resultado.getString("cod_nucleos");
                tabla[6] = resultado.getString("codigo_curso");
            }
        } catch (Exception e) {
            System.out.println("Fallo en la consulta: "+e.getMessage());
        }
        return tabla;
    }
    
    public boolean insertSolicitud(String id, String codigoEncomienda){
        
        try {
            String sql = "INSERT INTO Solicitan (identificacionT,cod_encomienda) "
                    + "VALUES(?,?)";
            PreparedStatement insert = this.conexion.prepareStatement(sql);
            insert.setString(1, id);
            insert.setString(2, codigoEncomienda);
            insert.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println("Fallo en insercion: "+e.getMessage());
            return false;
        }
        
    }
    
    public List<Encomiendas> encomiendasDisponibles(String id,String pais,String estado, String ciudad){
        List<Encomiendas> lista=new ArrayList<Encomiendas>();
        try {
            String sql1 = "SELECT * FROM Transportistas WHERE identificacionT = ?";
            PreparedStatement busqueda = this.conexion.prepareStatement(sql1);
            busqueda.setString(1, id);
            ResultSet res =busqueda.executeQuery();
            String nucleo="";
            while (res.next()) {                
                nucleo = res.getString("cod_nucleos");
            }
            String sql = "SELECT * FROM encomiendasDisponibles "
                    + "WHERE cod_pais= ? "
                    + "AND cod_estados = ? "
                    + "AND cod_ciudades = ?"
                    + "AND cod_nucleo = ?";
            PreparedStatement consulta = this.conexion.prepareStatement(sql);
            consulta.setString(1, pais);
            consulta.setString(2, estado);
            consulta.setString(3, ciudad);
            consulta.setString(4, nucleo);
            ResultSet resultado =consulta.executeQuery();
            
            while (resultado.next()) {                
                lista.add(new Encomiendas(resultado.getString("cod_encomienda"),
                resultado.getString("estatusE"),
                resultado.getString("cod_pais"),
                resultado.getString("cod_estados"),
                resultado.getString("cod_ciudades"),
                resultado.getString("precio_total"),
                resultado.getString("distancia_recorrida"),
                resultado.getString("precio_peso")));
            }
            return lista;
        } catch (Exception e) {
            System.out.println("Error en consulta: "+e.getMessage());
            return null;
        }
    }
    
    public List<Encomiendas> encomiendasActuales(String id){
        List<Encomiendas> encomienda=new ArrayList<>();
        
        try {
            String sql = "SELECT * FROM Encomiendas WHERE identificacionT= ? GROUP BY estatusE";
            PreparedStatement consulta = this.conexion.prepareStatement(sql);
            consulta.setString(1, id);
            ResultSet resultado = consulta.executeQuery();
            
            while (resultado.next()) {                
                encomienda.add(new Encomiendas(resultado.getString("cod_encomienda"),
                resultado.getString("estatusE"),
                resultado.getString("cod_pais"),
                resultado.getString("cod_estados"),
                resultado.getString("cod_ciudades"),
                resultado.getString("precio_total"),
                resultado.getString("distancia_recorrida"),
                resultado.getString("precio_peso")));
            }
        } catch (Exception e) {
            System.out.println("Error en la consulta: "+e.getMessage());
        }finally{
            return encomienda;
        }
    }
    
  public void comboboxVuelos(JComboBox cb, String CITransportista) {
    try {
      String SQL = "SELECT * FROM Vuelos WHERE CITransportista = ?";
      PreparedStatement consulta = conexion.prepareStatement(SQL);
      consulta.setString(1, CITransportista);
      ResultSet resultado = consulta.executeQuery();
      cb.addItem("Seleccione una opcion");
      while (resultado.next()) {
        cb.addItem(resultado.getString("cod_vuelos"));
      }
    } catch (SQLException ex) {
      JOptionPane.showMessageDialog(null, "Fallo: "+ex.getMessage());
    }
  }
  
  public void agregarVuelo(String CodEncomienda, String CITransp, String CodVuelo) {
    try {
      String SQL = "UPDATE Encomiendas SET cod_vuelos=? WHERE cod_encomienda=? AND identificacionT";
      PreparedStatement consulta = this.conexion.prepareStatement(SQL);
      consulta.setString(1, CodVuelo);
      consulta.setString(2, CodEncomienda);
      consulta.setString(3, CITransp);
      consulta.execute();
      System.out.println("Registro editado exitosamente");
    } catch (SQLException e) {
      System.out.println("Error al editar el registro" + e.getMessage());
    }
  }
}
