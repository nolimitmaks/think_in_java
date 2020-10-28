package world.arossa.reusing_classes;

import static world.arossa.helpers.Print.print;

public class DetergentA {
    private CleanserA clean = new CleanserA();

    public DetergentA () {
        print("DetergentA constuctor");
    }

    public void append(String a) {
        clean.append(a);
    }

    public void dilute() {
        clean.dilute();
    }

    public void apply() {
        clean.apply();
    }

    public void scrub() {
        clean.scrub();
    }

    public String toString() { return clean.s; }


    public void foam() { append(" foam()"); }
}
