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

}
