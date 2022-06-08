package com.gf.controller;

import com.gf.logic.ResourceIO;
import java.awt.image.BufferedImage;

/**
 *
 * @author Adrian MRV. aka AMRV || Ansuz
 */
public class ConfigurationController {
    
    protected ConfigurationController() {
        // Not yet implemented
    }
    
    public BufferedImage getDefaultImage(int width, int height) {
        return ResourceIO.resourceImage("images/undefined.png", width, height);
    }
    
}
