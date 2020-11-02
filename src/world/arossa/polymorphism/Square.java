package world.arossa.polymorphism;
import static world.arossa.helpers.Print.*;

public class Square extends Shape {
    @Override
    public void draw() {
        print("Square.draw");
    }
    @Override
    public void erase() {
        print("Square.erase()");
    }
}
