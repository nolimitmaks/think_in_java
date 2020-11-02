package world.arossa.polymorphism;
import static world.arossa.helpers.Print.*;

public class Shape {
    public void draw() {
        print("Shape.draw");
    }

    public void erase() {
        print("Shape.erase()");
    }

    protected void message() {
        print("message from super class Shape");
    }
}
