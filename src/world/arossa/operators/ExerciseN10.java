package world.arossa.operators;
import static world.arossa.helpers.Print.*;

public class ExerciseN10 {
    int hex1;
    int hex2;

    public ExerciseN10 (int hex1, int hex2) {
        this.hex1 = hex1;
        this.hex2 = hex2;

        this.showInfo();
    }

    private void showInfo() {

        print(Integer.toBinaryString(hex1 & hex2));
        print(Integer.toBinaryString(hex1 | hex2));
        print(Integer.toBinaryString(hex1 ^ hex2));

        print(Integer.toBinaryString(hex1 & hex1));
        print(Integer.toBinaryString(hex1 | hex1));
        print(Integer.toBinaryString(hex1 ^ hex1));

        print(Integer.toBinaryString(~hex1));
        print(Integer.toBinaryString(~hex2));

        print(Integer.toBinaryString(hex1));
        print(Integer.toBinaryString(hex2));

    }

}
