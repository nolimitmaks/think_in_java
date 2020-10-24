package world.arossa.reusing_classes;
import static world.arossa.helpers.Print.*;

public class ExerciseN1A {
    ExerciseN1 obj;

    public ExerciseN1A () {
        if(obj == null)
            obj = this.assignObj();
        print(obj.toString());
    }

    private ExerciseN1 assignObj () {
        return new ExerciseN1();
    }
}
