package world.arossa.access_control;
import static world.arossa.helpers.Print.print;

public class ExerciseN6A extends ExerciseN6 {
    private String n;
    public ExerciseN6A ( String n) {
        this.n = n;

        this.changeSuperClassProtectedField();
    }

    private void changeSuperClassProtectedField() {
        this.changeInfo(this.n);
    }
 }
