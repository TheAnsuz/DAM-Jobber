package com.gf.logic.events;

import com.gf.controller.Controller;
import com.gf.entities.User;

/**
 *
 * @author Adrian MRV. aka AMRV || Ansuz
 */
public class RegisterScreenEventHandler {

    public boolean clickVolverALogin() {

        return true;
    }

    public boolean crearCuenta(String nombre, String mail, String clave1, String clave2) {

        if (Controller.getPC().validPassword(clave1, clave2)) {
            User user = new User(1, nombre, mail, Controller.getPC().cipher(clave1));
            Controller.getUserDAO().insertUser(user);
            return true;
        }
        return false;
    }

}
