package com.gf.logic.events;

import com.gf.controller.Controller;
import com.gf.entities.Job;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Adrian MRV. aka AMRV || Ansuz
 */
public class JobInfoEventHandler {

    private String[] urls = new String[]{
        "https://www.youtube.com/watch?v=fC7oUOUEEi4",
        "https://www.youtube.com/watch?v=dQw4w9WgXcQ"};
    private final Random rnd = new Random();

    private void showVideo() {
        try {
            Desktop.getDesktop().browse(new URI(urls[rnd.nextInt(urls.length)]));
        } catch (URISyntaxException | IOException ex) {
            Logger.getLogger(HomeScreenEventHandler.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Evento al hacer click en el boton de buscar en googlem aps
     *
     * @param job el trabajo que se esta mostrando cuando se ha realizado esta
     * solicitud de operacion
     */
    public void clickGoogleButton(Job job) {
        this.showVideo();
    }

    /**
     * Evento al pulsar el boton de back
     *
     * @param job el trabajo que se estaba mostrando antes de pulsar el boton
     */
    public void clickBackButton(Job job) {
        Controller.getView().showJobData(job);
    }

}
