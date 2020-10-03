package world.arossa.controlling_execution;

import static world.arossa.helpers.Print.*;

public class ExerciseN7 {


    int start;
    int stop;
    int exitLoop;

    public ExerciseN7 (int start, int stop, int exitLoop) {
        this.start = start;
        this.stop = stop;
        this.exitLoop = exitLoop;

        this.showInfo();

    }

    private void showInfo() {
        for (int i = start; i <= stop; i++) {
            print(i);
            if(i == exitLoop) {
                print("exit loop via break at i -> " + i);
                break;
            }
        }
    }


}
