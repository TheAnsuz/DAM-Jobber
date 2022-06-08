package com.gf.controller;

import com.gf.logic.ResourceIO;
import com.gf.view.HomeScreen;
import com.gf.view.InfoDialog;
import com.gf.view.LoginScreen;
import com.gf.view.RegisterScreen;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Adrian MRV. aka AMRV || Ansuz
 */
public class ViewController {

    private final HomeScreen home;
    private final LoginScreen login;
    private final RegisterScreen register;
    private final InfoDialog infoDialog;
    private final Icon errorIcon = new ImageIcon(ResourceIO.resourceImage("images/error.png", 64, 64));

    public ViewController() {
        this.home = new HomeScreen();
        this.infoDialog = new InfoDialog(home, true);
        this.login = new LoginScreen(home, true);
        this.register = new RegisterScreen(home, true);
        this.home.setVisible(true);
    }

    public void showLoginScreen(boolean visible) {
        this.login.setLocationRelativeTo(home);
        this.login.setVisible(visible);
    }

    public void showRegisterScreen(boolean visible) {
        this.register.setLocationRelativeTo(home);
        this.register.setVisible(visible);
    }

    public void showInfoDialog(String title, String... description) {
        this.infoDialog.setTitle(title);
        this.infoDialog.setDescription(description);
        this.infoDialog.setLocationRelativeTo(null);
        this.infoDialog.setVisible(true);
    }

    public void showInfoDialog(String... lines) {
        this.infoDialog.setText(lines);
        this.infoDialog.setLocationRelativeTo(null);
        this.infoDialog.setVisible(true);
    }

    public void showWarning(String text) {
        JOptionPane.showMessageDialog(home, text, "ERROR", JOptionPane.ERROR_MESSAGE, errorIcon);
    }
}
