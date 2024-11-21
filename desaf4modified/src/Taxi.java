// <editor-fold defaultstate="collapsed" desc="imports">

import org.lgna.story.*;
import org.lgna.story.resources.automobile.TaxiResource;
// </editor-fold>

class Taxi extends Automobile {

    /* Construct new Taxi */
    public Taxi() {
        super(TaxiResource.TAXI);
    }

    public SJoint getBackLeftDoor() {
        return this.getJoint(TaxiResource.BACK_LEFT_DOOR);
    }

    public SJoint getFrontLeftDoor() {
        return this.getJoint(TaxiResource.FRONT_LEFT_DOOR);
    }

    public SJoint getBackRightDoor() {
        return this.getJoint(TaxiResource.BACK_RIGHT_DOOR);
    }

    public SJoint getFrontRightDoor() {
        return this.getJoint(TaxiResource.FRONT_RIGHT_DOOR);
    }
}
