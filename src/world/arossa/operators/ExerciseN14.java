package world.arossa.operators;

public class ExerciseN14 {
    String s1;
    String s2;

    public ExerciseN14 (String s1, String s2) {
        this.s1 = s1;
        this.s2 = s2;


    }

    public void showInfo (String s) {

        switch (s) {
            case ">":
                if(s1.length() > s2.length()) {
                    System.out.println("s1.length() > s2.length()");
                }
                break;
            case "<":
                if(s1.length() < s2.length()) {
                    System.out.println("s1.length() < s2.length()");
                }
            case "<=":
                if(s1.length() <= s2.length()) {
                    System.out.println("s1.length() <= s2.length()");
                }
                break;
            case ">=":
                if(s1.length() >= s2.length()) {
                    System.out.println("s1.length() >= s2.length()");
                }
                break;
            case "==":
                if(s1 == s2) {
                    System.out.println("s1 == s2");
                }
                break;
            case "!=":
                if(s1 != s2) {
                    System.out.println("s1 == s2");
                }
                break;
            case "equal":
                if(s1.equals(s2)) {
                    System.out.println("s1.equals(s2)");
                }
                break;
            case "equalIgnoreCase":
                if(s1.equalsIgnoreCase(s2)) {
                    System.out.println("s1.equalsIgnoreCase(s2)");
                }
                break;
        }
    }
}
