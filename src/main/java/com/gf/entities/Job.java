/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gf.entities;

/**
 *
 * @author Sabri
 */
public class Job {

    private final int id;
    private final String titulo;
    private final String descripcion;
    private final String localidad;
    private final String fuente;
    private final String url;
    private final String provincia;

    public Job(int id, String titulo, String descripcion, String localidad, String fuente, String url, String provincia) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.localidad = localidad;
        this.fuente = fuente;
        this.url = url;
        this.provincia = provincia;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public String getFuente() {
        return fuente;
    }

    public String getUrl() {
        return url;
    }

    public String getProvincia() {
        return provincia;
    }

    @Override
    public String toString() {
        return "Job{" + "id=" + id + ", titulo=" + titulo + ", descripcion=" + descripcion + ", localidad=" + localidad + ", fuente=" + fuente + ", url=" + url + ", provincia=" + provincia + '}';
    }

}
