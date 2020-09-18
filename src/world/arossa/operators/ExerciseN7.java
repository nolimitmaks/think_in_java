package world.arossa.operators;
import static world.arossa.helpers.Print.*;
import java.util.Random;

public class ExerciseN7 {
    double d1;
    double d2;
    double d3;
    double d4;

    public ExerciseN7 () {
        this.coinFlip();
    }

    private void coinFlip () {
        if (this.flip1() && this.flip2() ) {
            print("Eagle");
        }
        else {
            print("Reshka");
        }

    }

    private boolean flip1 () {
        Random r = new Random();
        d1 =  r.nextDouble();
        print(d1);
        d2 =  r.nextDouble();
        print(d2);
        print("flip1 " + (d1 > d2));
        return d1 > d2;
    }

    private boolean flip2 () {
        Random r = new Random();
        d3 =  r.nextDouble();
        print(d3);
        d4 =  r.nextDouble();
        print(d4);
        print("flip2 " + (d3 > d4));
        return d3 > d4;
    }

}
