package world.arossa.initialization_cleanup;
import static world.arossa.helpers.Print.*;

public class ExerciseN5 {
    public ExerciseN5 (int n, boolean b, double d) {
        this.bark(n);
        this.bark(b);
        this.bark(d);

    }

    private void bark (int n) {
        print(n);
    }

    private void bark (boolean b) {
        print(b);
    }

    private void bark (double d) {
        print(d);
    }


}
