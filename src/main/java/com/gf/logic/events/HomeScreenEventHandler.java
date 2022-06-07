package com.gf.logic.events;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Adrian MRV. aka AMRV || Ansuz
 */
public class HomeScreenEventHandler {

    public void clickReject() {
        this.showVideo();
    }

    public void clickHome() {
        this.showVideo();
    }

    public void clickConfirm() {
        this.showVideo();
    }

    public void clickProfile() {
        this.showVideo();
    }

    public void clickOffers() {
        this.showVideo();
    }
    
    private void showVideo() {
        try {
            Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=dQw4w9WgXcQ"));
        } catch (URISyntaxException | IOException ex) {
            Logger.getLogger(HomeScreenEventHandler.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
    }
}
