/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gf.dao;

import com.gf.entities.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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

}
