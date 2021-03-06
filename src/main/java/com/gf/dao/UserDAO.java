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

/**
 *
 * @author Sabri
 */
public class UserDAO {

    /**
     * Inserta un usuario en la base de datos cuando es creado en el apartado
     * register
     *
     * @param user el usuario a insertar
     * @return Resultado para saber si la operación se ha realizado
     */
    public int insertUser(User user) {
        int resultado = 0;
        String sqlInsert = "";
        try (Connection con = GlobalDAO.conectarBD()) {
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

    /**
     * Devuelve el usuario si se ha escrito bien el nombre y la contraseña al
     * iniciar sesión
     *
     * @param nombre el nombre o nick de usuario
     * @param clave la clave del usuario
     * @return el usuario validado o null si no se valida
     */
    public User validUser(String nombre, String clave) {
        if (nombre == null || clave == null) {
            return null;
        }
        if (nombre.trim().length() < 1 || clave.trim().length() < 1) {
            return null;
        }
        try (Connection con = GlobalDAO.conectarBD()) {
            if (con.isClosed()) {
                return null;
            }
            String sqlSelect = "SELECT * FROM usuarios where nombre_usuario like '" + nombre + "' and contrasena_usuario like '" + Controller
                    .getData().cipher(clave) + "'";
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
