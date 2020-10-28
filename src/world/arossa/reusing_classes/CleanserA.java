package world.arossa.reusing_classes;

import static world.arossa.helpers.Print.print;

public class CleanserA {
    //    private String s = "Cleanser";
    protected String s = "CleanserA";

    public CleanserA() {
        print("CleanserA constructor");
    }

    public void append(String a) { s += a; }

    public void dilute() { append(" dilute()"); }

    public void apply() { append(" apply()"); }

    public void scrub() { append(" scrub()"); }

    public String toString() { return s; }


}
