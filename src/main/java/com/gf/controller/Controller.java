package com.gf.controller;

import com.gf.dao.InteresaDAO;
import com.gf.dao.JobDAO;
import com.gf.dao.UserDAO;
import com.gf.entities.User;

/**
 *
 * @author Adrian MRV. aka AMRV || Ansuz
 */
public class Controller {

    private static ConfigurationController config = new ConfigurationController();
    private static ViewController view = new ViewController();
    private static DataController data = new DataController();
    private static UserDAO userDAO = new UserDAO();
    private static JobDAO jobDAO = new JobDAO();
    private static InteresaDAO interesaDAO = new InteresaDAO();
    private static User loggedUser = null;

    /**
     * Verifica que los datos del controlador sean funcionales para la
     * aplicacion, recomendable su uso antes de realizar cualquier operacion
     * para evitar comportamientos imprevistos
     */
    public static void verify() {
        if (config == null)
            config = new ConfigurationController();
        if (view == null)
            view = new ViewController();
        if (data == null)
            data = new DataController();
        if (userDAO == null)
            userDAO = new UserDAO();
        if (jobDAO == null)
            jobDAO = new JobDAO();
        if (interesaDAO == null)
            interesaDAO = new InteresaDAO();
    }

    /**
     * Establece el usuario registrado en la aplicacion
     *
     * @param user el usuario registrado
     */
    public static void setUser(User user) {
        Controller.loggedUser = user;
    }

    /**
     * Obtiene el usuario que esta registrado en la aplicacion, si no hay ningun
     * usuario registrado se abriraá un panel para solicitar el registro
     *
     * @return el usuario registrado en la aplicacion
     */
    public static User getUser() {
        if (loggedUser == null) {
            Controller.getView().showLoginScreen();
        }
        return loggedUser;
    }

    /**
     * Obtiene la instancia del controlador de configuracion de la aplicacion
     *
     * @return controlador de configuracion
     */
    public static ConfigurationController getConfiguration() {
        return config;
    }

    /**
     * Obtiene la instancia del controlador de vistas de la aplicacion
     *
     * @return controlador de vistas
     */
    public static ViewController getView() {
        return view;
    }

    /**
     * Obtiene la instancia del controlador de datos y parseos de la aplicacion
     *
     * @return controlador de datos
     */
    public static DataController getData() {
        return data;
    }

    /**
     * Obtiene el DAO de usuarios
     *
     * @return DAO de usuarios
     */
    public static UserDAO getUserDAO() {
        return userDAO;
    }

    /**
     * Obtiene el DAO de los trabajos
     *
     * @return DAO de trabajos
     */
    public static JobDAO getJobDAO() {
        return jobDAO;
    }

    /**
     * Obtiene el DAO de los intereses del usuario registrado
     *
     * @return DAO de intereses
     */
    public static InteresaDAO getInteresaDAO() {
        return interesaDAO;
    }

    /**
     * Ejecuta el cierre de la aplicacion asegurandose de que se guardan las
     * configuraciones asi como se ejecutan los procesos de cierre de forma
     * valida
     */
    public static void exit() {
        System.exit(0);
    }

}
