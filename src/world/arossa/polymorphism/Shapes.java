package world.arossa.polymorphism;
import java.util.Random;

import static world.arossa.helpers.Print.*;

public class Shapes {
    private Shape[] shapes;

    public Shapes(int arr_length) {
        this.shapes = new Shape[arr_length];

        this.printShapes(this.shapes);
    }

    private void printShapes(Shape[] shapes) {

        for (int i = 0; i < shapes.length ; i++) {

            shapes[i] = RandomShapeGenerator.next();

        }

        print(shapes.toString());

        for (Shape obj : shapes
             ) {
            obj.draw();
            obj.erase();
        }
    }
}
