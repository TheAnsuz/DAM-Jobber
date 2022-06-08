package com.gf.controller;

import com.gf.dao.InteresaDAO;
import com.gf.dao.JobDAO;
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
    private final static JobDAO jobDAO = new JobDAO();
    private final static InteresaDAO interesaDAO = new InteresaDAO();

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

    public static JobDAO getJobDAO() {
        return jobDAO;
    }

    public static InteresaDAO getInteresaDAO() {
        return interesaDAO;
    }

    public static void exit() {
        System.exit(0);
    }

}
