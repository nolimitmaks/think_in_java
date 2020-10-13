package world.arossa.initialization_cleanup;
import static world.arossa.helpers.Print.*;

public class ExerciseN14 {
    static String s1;
    static String n1 = "initialized at the point of definition";

    static String n2;

    static {
        n2 = "initialized at a static block";
    }

    public static  void showInfo() {
        print("s1 " + s1);
        print("n1 " + n1);
        print("n2 inside static block " + n2);
    }
}
