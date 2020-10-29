package world.arossa.reusing_classes;
import static world.arossa.helpers.Print.*;

public class ProtectedB extends ProtectedA {
    public ProtectedB(String s) {
        super(s);
        super.showInfo(s);
    }

    public void show() {
        this.showInfo(s);
    }
}
