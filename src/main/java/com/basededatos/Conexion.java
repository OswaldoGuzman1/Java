package com.basededatos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    
    public Connection get_Connection(){
        Connection conexion = null;
        try {
            conexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/mensajes","root","");
            if(conexion!=null){
                System.out.println("conexion exitosa");
            }
        }catch (SQLException e){
            System.out.println("conexion fallida "+e);
        }
        return conexion;
    }
    
}
