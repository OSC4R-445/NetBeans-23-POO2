// <editor-fold defaultstate="collapsed" desc="imports">

import org.lgna.story.*;
// </editor-fold>

class Program extends SProgram {

    /* Construct new Program */
    public Program() {
        super();
    }
    /* Crear_una_escena_llamada_myEscena */
    private final Scene myScene = new Scene();

    public static void main(String[] args) {
// Create a runtime window, then display and activate myScene in the window
        final Program story = new Program();
        story.initializeInFrame(args);
        story.setActiveScene(story.getMyScene());
    }

    /* Final de procedimiento main */


 /* Funciones_y_procedimientos_para_este_programa */
    public Scene getMyScene() {
        return this.myScene;
    }
}
