package world.arossa.initialization_cleanup;
import static world.arossa.helpers.Print.*;

public class ExerciseN8 {
    int n = 0;
    public ExerciseN8 () {
        this.a();
    }

    private void a () {
        increment();
        this.increment();

        this.increment().increment().increment().increment().showInfo();

    }

    public ExerciseN8 increment () {
        n++;
        return this;
    }

    public void showInfo() {
        print(n);
    }

}
