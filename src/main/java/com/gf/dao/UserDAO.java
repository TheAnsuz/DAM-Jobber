/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gf.dao;

import com.gf.controller.Controller;
import com.gf.entities.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Sabri
 */
public class UserDAO {

    public int insertUser(User user) {
        int resultado = 0;
        String sqlInsert = "";
        try ( Connection con = GlobalDAO.conectarBD()) {
            sqlInsert = "INSERT INTO usuarios (id_usuario, nombre_usuario, correo_usuario, contrasena_usuario) VALUES (null, ?, ?, ?)";
            PreparedStatement ps = con.prepareCall(sqlInsert);
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getEmail());
            ps.setString(3, user.getPassword());
            resultado = ps.executeUpdate();
            ps.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
            Controller.getView().showWarning("Error al crear usuario");
//            JOptionPane.showMessageDialog(null, "Error de insercion usuarios", "Insert users", JOptionPane.ERROR_MESSAGE);
        }
        return resultado;
    }

    public User validUser(String nombre, String contrasena) {
        if (nombre == null || contrasena == null) {
            return null;
        }
        if (nombre.trim().length() < 1 || contrasena.trim().length() < 1) {
            return null;
        }
        try ( Connection con = GlobalDAO.conectarBD()) {
            if (con.isClosed()) {
                return null;
            }
            String sqlSelect = "SELECT * FROM usuarios where nombre_usuario like '" + nombre + "' and contrasena_usuario like '" + Controller
                    .getData().cipher(contrasena) + "'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sqlSelect);
            if (rs.next()) {
                return createUser(rs);
            }
            rs.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
            Controller.getView().showWarning("Error al validar usuario");
        }
        return null;
    }

    private User createUser(ResultSet result) throws SQLException {
        return new User(result.getInt(1), result.getString(2), result
                .getString(3), null);
    }

}
