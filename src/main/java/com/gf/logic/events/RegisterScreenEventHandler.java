package com.gf.logic.events;

import com.gf.controller.Controller;
import com.gf.entities.User;

/**
 *
 * @author Adrian MRV. aka AMRV || Ansuz
 */
public class RegisterScreenEventHandler {

    public boolean clickVolverALogin() {

        return false;
    }

    public boolean crearCuenta(String nombre, String clave1, String clave2) {

        if (Controller.getPC().validPassword(clave1, clave2)) {
            User user = new User(1, nombre, "email", clave1);
            Controller.getUserDAO().insertUser(user);
            return true;
        }
        return false;
    }

}
