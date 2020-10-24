package world.arossa.reusing_classes;

public class Sterilizing extends Detergent {
    public Sterilizing () {

    }

    @Override
    public void scrub () {
        this.s = "Sterilizing";
        append(" Sterilizing.scrub()");
        super.scrub(); // Call base-class version
        append("\nthis.s in Sterilizing equal to  " + this.s);

    }

    public Sterilizing sterilize () {
        append(" sterilize ()");
        return this;
    }
}
