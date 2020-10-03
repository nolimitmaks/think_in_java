package world.arossa.controlling_execution;

import static world.arossa.helpers.Print.*;

public class ExerciseN6 {

    public static int test(int testval, int target, int begin, int end) {
        print("\nTestval is " + testval+ " & target is "+ target + "\n\nRange start is " + begin + " & range end is " + end + "\n");
        if (testval >= begin && testval <= end)
            print("Tesval is in range from " + begin + " to " + end);
        else
            print("Testval Not in Range from " + begin + " to " + end);

        if (testval > target) {
            print("testval > target");
            return +1;
        }
        else if (testval < target) {
            print("testval < target");
            return -1;
        }

        else {
            print("Match");
            return 0;
        }

    }

}