package com.gf.controller;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Adrian MRV. aka AMRV || Ansuz
 */
public class DataController {

    private MessageDigest instance;

    protected DataController() {
        try {
            instance = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(DataController.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Valida un correo electronico
     * <p>
     * Un correo electronico es valido cuando contiene una '@' y es del dominio
     * 'com' o 'es'
     *
     * @param mail el correo a validar
     * @return true si se ha validad correctamente, false si no
     */
    public boolean validateMail(String mail) {
        if (mail.trim().length() > 30)
            return false;

        final String lower = mail.trim().toLowerCase();
        if (!lower.endsWith(".com") && !lower.endsWith(".es"))
            return false;

        if (!mail.contains("@") || mail.indexOf("@") != mail.lastIndexOf("@"))
            return false;

        return true;
    }

    /**
     * Valida un nombre de usuario
     * <p>
     * Un nombre de usuario es valido cuando tiene menos de 30 caraceres y esta
     * compuesto unicamente de letras y digitos
     *
     * @param username el nombre a validar
     * @return true si se ha validad correctamente, false si no
     */
    public boolean validateUsername(String username) {
        if (username.trim().length() > 30)
            return false;

        for (char c : username.toCharArray()) {
            if (!Character.isLetterOrDigit(c))
                return false;
        }

        return true;
    }

    /**
     * Valida un par de contraseñas comprobando que son en efecto la misma
     *
     * @param password la contraseña a valida
     * @param secondPassword la verificacion de contraseña
     * @return true si las contraseñas son la misma y esta validada, false si no
     */
    public boolean validatePassword(String password, String secondPassword) {
        return validatePassword(password) && password.equals(secondPassword);
    }

    /**
     * Valida una contraseña
     * <p>
     * Una contraseña es valida cuando tiene como minimo 8 caracteres y contiene
     * letras, digitos, numeros y simbolos, además de contener como minimo un
     * caracter en minuscula y otro en mayuscula
     *
     * @param password la contraseña que se pretende validar
     * @return true si la contraseña cumple los requisitos para ser validada,
     * false si no
     */
    public boolean validatePassword(String password) {
        if (password.trim().length() < 8)
            return false;

        boolean hasMayusc = false;
        boolean hasMinus = false;
        boolean hasDigit = false;
        boolean hasLetter = false;
        boolean hasSymbol = false;

        // Comprobar que tiene mayusculas y minusculas
        for (char c : password.toCharArray()) {
            if (Character.isLetter(c)) {
                hasLetter = true;

                if (Character.toUpperCase(c) == c)
                    hasMayusc = true;
                else
                    hasMinus = true;

            } else if (Character.isDigit(c))
                hasDigit = true;
            else
                hasSymbol = true;

        }

        return hasMayusc && hasMinus && hasDigit && hasLetter && hasSymbol;
    }

    /**
     * Cifra un texto (preferiblemente usar para claves) de forma que no se
     * puede usar ingenieria inversa para obtener de nuevo la contraseña
     * <p>
     * AVISO: usa un cifrado el cual lleva tiempo crackeado para poder obtener
     * la clave que lo asocia, de todos modos esto evita que la amplia mayoria
     * de hackers o administradores puedan acceder a las claves que tienen los
     * usuarios almacenadas para iniciar sesion
     *
     * @param text el texto a cifrar
     * @return el texto cifrado con un algoritmo secreto y convertido a una
     * cadena de texto legible en ascii
     */
    public String cipher(String text) {
        if (instance == null)
            return text;

        final StringBuilder builder = new StringBuilder();

        for (byte b : instance.digest(text.getBytes())) {
            builder.append(Integer.toHexString(0xFF & b));
        }
        return builder.toString();
    }

    /**
     * Convierte los caracteres de una contraseña en una cadena de texto valida
     * para operarse internamente en la aplicacion
     *
     * @param data el array de caracteres que conforman la contraseña
     * @return la cadena de texto con los caracteres de la contraseña
     */
    public String formPassword(char[] data) {
        final StringBuilder builder = new StringBuilder();

        for (char c : data)
            builder.append(c);

        return builder.toString();
    }

}
