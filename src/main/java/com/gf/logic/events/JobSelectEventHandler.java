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

    public boolean clickAccept(Job job) {
        Interesa interesa = new Interesa(Controller.getUser().getId(), job.getId(), true);
        System.out.println(Controller.getUser().getId());
        Controller.getInteresaDAO().insertInteresa(interesa);
        return true;
    }

    public boolean clickDeny(Job job) {
        Interesa interesa = new Interesa(Controller.getUser().getId(), job.getId(), false);
        Controller.getInteresaDAO().insertInteresa(interesa);
        return true;
    }

    public Job requestNextJob() {
        ArrayList<Job> jobs = Controller.getJobDAO().selectEmpleos();
        for (int i = 0; i < jobs.size(); i++) {
            return jobs.get(i);
        }
        return null;
    }

}
