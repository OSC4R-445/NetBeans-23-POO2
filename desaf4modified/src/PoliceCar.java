// <editor-fold defaultstate="collapsed" desc="imports">

import org.lgna.story.*;
import org.lgna.story.resources.automobile.PoliceCarResource;
// </editor-fold>

class PoliceCar extends Automobile {

    /* Construct new PoliceCar */
    public PoliceCar() {
        super(PoliceCarResource.POLICE_CAR);
    }

    public SJoint getBackLeftDoor() {
        return this.getJoint(PoliceCarResource.BACK_LEFT_DOOR);
    }

    public SJoint getFrontLeftDoor() {
        return this.getJoint(PoliceCarResource.FRONT_LEFT_DOOR);
    }

    public SJoint getBackRightDoor() {
        return this.getJoint(PoliceCarResource.BACK_RIGHT_DOOR);
    }

    public SJoint getFrontRightDoor() {
        return this.getJoint(PoliceCarResource.FRONT_RIGHT_DOOR);
    }
}
