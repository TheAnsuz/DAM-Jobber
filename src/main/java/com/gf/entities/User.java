package com.gf.entities;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Adrian MRV. aka AMRV || Ansuz
 */
public class User {

    private int id;
    private String username;
    private String email;
    private String password;

    public User(int id, String username, String email, String password) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

//    public int insertUser(User user) {
//        int resultado = 0;
//        String sqlInsert = "";
//        try (Connection con = ConexionBD.conectarBD()) {
//            sqlInsert = "INSERT INTO usuarios (id_usuario, nombre_usuario, correo_usuario, contrasena_usuario) VALUES (null, ?, ?, ?)";
//            PreparedStatement ps = con.prepareCall(sqlInsert);
//            ps.setString(1, user.getUsername());
//            ps.setString(2, user.getEmail());
//            ps.setString(3, user.getPassword());
//            resultado = ps.executeUpdate();
//            ps.close();
//
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Error de BD", "Insert", JOptionPane.ERROR_MESSAGE);
//        }
//        return resultado;
//    }

}
