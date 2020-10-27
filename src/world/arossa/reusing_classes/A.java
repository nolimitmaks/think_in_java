package world.arossa.reusing_classes;
import static world.arossa.helpers.Print.*;

public class A {
    private int n;
    private String s;

    public A (int n, String s) {
        this.n = n;
        this.s = s;
        print("A constructor " + this.n + " " + this.s);
    }
}
