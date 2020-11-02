package world.arossa.polymorphism;

import java.util.Random;

public class RandomShapeGenerator {
    private static Random r = new Random();

    public static Shape next() {

        switch (r.nextInt(4))   {
//            default-> ???
//            case 0 -> new Circle();
//            case 1 -> new Square();
//            case 2 -> new Triangle();

            default:
            case 0: return new Circle();
            case 1: return new Square();
            case 2: return new Triangle();
            case 3: return new PolymorphTest();

        }

    }

}
