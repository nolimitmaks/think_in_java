package world.arossa.polymorphism;
import java.util.Random;

import static world.arossa.helpers.Print.*;

enum Note {
    MIDDLE_C, C_SHARP, B_FLAT;
}

class Instrument {
    void play(Note n) { print(this.getClass().getSimpleName() + "." + n); }
    void adjust(Note x) { print("Adjusting " +this.getClass().getSimpleName() + " " + x + "\n"); }

    public String toString() {
        return "Instrument";
    }
}

class Wind extends Instrument {
    public String toString() {
        return "Wind";
    }
}

class Percussion extends Instrument {
    public String toString() {
        return "Percussion";
    }
}

class Stringed extends Instrument {
    public String toString() {
        return "Stringed";
    }
}

class Brass extends Wind {
    public String toString() {
        return "Brass";
    }
}
class Woodwind extends Wind {

    public String toString() {
        return "Woodwind";
    }
}

class newIstrument extends Woodwind {
    public String toString() {
        return "newIstrument";
    }
}

public class Music {
    private static Random r = new Random();

    // Upcasting during addition to the array:
    public static Instrument[] orchestra = {
            next(),
            next(),
            next(),
            next(),
            next(),
            next(),
            next()
    };

    public static void tune(Instrument i) {
        i.play(Note.B_FLAT);
        i.adjust(Note.MIDDLE_C);
    }

    public static void tuneAll(Instrument[] e) {
        for(Instrument i : e)
            tune(i);
    }

    public static void showInfor() {

        tuneAll(orchestra);

    }

    private static Instrument next() {

        switch (r.nextInt(8)) {
            default:
            case 0: return new newIstrument();
            case 1: return new Wind();
            case 2: return new Percussion();
            case 3: return new Stringed();
            case 4: return new Brass();
            case 5:
            case 6:
            case 7:
                return new Woodwind();
        }
    }
}
