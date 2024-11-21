// <editor-fold defaultstate="collapsed" desc="imports">

import org.lgna.story.*;
import org.lgna.story.resources.automobile.LimousineResource;
// </editor-fold>

class Limousine extends Automobile {

    /* Construct new Limousine */
    public Limousine() {
        super(LimousineResource.LIMOUSINE);
    }

    public SJoint getBackLeftDoor() {
        return this.getJoint(LimousineResource.BACK_LEFT_DOOR);
    }

    public SJoint getFrontLeftDoor() {
        return this.getJoint(LimousineResource.FRONT_LEFT_DOOR);
    }

    public SJoint getBackRightDoor() {
        return this.getJoint(LimousineResource.BACK_RIGHT_DOOR);
    }

    public SJoint getFrontRightDoor() {
        return this.getJoint(LimousineResource.FRONT_RIGHT_DOOR);
    }
}
