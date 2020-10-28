package world.arossa.reusing_classes;
import static world.arossa.helpers.Print.*;

public class Component3 {
    public Component3 () {
        print("constructor form Component3 \n");
    }

    public Component3 (String s) {
        print("non-default constructor form Component3 & String s - > " + s );
    }

    public void dispose() {
        print("Component3 dispose");
    }
}
