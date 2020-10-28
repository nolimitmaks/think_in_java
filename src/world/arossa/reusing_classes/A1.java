package world.arossa.reusing_classes;
import static world.arossa.helpers.Print.*;

public class A1 {

    protected void show() {
        print("A1 class method with no parameters");
    }

    protected void show(String s) {
        print("A1 class method with String parameters s -> " + s + "\n");
    }

    protected void show(int n) {
        print("A1 class method with int parameter  n -> " + n);

    }

}
