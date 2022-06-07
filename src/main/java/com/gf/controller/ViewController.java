package com.gf.controller;

import com.gf.view.HomeScreen;
import com.gf.view.LoginScreen;
import com.gf.view.RegisterScreen;

/**
 *
 * @author Adrian MRV. aka AMRV || Ansuz
 */
public class ViewController {

    private final HomeScreen home;
    private final LoginScreen login;
    private final RegisterScreen register;

    public ViewController() {
        this.home = new HomeScreen();
        this.login = new LoginScreen(home, true);
        this.register = new RegisterScreen(home, true);
    }

    public void showLoginScreen() {
        this.login.setVisible(true);
    }

    public void showRegisterScreen() {
        this.register.setVisible(true);
    }

}
