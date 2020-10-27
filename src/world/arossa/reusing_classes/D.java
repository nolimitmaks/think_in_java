package world.arossa.reusing_classes;
import static world.arossa.helpers.Print.*;

public class D {
    private static int n = 0;
    private int count = n++;

    public D () {
        print("\n D super class constructor without parameters");
        print(count)
        ;
    }
}
