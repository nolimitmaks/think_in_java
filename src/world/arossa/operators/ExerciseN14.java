package world.arossa.operators;
import static world.arossa.helpers.Print.*;
import java.util.ArrayList;
import java.util.Arrays;

public class ExerciseN14 {
    String s1;
    String s2;


    ArrayList arrList = new ArrayList();


    public ExerciseN14 (String s1, String s2, String[] comparisons) {
        this.s1 = s1;
        this.s2 = s2;


//        convert Array to ArrayList just for fun
        for (int i = 0; i < comparisons.length; i++) {
            this.arrList.add(comparisons[i]);
        }

        print(this.arrList.toString());
        
        this.checkAll(this.arrList);
    }

    private void showInfo (String s) {

        switch (s) {
            case ">":
                if(s1.length() > s2.length()) {
                    print("s1.length() > s2.length()");
                }
                break;
            case "<":
                if(s1.length() < s2.length()) {
                    print("s1.length() < s2.length()");
                }
                break;
            case "<=":
                if(s1.length() <= s2.length()) {
                    print("s1.length() <= s2.length()xx");
                }
                break;
            case ">=":
                if(s1.length() >= s2.length()) {
                    print("s1.length() >= s2.length()");
                }
                break;
            case "==":
                if(s1 == s2) {
                    print("s1 == s2");
                }
                break;
            case "!=":
                if(s1 != s2) {
                    print("s1 != s2");
                }
                break;
            case "equal":
                if(s1.equals(s2)) {
                    print("s1.equals(s2)");
                }
                break;
            case "equalIgnoreCase":
                if(s1.equalsIgnoreCase(s2)) {
                    print("s1.equalsIgnoreCase(s2)");
                }
                break;
        }
    }


    private void checkAll (ArrayList<String> x) {

        for (int i = 0; i < x.size(); i++) {
            this.showInfo(x.get(i));
        }
    }
}
