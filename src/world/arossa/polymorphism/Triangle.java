package world.arossa.polymorphism;
import static world.arossa.helpers.Print.*;

public class Triangle extends Shape {
    public void draw() {
        print("Triangle.draw");
    }

    public void erase() {
        print("Triangle.erase()");
    }
}
