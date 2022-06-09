package com.gf.logic.events;

import com.gf.controller.Controller;
import com.gf.entities.User;

/**
 *
 * @author Adrian MRV. aka AMRV || Ansuz
 */
public class LoginScreenEventHandler {

    /**
     * Evento al pulsar el boton confirmar del panel de login
     *
     * @param nombre nombre de usuario introducido
     * @param clave contraseña introducida
     * @return true si los valores se han introducido bien y se puede completar
     * la operacion de inicio de sesion
     */
    public boolean clickConfirm(String nombre, String clave) {
        final User user = Controller.getUserDAO().validUser(nombre, clave);
        Controller.setUser(user);
        if (user == null)
            Controller.getView()
                    .showWarning("Datos de inicio de sesion invalidos");
        return user != null;
    }

    /**
     * Evento al hacer click en el boton de registrarse
     */
    public void clickRegister() {
        Controller.getView().showRegisterScreen();
    }

    /**
     * Evento al hacer click en el boton de "olvide la contraseña"
     */
    public void clickForgotPassword() {
        Controller.getView()
                .showInfoDialog("UPS", "Que te hayas olvidado de tu contraseña no es mi problema");
    }

    /**
     * Establece los valores sobre si debe de guardarse localmente la contraseña
     * en un archivo para poder leerla al volver a iniciar la aplicacion (no se
     * cifra en el archivo)
     *
     * @param selected si la opcion de guardarlo esta seleccionada
     * @param password la contraseña que esta introducida y con la que se
     * pretende verificar el inicio de sesion
     */
    public void shouldMaintainPassword(boolean selected, String password) {
        Controller.getConfiguration()
                .setConfig("login.password", selected ? password : "");
    }

    /**
     * Establece los valores sobre si debe de guardarse localmente el nombre de
     * usuario en un archivo para poder leerla al volver a iniciar la aplicacion
     *
     * @param selected si la opcion de guardarlo esta seleccionada
     * @param username el usuario que esta introducido y con el que se pretende
     * verificar el inicio de sesion
     */
    public void shouldMaintainUser(boolean selected, String username) {
        Controller.getConfiguration()
                .setConfig("login.username", selected ? username : "");
    }

}
