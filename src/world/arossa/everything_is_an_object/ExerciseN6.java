package world.arossa.everything_is_an_object;
import static world.arossa.helpers.Print.*;

public class ExerciseN6 {
    String s = "Hello Java";

    public int storage(String s) {
        return s.length() + 2;
    }

    public void printInfo() {
        print("storage is " + storage(s));
    }
}
