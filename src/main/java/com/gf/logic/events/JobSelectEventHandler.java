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

    private int count = 0;
    
    public boolean clickAccept(Job job) {
        Interesa interesa = new Interesa(Controller.getUser().getId(), job.getId(), true);
        System.out.println(Controller.getUser().getId());
        Controller.getInteresaDAO().insertInteresa(interesa);
        return false;
    }

    public boolean clickDeny(Job job) {
        Interesa interesa = new Interesa(Controller.getUser().getId(), job.getId(), false);
        Controller.getInteresaDAO().insertInteresa(interesa);
        return false;
    }

    public Job requestNextJob() {
        ArrayList<Job> jobs = Controller.getJobDAO().selectEmpleos();
        return jobs.get(count++);
    }

}
