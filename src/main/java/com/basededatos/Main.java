package com.basededatos;

public class Main {
    public static void main(String[] args) {
        Conexion conexion = new Conexion();
        try {
            conexion.get_Connection();
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
}