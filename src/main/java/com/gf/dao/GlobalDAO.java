package com.gf.dao;

import com.gf.controller.Controller;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Adrian MRV. aka AMRV || Ansuz
 */
public class GlobalDAO {

    private static String host = Controller.getConfiguration()
            .getDefaultConfig("sql.host", "localhost");
    private static String database = Controller.getConfiguration()
            .getDefaultConfig("sql.database", "jobber");
    private static String puerto = Controller.getConfiguration()
            .getDefaultConfig("sql.port", "3306");
    private static String user = Controller.getConfiguration()
            .getDefaultConfig("sql.user", "root");
    private static String passwd = Controller.getConfiguration()
            .getDefaultConfig("sql.pass", "");

    /**
     * Obtiene la url de la conexion a la base de datos
     *
     * @return la url de conexion
     */
    public static String getUrl() {
        return "jdbc:mysql://" + host + ":" + puerto + "/" + database;
    }

    private static Connection con;

    /**
     * Crea una conexion a la base de datos de la aplicacion
     *
     * @return una instancia de la conexion a la base de datos
     */
    public static Connection conectarBD() {
        try {
            con = DriverManager.getConnection(getUrl());
        } catch (SQLException ex) {
            Controller.getView()
                    .showWarning("Error al conectar a la base de datos");
//            JOptionPane.showMessageDialog(null, "Error de conexión a la BD", "Conexión BD", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(GlobalDAO.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        return con;
    }

}
