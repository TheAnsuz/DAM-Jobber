package com.gf.entities;

/**
 *
 * @author Adrian MRV. aka AMRV || Ansuz
 */
public class User {

    private final int id;
    private String username;
    private String email;
    private String password;

    /**
     * Crea un usuario
     *
     * @param id identificador del usuario
     * @param username nombre del usuario
     * @param email correo electronico del usuario
     * @param password contraseña del usuario
     */
    public User(int id, String username, String email, String password) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    /**
     * Obtiene la ID del usuario
     *
     * @return id del usuario
     */
    public int getId() {
        return id;
    }

    /**
     * Obtiene el nombre de usuario
     *
     * @return nombre de usuario
     */
    public String getUsername() {
        return username;
    }

    /**
     * Establece el nombre de usuario
     *
     * @param username nuevo nombre de usuario
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Obtiene el correo electronico del usuario
     *
     * @return el correo electronico
     */
    public String getEmail() {
        return email;
    }

    /**
     * Establece el correo electronico del usuario
     *
     * @param email correo electronico
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Obtiene la contraseña del usuario, esta siempre devolverá NULL ya que las
     * contraseñas estan cifradas
     *
     * @return null (puede devolver la contraseña en caso de que se este
     * registrando el usuario)
     *
     * @deprecated este metodo no debe de ser usado mas que para registrar a un
     * usuario. WIP
     */
    @Deprecated
    public String getPassword() {
        return password;
    }

    /**
     * Establece la version no cifrada de la contraseña de un usuario, este
     * metodo no debe usarse ya que solo raliza la funcion de registro y no
     * tiene ningun tipo de validacion, además no es conveniente mostrar la
     * contraseña ni mucho menos guardarla
     *
     * @param password la contraseña
     * @deprecated este metodo no debe de ser usado más que para registrar a un
     * usuario. WIP
     */
    @Deprecated
    public void setPassword(String password) {
        this.password = password;
    }

}
