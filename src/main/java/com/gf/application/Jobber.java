package com.gf.application;

import com.formdev.flatlaf.FlatLightLaf;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Adrian MRV. aka AMRV || Ansuz
 */
public class Jobber {

    public static void main(String[] args) {
        FlatLightLaf.setup();

        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Jobber.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
