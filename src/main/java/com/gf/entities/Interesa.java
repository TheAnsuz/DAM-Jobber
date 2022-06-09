/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gf.entities;

/**
 *
 * @author Sabri
 */
public class Interesa {

    private int idUsuario;
    private int idEmpleo;
    private boolean aceptado;

    /**
     * Crea un objeto para almacenar los empleos que acepta, o no, el usuario
     *
     * @param idUsuario id del usuario
     * @param idEmpleo
     * @param aceptado
     */
    public Interesa(int idUsuario, int idEmpleo, boolean aceptado) {
        this.idUsuario = idUsuario;
        this.idEmpleo = idEmpleo;
        this.aceptado = aceptado;
    }

    /**
     * Obtiene la id de usuario
     *
     * @return idUsuario
     */
    public int getIdUsuario() {
        return idUsuario;
    }

    /**
     * Establece la id de usuario
     *
     * @param idUsuario
     */
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    /**
     * Obtiene la id de empleo
     *
     * @return idEmpleo
     */
    public int getIdEmpleo() {
        return idEmpleo;
    }

    /**
     * Establece la id de empleo
     *
     * @param idEmpleo
     */
    public void setIdEmpleo(int idEmpleo) {
        this.idEmpleo = idEmpleo;
    }

    /**
     * Devuelve si el empleo ha sido aceptado
     *
     * @return aceptado
     */
    public boolean isAceptado() {
        return aceptado;
    }

    /**
     * Establece si el empleo ha sido aceptado
     *
     * @param aceptado
     */
    public void setAceptado(boolean aceptado) {
        this.aceptado = aceptado;
    }

}
