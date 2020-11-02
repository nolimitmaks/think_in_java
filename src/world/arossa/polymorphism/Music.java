package world.arossa.polymorphism;
import static world.arossa.helpers.Print.*;

enum Note {
    MIDDLE_C, C_SHARP, B_FLAT;
}

class Instrument {
    void play(Note n) { print(this.getClass().getSimpleName() + "." + n); }
    void adjust() { print("Adjusting " +this.getClass().getSimpleName()); }

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

public class Music {
    // Upcasting during addition to the array:
    public static Instrument[] orchestra = {
            new Wind(),
            new Percussion(),
            new Stringed(),
            new Brass(),
            new Woodwind(),
            new Brass()
    };

    public static void tune(Instrument i) {
        i.play(Note.B_FLAT);
    }

    public static void tuneAll(Instrument[] e) {
        for(Instrument i : e)
            tune(i);
    }

    public static void showInfor() {
        
        tuneAll(orchestra);
    }

}
