/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gf.dao;

import com.gf.controller.Controller;
import com.gf.entities.Interesa;
import com.gf.entities.Job;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Sabri
 */
public class JobDAO {

    /**
     * Devuelve los empleos que se encuentran en la base de datos y que no se
     * encuentran en la tabla interesa del usuario
     *
     * @return ArrayList de empleos
     */
    public ArrayList selectEmpleos() {
        Job job = null;
        ArrayList<Job> jobs = new ArrayList<>();
        try (Connection con = GlobalDAO.conectarBD()) {
            String sqlSelect = "SELECT id_empleo, titulo_empleo, descripcion_empleo, localidad_empleo, fuente_empleo, url_empleo, provincia_empleo "
                    + "FROM empleo "
                    + "WHERE empleo.id_empleo not in ("
                    + "SELECT interesa.id_empleo "
                    + "FROM interesa "
                    + "WHERE interesa.id_usuario = " + Controller.getUser()
                            .getId() + " );";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sqlSelect);
            if (!rs.next()) {
                return null;
            }
            while (rs.next()) {
                jobs
                        .add(new Job(rs.getInt(1), rs.getString(2), rs
                                .getString(3), rs.getString(4), rs.getString(5), rs
                                .getString(6), rs.getString(7)));
            }
            rs.close();

        } catch (SQLException ex) {
            Controller.getView()
                    .showWarning("Error al obtener los empleos disponibles");
//            JOptionPane.showMessageDialog(null, "Error de select jobs", "Select jobs", JOptionPane.ERROR_MESSAGE);
        }
        return jobs;
    }

//    public ArrayList selectEmpleosInteresados(Interesa interesa) {
//        Job job = null;
//        ArrayList<Job> jobs = new ArrayList<>();
//        try ( Connection con = GlobalDAO.conectarBD()) {
//            String sqlSelect = "SELECT * FROM empleados where id_empleo = " + interesa
//                    .getIdEmpleo();
//            Statement st = con.createStatement();
//            ResultSet rs = st.executeQuery(sqlSelect);
//            while (rs.next()) {
//                job = new Job(rs.getInt(1), rs.getString(2), rs.getString(3), rs
//                        .getString(4), rs.getString(5), rs.getString(6), rs
//                        .getString(7));
//                jobs.add(job);
//            }
//            rs.close();
//
//        } catch (SQLException ex) {
//            Controller.getView()
//                    .showWarning("Error al obtener los empleos interesantes");
////            JOptionPane.showMessageDialog(null, "Error de select empleos interesados", "Select empleos interesados", JOptionPane.ERROR_MESSAGE);
//        }
//        return jobs;
//    }
}
