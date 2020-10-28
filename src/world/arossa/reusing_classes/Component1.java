package world.arossa.reusing_classes;
import static world.arossa.helpers.Print.*;

public class Component1 {
    public Component1 () {
        print("constructor form Component1");
    }

    public Component1 (String s) {
        print("non-default constructor form Component1 & String s - > " + s );
    }

    public void dispose() {
        print("Component1 dispose");
    }
}
