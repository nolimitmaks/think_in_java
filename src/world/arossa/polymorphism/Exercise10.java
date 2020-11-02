package world.arossa.polymorphism;
import static world.arossa.helpers.Print.*;

public class Exercise10 {

    protected void a () {
        print("a");

        b();
    }

    protected void b () {
        print("b");
    }
}
