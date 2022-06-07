/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gf.controller;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sabri
 */
public class PasswordController {
    
    private MessageDigest instance;

    protected PasswordController() {
        try {
            instance = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(PasswordController.class.getName())
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
    
    public boolean contieneMayus(String password) {
        
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }
    
    public boolean contieneMinus(String password) {
        
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            
            if (Character.isLowerCase(c)) {
                return true;
            }
        }
        return false;
    }
    
    public boolean contieneDigitos(String dni) {
        
        for (int i = 0; i < dni.length(); i++) {
            char c = dni.charAt(i);
            
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }
    
    public boolean contieneSimbolos(String password) {
        
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            
            if (!Character.isLetterOrDigit(c)) {
                return true;
            }
        }
        return false;
    }
    
    public boolean passwordLength(String password) {
        return password.length() > 8;
    }
    
    public boolean equalPassword(String password1, String password2) {
        
        return password1.equals(password2);
    }
    
    public boolean validPassword(String password1, String password2) {
        
        return equalPassword(password1, password2) && contieneMayus(password1) && contieneMinus(password1) && contieneDigitos(password1) && contieneSimbolos(password1) && passwordLength(password1);
    }
    
}
