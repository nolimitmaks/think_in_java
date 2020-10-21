package world.arossa.access_control;

//import static world.arossa.debug.Debug.*;
//import static world.arossa.debugoff.Debug.*;
//don't want to mess around creating to class for this exercise
// instead use to static methods just in one class


public class ExerciseN3 {
    boolean productionVersion;

    public ExerciseN3(boolean productionVersion) {
        this.productionVersion = productionVersion;

        if(productionVersion) {
            world.arossa.debugoff.Debug.debug("We have PROD version nothing to print to console");
        }
        else
            world.arossa.debug.Debug.debug("We have DEV version. So print to console all messages");
    }
}
