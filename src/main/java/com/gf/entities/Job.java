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

    /**
     * Crea un empleo
     *
     * @param id identificador del empleo
     * @param titulo titulo del empleo
     * @param descripcion descripcion del empleo
     * @param localidad localidad del empleo
     * @param fuente fuente del empleo
     * @param url url del empleo
     * @param provincia provincia del empleo
     */
    public Job(int id, String titulo, String descripcion, String localidad, String fuente, String url, String provincia) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.localidad = localidad;
        this.fuente = fuente;
        this.url = url;
        this.provincia = provincia;
    }

    /**
     * Obtiene la id del empleo
     *
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * Obtiene el titulo del empleo
     *
     * @return titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Obtiene la descripcion del empleo
     *
     * @return dscripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Obtiene la localidad del empleo
     *
     * @return localidad
     */
    public String getLocalidad() {
        return localidad;
    }

    /**
     * Obtiene la fuente del empleo
     *
     * @return fuente
     */
    public String getFuente() {
        return fuente;
    }

    /**
     * Obtiene la url del empleo
     *
     * @return url
     */
    public String getUrl() {
        return url;
    }

    /**
     * Obtiene la provincia del empleo
     *
     * @return provincia
     */
    public String getProvincia() {
        return provincia;
    }

    /**
     * Devuelve el empleo con todos sus atributos
     *
     * @return la representación del objeto como cadena de texto
     */
    @Override
    public String toString() {
        return "Job{" + "id=" + id + ", titulo=" + titulo + ", descripcion=" + descripcion + ", localidad=" + localidad + ", fuente=" + fuente + ", url=" + url + ", provincia=" + provincia + '}';
    }

}
