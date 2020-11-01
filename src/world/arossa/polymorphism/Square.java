package world.arossa.polymorphism;
import static world.arossa.helpers.Print.*;

public class Square extends Shape {
    public void draw() {
        print("Square.draw");
    }

    public void erase() {
        print("Square.erase()");
    }
}
