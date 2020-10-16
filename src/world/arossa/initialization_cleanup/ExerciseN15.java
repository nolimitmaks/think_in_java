package world.arossa.initialization_cleanup;
import static world.arossa.helpers.Print.*;

public class ExerciseN15 {
    String s;
    {s = "\ninitialise before constructor run \n";}
    {print(s);}

    public ExerciseN15 () {
        s = "inside constructor method \n";
        print(s);
    }

    public ExerciseN15 (String s) {
        print(s);
    }
}
