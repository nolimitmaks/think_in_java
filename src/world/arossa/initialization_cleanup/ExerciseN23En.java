package world.arossa.initialization_cleanup;
import static world.arossa.helpers.Print.*;

public enum ExerciseN23En {


    USD(new ExerciseN23("I")), EURO(new ExerciseN23("II")), GBP(new ExerciseN23("III"));

    ExerciseN23En(ExerciseN23 obj) {
        this.obj = obj;
    }

    private final ExerciseN23 obj;

    public void getObjInfo() {
        print(this.obj.getX());
    }
}
