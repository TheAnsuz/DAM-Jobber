package com.gf.controller;

import com.gf.dao.UserDAO;

/**
 *
 * @author Adrian MRV. aka AMRV || Ansuz
 */
public class Controller {

    private final static CipherController cipher = new CipherController();
    private final static ConfigurationController config = new ConfigurationController();
    private final static ViewController view = new ViewController();
    private final static PasswordController pc = new PasswordController();
    private final static UserDAO userDAO = new UserDAO();

    public static CipherController getCipher() {
        return cipher;
    }

    public static ConfigurationController getConfiguration() {
        return config;
    }

    public static ViewController getView() {
        return view;
    }

    public static PasswordController getPC() {
        return pc;
    }

    public static UserDAO getUserDAO() {
        return userDAO;
    }

}
