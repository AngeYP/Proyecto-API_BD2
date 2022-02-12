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

    /**
     * *********BUSCAR EMPLEADO***********
     */
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

    /**
     * *********BUSCAR EMPLEADO***********
     */
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

    /**
     * *********BUSCAR EMPLEADO***********
     */
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

    //***************FUNCION QUE CIFRA UN CONTRASENA CON CESAR******************
    public String cifradoCesar(String mensaje, int offset) {
        StringBuilder result = new StringBuilder();
        for (char character : mensaje.toCharArray()) {
            if (character != ' ') {
                int originalAlphabetPosition = character - 'a';
                int newAlphabetPosition = (originalAlphabetPosition + offset) % 26;
                char newCharacter = (char) ('a' + newAlphabetPosition);
                result.append(newCharacter);
            } else {
                result.append(character);
            }
        }
        return result.toString();
    }

    //*****************************FUNCION QUE BUSCA LA CONSTRASENA*************
    public String buscarContrasenha(String cedula, String contrasenha) {

        String clave = null;

        try {
            String SQL = "SELECT clave FROM Usuarios WHERE identificacion = ? AND clave = ?";
            PreparedStatement consulta = this.conexion.prepareStatement(SQL);
            consulta.setString(1, cedula);
            consulta.setString(2, contrasenha);
            ResultSet resultado = consulta.executeQuery();
            while (resultado.next()) {
                clave = resultado.getString("clave");
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Fallo en la consulta" + e.getMessage());
        }
        return clave;
    }

    //***********FUNCION QUE VERIFICA SI UN USUARIO EXISTE****************
    public String verificarUsuario(String usuario) {

        String cedula = null;

        try {
            String SQL = "SELECT identificacion FROM Usuarios WHERE identificacion = ?";
            PreparedStatement consulta = this.conexion.prepareStatement(SQL);
            consulta.setString(1, usuario);
            ResultSet resultado = consulta.executeQuery();
            while (resultado.next()) {
                cedula = resultado.getString("identificacion");
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Fallo en la consulta" + e.getMessage());
        }
        return cedula;
    }

    //***********FUNCION QUE INSERTA UN USUARIO****************
    public void insertarUsuario(String usuario, String clave) {
        try {
            String SQL = "INSERT INTO Usuarios(identificacion,clave) VALUES (?,?)";
            PreparedStatement consulta = this.conexion.prepareStatement(SQL);
            consulta.setString(1, usuario);
            consulta.setString(2, clave);
            consulta.execute();
            System.out.println("Registro insertado exitosamente");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al insertar registro: " + e.getMessage());
        }
    }
}
