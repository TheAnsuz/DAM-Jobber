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

    public void showLoginScreen(boolean visible) {
        this.login.setVisible(visible);
    }

    public void showRegisterScreen(boolean visible) {
        this.register.setVisible(visible);
    }
    
    public void showHomeScreen(boolean visible) {
        this.home.setVisible(visible);
    }

}
