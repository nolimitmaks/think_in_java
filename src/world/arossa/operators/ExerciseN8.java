package world.arossa.operators;
import static world.arossa.helpers.Print.*;

public class ExerciseN8 {

    long l1;
    long l2;
    long l3;

    public ExerciseN8 (long hexadecimalLowercase,long hexadecimalUppercase, long octalLeadingZero) {
        this.l1 = hexadecimalLowercase;
        this.l2 = hexadecimalUppercase;
        this.l3 = octalLeadingZero;

        print(Long.toBinaryString(l1));
        print(Long.toBinaryString(l2));
        print(Long.toBinaryString(l3));
    }
}

