package world.arossa.reusing_classes;
import static world.arossa.helpers.Print.*;

public class ProtectedA {
    protected String s;
    protected ProtectedA(String s) {
        this.s = s;
        print(this.s);
    }

    protected void showInfo(String s) {
        print("from protected method in super class -> " + s);
    }

}
