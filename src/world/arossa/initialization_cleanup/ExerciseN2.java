package world.arossa.initialization_cleanup;
import static world.arossa.helpers.Print.*;

public class ExerciseN2 {
    String s = "Hello";

    public ExerciseN2 () {
        String v = "Hello from constructor";

        this.showInfo();
    }

    private void showInfo() {
        print(s);
//        print(v);


    }
}

