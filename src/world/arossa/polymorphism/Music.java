package world.arossa.polymorphism;
import static world.arossa.helpers.Print.*;

enum Note {
    MIDDLE_C, C_SHARP, B_FLAT;
}

class Instrument {
    void play(Note n) { print("Instrument.play() " + n); }
    void adjust() { print("Adjusting Instrument"); }

    public String toString() {
        return "Instrument";
    }

}

class Wind extends Instrument {

    void play(Note n) { print("Wind.play() " + n); }
    void adjust() { print("Adjusting Wind"); }

    public String toString() {
        return "Wind";
    }
}

class Percussion extends Instrument {
    void play(Note n) { print("Percussion.play() " + n); }
    void adjust() { print("Adjusting Percussion"); }

    public String toString() {
        return "Percussion";
    }
}

class Stringed extends Instrument {

    void play(Note n) { print("Stringed.play() " + n); }
    void adjust() { print("Adjusting Stringed"); }

    public String toString() {
        return "Stringed";
    }
}

class Brass extends Wind {
    void play(Note n) { print("Brass.play() " + n); }
    void adjust() { print("Adjusting Brass"); }

    public String toString() {
        return "Brass";
    }
}
class Woodwind extends Wind {
    void play(Note n) { print("Woodwind.play() " + n); }
    void adjust() { print("Woodwind Brass"); }

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

        for (Instrument insturment : orchestra
             ) {
            print(insturment);
        }

//        tuneAll(orchestra);
    }

}
