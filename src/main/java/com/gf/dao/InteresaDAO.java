/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gf.dao;

import com.gf.controller.Controller;
import com.gf.entities.Interesa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Sabri
 */
public class InteresaDAO {

    public int insertInteresa(Interesa interesa) {
        int resultado = 0;
        String sqlInsert = "";
        try ( Connection con = GlobalDAO.conectarBD()) {
            sqlInsert = "INSERT INTO interesa (id_usuario, id_empleo, aceptado) VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareCall(sqlInsert);
            ps.setInt(1, interesa.getIdUsuario());
            ps.setInt(2, interesa.getIdEmpleo());
            ps.setBoolean(3, interesa.isAceptado());
            resultado = ps.executeUpdate();
            ps.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
            Controller.getView()
                    .showWarning("Error al conectar a la base de datos");
//            JOptionPane.showMessageDialog(null, "Error de insercion", "Insert interesa", JOptionPane.ERROR_MESSAGE);
        }
        return resultado;
    }

    public ArrayList selectInteresa() {
        Interesa interesa = null;
        ArrayList<Interesa> interesados = new ArrayList<>();
        try ( Connection con = GlobalDAO.conectarBD()) {
            String sqlSelect = "SELECT * FROM interesa where aceptado = 1";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sqlSelect);
            while (rs.next()) {
                interesa = new Interesa(rs.getInt(1), rs.getInt(2), rs
                        .getBoolean(3));
                interesados.add(interesa);
            }
            rs.close();

        } catch (SQLException ex) {
            Controller.getView()
                    .showWarning("Error al obtener los empleos interesantes");
//            JOptionPane.showMessageDialog(null, "Error de select interesa-interesados", "Select interesa-empleos interesados", JOptionPane.ERROR_MESSAGE);
        }
        return interesados;
    }

}
