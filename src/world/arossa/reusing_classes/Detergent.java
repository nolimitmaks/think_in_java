package world.arossa.reusing_classes;
import static world.arossa.helpers.Print.*;


public class Detergent extends Cleanser {

    public Detergent () {
        print("Detergent constuctor");
    }

    @Override
    public void scrub () {
        append(" Detergent.scrub()");
        super.scrub(); // Call base-class version
    }

    public void foam() { append(" foam()"); }


}
