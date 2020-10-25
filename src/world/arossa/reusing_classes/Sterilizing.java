package world.arossa.reusing_classes;
import static world.arossa.helpers.Print.*;

public class Sterilizing extends Detergent {
    public Sterilizing () {
        print("Sterilizing constructor");
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
