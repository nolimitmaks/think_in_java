package world.arossa.initialization_cleanup;
import static world.arossa.helpers.Print.*;

public class ExerciseN6 {
    public ExerciseN6 (boolean b, double d) {
        this.bark(b, d);
        this.bark(d, b);

    }


    private void bark (double d, boolean b) {
        print(d);
        print(b);
        print("\n");
    }

    private void bark (boolean b, double d) {
        print(b);
        print(d);
        print("\n");
    }
}
