package world.arossa.polymorphism;
import static world.arossa.helpers.Print.*;


class Glyph {
    void draw() { print("Glyph.draw()"); }
    Glyph() {
        print("Glyph() before draw()");
        draw();
        print("Glyph() after draw()");
    }
}

class RoundGlyph extends Glyph {
    private int radius = 1;
    RoundGlyph(int r) {
        radius = r;
        print("RoundGlyph.RoundGlyph(), radius = " + radius);
    }
    void draw() {
        print("RoundGlyph.draw(), radius = " + radius);
    }
}

class RectangularGlyph extends Glyph {
    private int side = 1;

    RectangularGlyph(int side) {
        this.side = side;
        print("RectangularGlyph.RoundGlyph(), side = " + side);
    }

    void draw() {
        print("RectangularGlyph.draw(), side = " + side);
    }
}

public class PolyConstructors {
    public PolyConstructors() {
//        new RoundGlyph(5);

        new RectangularGlyph(4);
    }

}
