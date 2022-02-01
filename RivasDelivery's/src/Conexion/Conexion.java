package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private Connection conectado = null;
    private final String jdbc = "jdbc:mysql://labs-dbservices01.ucab.edu.ve/";
    public Connection conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectado = DriverManager.getConnection(jdbc+"bd2_202225_grupo3", "bd2_202125_25512833", "25512833");
            System.out.println("conexion exitosa");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("error de conexion "+e.getMessage());
        }
        return conectado;
    }
}