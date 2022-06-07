package com.gf.controller;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Adrian MRV. aka AMRV || Ansuz
 */
public class CipherController {

    private MessageDigest instance;

    protected CipherController() {
        try {
            instance = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(CipherController.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
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

}
