package world.arossa.reusing_classes;
import static world.arossa.helpers.Print.*;

public class Stem extends Root {

    Component1 c1;
    Component2 c2;
    Component3 c3;

    public Stem () {
        c1 = new Component1();
        c2 = new Component2();
        c3 = new Component3();
    }

}
