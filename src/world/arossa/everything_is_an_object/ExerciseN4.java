package world.arossa.everything_is_an_object;
import static world.arossa.helpers.Print.*;

public class ExerciseN4 {
    int i;
    double d;
    boolean b;

    public ExerciseN4 (int n, double duo, boolean bool ) {
        this.i = n;
        this.d = duo;
        this.b = bool;

    }

    public void showInfo(ExerciseN4 data) {
        print(data.i);
        print(data.b);
        print(data.d);
    }
}
