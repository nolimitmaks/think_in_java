package world.arossa.reusing_classes;

public class Cleanser {
//    private String s = "Cleanser";
    protected String s = "Cleanser";

    public void append(String a) { s += a; }

    public void dilute() { append(" dilute()"); }

    public void apply() { append(" apply()"); }

    public void scrub() { append(" scrub()"); }

    public String toString() { return s; }


}
