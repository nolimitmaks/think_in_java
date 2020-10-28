package world.arossa.reusing_classes;
import static world.arossa.helpers.Print.*;

public class Component2 {
    public Component2 () {
        print("constructor form Component2");
    }

    public Component2 (String s) {
        print("non-default constructor form Component2 & String s - > " + s );
    }

    public void dispose() {
        print("Component2 dispose");
    }
}
