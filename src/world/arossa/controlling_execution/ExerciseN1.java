package world.arossa.controlling_execution;
import static world.arossa.helpers.Print.*;

public class ExerciseN1 {

    int start;
    int stop;

    public ExerciseN1 (int start, int stop) {
        this.start = start;
        this.stop = stop;

        this.showInfo();

    }

    private void showInfo() {
        for (int i = start; i <= stop; i++) {
            print(i);
        }
    }
}
