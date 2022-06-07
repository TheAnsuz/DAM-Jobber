package com.gf.controller;

/**
 *
 * @author Adrian MRV. aka AMRV || Ansuz
 */
public class Controller {
 
    private final static CipherController cipher = new CipherController();
    private final static ConfigurationController config = new ConfigurationController();
    private final static ViewController view = new ViewController();
    
    public static CipherController getCipher() {
        return cipher;
    }
    
    public static ConfigurationController getConfiguration() {
        return config;
    }
    
    public static ViewController getView() {
        return view;
    }
    
}
