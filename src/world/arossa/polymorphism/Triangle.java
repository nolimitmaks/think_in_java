package world.arossa.polymorphism;
import static world.arossa.helpers.Print.*;

public class Triangle extends Shape {
    @Override
    public void draw() {
        print("Triangle.draw");
    }
    @Override
    public void erase() {
        print("Triangle.erase()");
    }
    @Override
    protected void message() {
        print("message from super class Triangle");
    }
}
