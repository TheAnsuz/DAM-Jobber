package com.gf.logic.events;

import com.gf.controller.Controller;
import com.gf.entities.Interesa;
import com.gf.entities.Job;
import java.util.ArrayList;

/**
 *
 * @author Adrian MRV. aka AMRV || Ansuz
 */
public class JobSelectEventHandler {

    /**
     * Evento al hacer click en aceptar un trabajo
     *
     * @param job el trabajo aceptado
     * @return true si se puede aceptar el trabajo y se debe de pasar al
     * siguiente
     */
    public boolean clickAccept(Job job) {
        if (job == null) {
            return false;
        }
        Interesa interesa = new Interesa(Controller.getUser().getId(), job
                .getId(), true);
        Controller.getInteresaDAO().insertInteresa(interesa);
        return true;
    }

    /**
     * Evento al hacer click en denegar un trabajo
     *
     * @param job el trabajo denegado
     * @return true si se puede denegar el trabajo y se debe de pasar al
     * siguiente
     */
    public boolean clickDeny(Job job) {
        if (job == null) {
            return false;
        }
        Interesa interesa = new Interesa(Controller.getUser().getId(), job
                .getId(), false);
        Controller.getInteresaDAO().insertInteresa(interesa);
        return true;
    }

    /**
     * Evento que solicita al controlador el siguiente trabajo de la base de
     * datos para mostrar en la vista al usuario
     *
     * @return el trabajo a mostrar o null si no hay trabajos disponibles
     */
    public Job requestNextJob() {
        ArrayList<Job> jobs = Controller.getJobDAO().selectEmpleos();
        if (jobs == null) {
            return null;
        }
        for (int i = 0; i < jobs.size(); i++) {
            return jobs.get(i);
        }
        return null;
    }

    public void clickJob(Job job) {
        if (job == null)
            return;
        Controller.getView().showJobInfo(job);
    }

}
