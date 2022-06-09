package com.gf.logic.events;

import com.gf.controller.Controller;
import com.gf.dao.JobDAO;
import com.gf.entities.Interesa;
import com.gf.entities.Job;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Adrian MRV. aka AMRV || Ansuz
 */
public class HomeScreenEventHandler {

    /**
     * Evento al hacer click en el boton de rechazar trabajo
     *
     * @deprecated ya no existe esta funcion
     */
    @Deprecated
    public void clickReject() {

    }

    /**
     * Evento al hacer click en el boton de inicio
     *
     * @deprecated ya no existe esta funcion
     */
    @Deprecated
    public void clickHome() {

    }

    /**
     * Evento al hacer click en el boton de confirmar
     *
     * @deprecated ya no existe esta funcion
     */
    @Deprecated
    public void clickConfirm() {

    }

    /**
     * Evento al hacer click en el boton de ver el perfil
     *
     * @deprecated ya no existe esta funcion
     */
    @Deprecated
    public void clickProfile() {

    }

    /**
     * Evento al hacer click en el boton de ver ofertas
     *
     * @deprecated ya no existe esta funcion
     */
    @Deprecated
    public void clickOffers() {

    }

    /**
     * Evento que solicita al controlador los empleos interesantes que el
     * usuario ha marcado con el fin de mostrarse
     *
     * @return una instancia de un objeto iterable por el que se pasan los
     * empleos interesantes para el usuario
     * @deprecated no se ha implementado la funcion en la aplicacion
     */
    @Deprecated
    public Iterable<Job> loadInterests() {
        return new ArrayList<>();
    }
}
