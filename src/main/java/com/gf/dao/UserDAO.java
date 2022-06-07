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
        try (Connection con = GlobalDAO.getCon()) {
            sqlInsert = "INSERT INTO usuarios (id_usuario, nombre_usuario, correo_usuario, contrasena_usuario) VALUES (null, ?, ?, ?)";
            PreparedStatement ps = con.prepareCall(sqlInsert);
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getEmail());
            ps.setString(3, user.getPassword());
            resultado = ps.executeUpdate();
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de BD", "Insert", JOptionPane.ERROR_MESSAGE);
        }
        return resultado;
    }

    public boolean validUser(String nombre, String contrasena) {
        if (nombre == null || contrasena == null) {
            return false;
        }
        if (nombre.trim().length() < 1 || contrasena.trim().length() < 1) {
            return false;
        }
        try (Connection con = GlobalDAO.getCon()) {
            String sqlSelect = "SELECT * FROM usuarios where nombre_usuario like '" + nombre + "' and contrasena_usuario like '" + Controller.getPC().cipher(contrasena) + "'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sqlSelect);
            if (rs.next()) {
                return true;
            }
            rs.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error de BD", "Select", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }

}
