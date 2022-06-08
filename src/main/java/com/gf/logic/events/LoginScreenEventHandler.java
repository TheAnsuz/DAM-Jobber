package com.gf.logic.events;

import com.gf.controller.Controller;
import javax.swing.JOptionPane;

/**
 *
 * @author Adrian MRV. aka AMRV || Ansuz
 */
public class LoginScreenEventHandler {

    public boolean clickConfirm(String text, String toString) {
        return Controller.getUserDAO().validUser(text, toString);
    }

    public void clickRegister() {
        Controller.getView().showRegisterScreen();
    }

    public void clickForgotPassword() {
        JOptionPane.showMessageDialog(null, "Lo siento pero ese no es mi problema", "UPS!",JOptionPane.WARNING_MESSAGE);
    }

}
