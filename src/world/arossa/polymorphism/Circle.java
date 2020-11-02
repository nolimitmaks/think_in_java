package world.arossa.polymorphism;
import static world.arossa.helpers.Print.*;

public class Circle extends Shape {
    @Override
    public void draw() {
        this.message();
        print("Circle.draw");
    }
    @Override
    public void erase() {
        print("Circle.erase()");
    }

    @Override
    protected void message() {
        print("message from super class Shape");
    }
}
