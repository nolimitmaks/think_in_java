package world.arossa.polymorphism;
import java.util.Random;

import static world.arossa.helpers.Print.*;

public class Shapes {
    private Shape[] shapes;

    public Shapes(int arr_length) {
        this.shapes = new Shape[arr_length];

        this.RandomShapeGenerator(this.shapes);
    }

    private void RandomShapeGenerator(Shape[] shapes) {
        Random r = new Random();

        for (int i = 0; i < shapes.length ; i++) {

            switch (r.nextInt(3))   {
                case 0 -> shapes[i] = new Circle();
                case 1 -> shapes[i] = new Square();
                case 2 -> shapes[i] = new Triangle();
            }

        }
        print(shapes.toString());
        this.printShapes(shapes);

    }

    private void printShapes(Shape[] shapes) {
        for (Shape obj : shapes
             ) {
            obj.draw();
            obj.erase();
        }
    }
}
