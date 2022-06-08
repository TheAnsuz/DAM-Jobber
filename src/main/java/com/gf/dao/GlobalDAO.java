package com.gf.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Adrian MRV. aka AMRV || Ansuz
 */
public class GlobalDAO {

    public static String host = "localhost";
    public static String database = "jobber";
    public static String puerto = "3306";
    public static String user = "root";
    public static String passwd = "";
    public static String url = "jdbc:mysql://" + host + ":" + puerto + "/" + database;

    public static String getUrl() {
        return url;
    }

    public static Connection con;

    public static Connection conectarBD() {
        try {
            con = DriverManager.getConnection(url, user, passwd);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexión a la BD", "Conexión BD", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(GlobalDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }

}
