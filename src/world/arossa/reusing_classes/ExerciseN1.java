package world.arossa.reusing_classes;
import static world.arossa.helpers.Print.*;

public class ExerciseN1 {
    private String s;
    public ExerciseN1 () {
        print("\n\n\nfrom constructor ExerciseN1");
        if(s == null)
            s = "Obj toString() info";
    }

    public String toString() {
        return s;
    }
}
