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

    public boolean validateUsername(String username) {
        if (username.trim().length() > 30)
            return false;

        for (char c : username.toCharArray()) {
            if (!Character.isLetterOrDigit(c))
                return false;
        }

        return true;
    }

    public boolean validatePassword(String password, String secondPassword) {
        return validatePassword(password) && password.equals(secondPassword);
    }

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

    public String cipher(String text) {
        if (instance == null)
            return text;

        final StringBuilder builder = new StringBuilder();

        for (byte b : instance.digest(text.getBytes())) {
            builder.append(Integer.toHexString(0xFF & b));
        }
        return builder.toString();
    }

    public String formPassword(char[] data) {
        final StringBuilder builder = new StringBuilder();

        for (char c : data)
            builder.append(c);

        return builder.toString();
    }

}
