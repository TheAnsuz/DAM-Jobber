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

    public Interesa(int idUsuario, int idEmpleo, boolean aceptado) {
        this.idUsuario = idUsuario;
        this.idEmpleo = idEmpleo;
        this.aceptado = aceptado;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdEmpleo() {
        return idEmpleo;
    }

    public void setIdEmpleo(int idEmpleo) {
        this.idEmpleo = idEmpleo;
    }

    public boolean isAceptado() {
        return aceptado;
    }

    public void setAceptado(boolean aceptado) {
        this.aceptado = aceptado;
    }

}
