package com.gf.controller;

import com.gf.dao.UserDAO;

/**
 *
 * @author Adrian MRV. aka AMRV || Ansuz
 */
public class Controller {

    private final static ConfigurationController config = new ConfigurationController();
    private final static ViewController view = new ViewController();
    private final static DataController data = new DataController();
    private final static UserDAO userDAO = new UserDAO();

    public static ConfigurationController getConfiguration() {
        return config;
    }

    public static ViewController getView() {
        return view;
    }

    public static DataController getData() {
        return data;
    }

    public static UserDAO getUserDAO() {
        return userDAO;
    }

    public static void exit() {
        System.exit(0);
    }

}
