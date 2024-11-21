// <editor-fold defaultstate="collapsed" desc="imports">

import org.lgna.story.*;
import org.lgna.story.resources.automobile.SedanResource;
// </editor-fold>

class Sedan extends Automobile {

    /* Construct new Sedan */
    public Sedan() {
        super(SedanResource.SEDAN);
    }

    public SJoint getBackLeftDoor() {
        return this.getJoint(SedanResource.BACK_LEFT_DOOR);
    }

    public SJoint getFrontLeftDoor() {
        return this.getJoint(SedanResource.FRONT_LEFT_DOOR);
    }

    public SJoint getBackRightDoor() {
        return this.getJoint(SedanResource.BACK_RIGHT_DOOR);
    }

    public SJoint getFrontRightDoor() {
        return this.getJoint(SedanResource.FRONT_RIGHT_DOOR);
    }
}
