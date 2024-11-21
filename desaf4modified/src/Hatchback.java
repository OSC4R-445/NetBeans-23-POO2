// <editor-fold defaultstate="collapsed" desc="imports">

import org.lgna.story.*;
import org.lgna.story.resources.automobile.HatchbackResource;
// </editor-fold>

class Hatchback extends Automobile {

    /* Construct new Hatchback */
    public Hatchback(HatchbackResource resource) {
        super(resource);
    }

    public SJoint getFrontLeftDoor() {
        return this.getJoint(HatchbackResource.FRONT_LEFT_DOOR);
    }

    public SJoint getHatch() {
        return this.getJoint(HatchbackResource.HATCH);
    }

    public SJoint getFrontRightDoor() {
        return this.getJoint(HatchbackResource.FRONT_RIGHT_DOOR);
    }

    public void setHatchbackResource(HatchbackResource hatchbackResource) {
        this.setJointedModelResource(hatchbackResource);
    }
}
