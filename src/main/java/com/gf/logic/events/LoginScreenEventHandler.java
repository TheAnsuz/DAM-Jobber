package com.gf.logic.events;

import com.gf.controller.Controller;

/**
 *
 * @author Adrian MRV. aka AMRV || Ansuz
 */
public class LoginScreenEventHandler {

    public boolean clickConfirm(String text, String toString) {
        return false;
    }

    public void clickRegister() {
        Controller.getView().showRegisterScreen(true);
    }
       
}
