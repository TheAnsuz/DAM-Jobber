package com.gf.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author Adrian MRV. aka AMRV || Ansuz
 */
public class GlobalDAO {

    private static String url = "jdbc:mysql://localhost:3306/jobber";
    private static Connection con;
    public static Statement st;

     public static void conectarBaseDatos(){
        try {
            con = DriverManager.getConnection(url, "root", "");
            st = con.createStatement();
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
     
     public static void conexion(){
         if (con == null){
             conectarBaseDatos();
         } else {
             System.out.println("Ya estas conectado a la base de datos");
         }
     }

    public static String getUrl() {
        return url;
    }

    public static Connection getCon() {
        conexion();
        return con;
    }

    public static Statement getSt() {
        return st;
    }
    
    
}
