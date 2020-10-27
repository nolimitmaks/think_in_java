package world.arossa.reusing_classes;
import static world.arossa.helpers.Print.*;

public class Root {
    Component1 c1;
    Component2 c2;
    Component3 c3;

    public Root () {

        c1 = new Component1("apple");
        c2 = new Component2("google");
        c3 = new Component3("netflix\n");

    }
}
