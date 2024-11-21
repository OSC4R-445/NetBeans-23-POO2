// <editor-fold defaultstate="collapsed" desc="imports">

import org.lgna.story.resources.sims2.ElderPersonResource;
// </editor-fold>

class ElderPerson extends Person {

    /* Construct new ElderPerson */
    public ElderPerson(ElderPersonResource resource) {
        super(resource);
    }

    public void setElderPersonResource(ElderPersonResource elderPersonResource) {
        this.setJointedModelResource(elderPersonResource);
    }
}
