package world.arossa.polymorphism;
import static world.arossa.helpers.Print.*;

public class Circle extends Shape {

    public void draw() {
        print("Circle.draw");
    }

    public void erase() {
        print("Circle.erase()");
    }
}
