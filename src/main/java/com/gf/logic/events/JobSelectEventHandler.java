package com.gf.logic.events;

import com.gf.controller.Controller;
import com.gf.entities.Interesa;
import com.gf.entities.Job;
import com.gf.entities.User;

/**
 *
 * @author Adrian MRV. aka AMRV || Ansuz
 */
public class JobSelectEventHandler {

    public boolean clickAccept(Job job, User user) {
        Interesa interesa = new Interesa(user.getId(), job.getId(), true);
        Controller.getInteresaDAO().insertInteresa(interesa);
        return false;
    }

    public boolean clickDeny(Job job, User user) {
        Interesa interesa = new Interesa(user.getId(), job.getId(), false);
        Controller.getInteresaDAO().insertInteresa(interesa);
        return false;
    }

    public Job requestNextJob() {
        return new Job(1231, "Trabajo de club de alterne", "<b>Se buscan machos de pelo en pecho</b><br>Prohibido mayores de 16", "Valladolid", "Junta de castilla y leon", "ni puta idea", "Castilla y leon");
    }

}
