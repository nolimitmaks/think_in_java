package world.arossa.access_control;
import static world.arossa.helpers.Print.print;

public class ExerciseN6 {

    protected String protected_string;

    public ExerciseN6 () {

    }

    protected void changeInfo(String s) {
        this.protected_string = s;
        print(this.protected_string);
    }
}
