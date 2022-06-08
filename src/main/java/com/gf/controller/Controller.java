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

    public static void verify() {
        config = new ConfigurationController();
        view = new ViewController();
        data = new DataController();
        userDAO = new UserDAO();
        jobDAO = new JobDAO();
        interesaDAO = new InteresaDAO();
    }

    public static void setUser(User user) {
        Controller.loggedUser = user;
    }

    public static User getUser() {
        if (loggedUser == null) {
            Controller.getView().showLoginScreen();
        }
        return loggedUser;
    }

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
