package world.arossa.reusing_classes;
import static world.arossa.helpers.Print.*;

public class Amphibian {

    protected static void show(Amphibian amph) {
        print(amph.toString());
    }

    protected void swim() {
        print("ocean");
    }

}
