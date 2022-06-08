package com.gf.logic.events;

import com.gf.controller.Controller;
import com.gf.entities.User;
import javax.swing.JOptionPane;

/**
 *
 * @author Adrian MRV. aka AMRV || Ansuz
 */
public class LoginScreenEventHandler {

    public boolean clickConfirm(String text, String toString) {
        final User user = Controller.getUserDAO().validUser(text, toString);
        Controller.setUser(user);
        return user != null;
    }

    public void clickRegister() {
        Controller.getView().showRegisterScreen();
    }

    public void clickForgotPassword() {
        JOptionPane
                .showMessageDialog(null, "Lo siento pero ese no es mi problema", "UPS!", JOptionPane.WARNING_MESSAGE);
    }

    public void shouldMaintainPassword(boolean selected, String password) {
        Controller.getConfiguration().setConfig("login.password", selected ? password : "");
    }

    public void shouldMaintainUser(boolean selected, String username) {
        Controller.getConfiguration().setConfig("login.username", selected ? username : "");
    }

}
