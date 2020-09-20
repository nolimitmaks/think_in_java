package world.arossa.operators;
import static world.arossa.helpers.Print.*;

public class ExerciseN13 {

    char a;
    char b;
    char c;
    char d;

    public ExerciseN13 (char a, char b, char c, char d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;

        this.showInfo();
    }

    private void showInfo() {
        print(Integer.toBinaryString(a));
        print(Integer.toBinaryString(b));
        print(Integer.toBinaryString(c));
        print(Integer.toBinaryString(d));
    }


}
