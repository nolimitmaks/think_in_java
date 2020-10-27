package world.arossa.reusing_classes;
import static world.arossa.helpers.Print.*;

public class B {
    public B (int n, String s) {
        n++;
        n++;
        print("B constructor " + ++n + " " + s);
    }
}
