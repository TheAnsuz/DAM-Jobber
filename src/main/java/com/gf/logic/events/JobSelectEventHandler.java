package com.gf.logic.events;

import com.gf.entities.Job;

/**
 *
 * @author Adrian MRV. aka AMRV || Ansuz
 */
public class JobSelectEventHandler {

    public boolean clickAccept(Job job) {

        return false;
    }

    public boolean clickDeny(Job job) {

        return false;
    }

    public Job requestNextJob() {
        return new Job(1231, "Trabajo de club de alterne", "<b>Se buscan machos de pelo en pecho</b><br>Prohibido mayores de 16", "Valladolid", "Junta de castilla y leon", "ni puta idea", "Castilla y leon");
    }

}
