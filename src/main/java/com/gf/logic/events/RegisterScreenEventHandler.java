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
        if (!Controller.getData().validateUsername(nombre)) {
            Controller.getView()
                    .showWarning("No se permite ese nombre de usuario");
            return false;
        }

        if (!Controller.getData().validateMail(mail)) {
            Controller.getView().showWarning("El orreo electronico no valido");
            return false;
        }

        if (!Controller.getData().validatePassword(clave1)) {
            Controller.getView()
                    .showWarning("Las contraseñas deben de tener 8 caracteres como minimo, contener mayusculas, minusculas, numeros y simbolos");
        }

        if (!Controller.getData().validatePassword(clave1, clave2)) {
            Controller.getView().showWarning("Las contraseñas no coinciden");
        }

        User user = new User(1, nombre.trim(), mail.trim(), Controller
                .getData().cipher(clave1));
        Controller.getUserDAO().insertUser(user);
        return true;
    }

}
