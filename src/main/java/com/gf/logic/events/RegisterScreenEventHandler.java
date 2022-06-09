package com.gf.logic.events;

import com.gf.controller.Controller;
import com.gf.entities.User;

/**
 *
 * @author Adrian MRV. aka AMRV || Ansuz
 */
public class RegisterScreenEventHandler {

    /**
     * Evento al hacer click en el boton para volver al login
     *
     * @return true si debe de volver al login, false para evitar que vuelva
     */
    public boolean clickVolverALogin() {

        return true;
    }

    /**
     * Evento que verifica la creacion de una cuenta
     *
     * @param nombre nombre del usuario
     * @param mail correo electronico del usuario
     * @param clave1 clave que ha introducido
     * @param clave2 verificacion de clave introducia
     * @return true si la cuenta se ha creado y el registro se puede completar,
     * falso si no
     */
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
            return false;
        }

        if (!Controller.getData().validatePassword(clave1, clave2)) {
            Controller.getView().showWarning("Las contraseñas no coinciden");
            return false;
        }

        User user = new User(1, nombre.trim(), mail.trim(), Controller
                .getData().cipher(clave1));
        Controller.getUserDAO().insertUser(user);
        return true;
    }

}
