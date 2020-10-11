package world.arossa.initialization_cleanup;
import java.util.Random;

import static world.arossa.helpers.Print.*;

public class ExerciseN9 {
    private int n1;
    private int n2;

    public ExerciseN9 (int n ) {


        this(n, "Hello");
    }

    private ExerciseN9 (int n, String s) {
        Random r = new Random();
        this.n1 = r.nextInt();
        this.n2 = r.nextInt();

        print(this.n1 * this.n2);
    }
}
