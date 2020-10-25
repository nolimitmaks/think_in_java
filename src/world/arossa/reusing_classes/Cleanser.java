package world.arossa.reusing_classes;
import static world.arossa.helpers.Print.*;

public class Cleanser {
//    private String s = "Cleanser";
    protected String s = "Cleanser";

    public Cleanser () {
        print("Cleanser constructor");
    }

    public void append(String a) { s += a; }

    public void dilute() { append(" dilute()"); }

    public void apply() { append(" apply()"); }

    public void scrub() { append(" scrub()"); }

    public String toString() { return s; }


}
