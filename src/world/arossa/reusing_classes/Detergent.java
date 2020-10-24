package world.arossa.reusing_classes;


public class Detergent extends Cleanser {
    @Override
    public void scrub () {
        append(" Detergent.scrub()");
        super.scrub(); // Call base-class version
    }

    public void foam() { append(" foam()"); }


}
