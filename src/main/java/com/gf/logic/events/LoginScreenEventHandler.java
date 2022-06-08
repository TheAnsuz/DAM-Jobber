package com.gf.logic.events;

import com.gf.controller.Controller;
import com.gf.entities.User;

/**
 *
 * @author Adrian MRV. aka AMRV || Ansuz
 */
public class LoginScreenEventHandler {

    public boolean clickConfirm(String text, String toString) {
        final User user = Controller.getUserDAO().validUser(text, toString);
        Controller.setUser(user);
        if (user == null)
            Controller.getView()
                    .showWarning("Datos de inicio de sesion invalidos");
        return user != null;
    }

    public void clickRegister() {
        Controller.getView().showRegisterScreen();
    }

    public void clickForgotPassword() {
        Controller.getView()
                .showInfoDialog("UPS", "Error al obtener los empleos interesantes");
    }

    public void shouldMaintainPassword(boolean selected, String password) {
        Controller.getConfiguration()
                .setConfig("login.password", selected ? password : "");
    }

    public void shouldMaintainUser(boolean selected, String username) {
        Controller.getConfiguration()
                .setConfig("login.username", selected ? username : "");
    }

}
