package com.gf.logic.events;

import com.gf.controller.Controller;

/**
 *
 * @author Adrian MRV. aka AMRV || Ansuz
 */
public class LoginScreenEventHandler {

    public boolean clickConfirm(String text, String toString) {
        return Controller.getUserDAO().validUser(text, toString);
    }

    public void clickRegister() {
        Controller.getView().showRegisterScreen(true);
    }

    public void clickForgotPassword() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
