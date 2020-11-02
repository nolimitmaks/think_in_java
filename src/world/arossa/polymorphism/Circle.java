package world.arossa.polymorphism;
import static world.arossa.helpers.Print.*;

public class Circle extends Shape {
    @Override
    public void draw() {
        print("Circle.draw");
    }
    @Override
    public void erase() {
        print("Circle.erase()");
    }
}
