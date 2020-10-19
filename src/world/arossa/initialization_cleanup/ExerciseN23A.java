package world.arossa.initialization_cleanup;
import static world.arossa.helpers.Print.*;

public class ExerciseN23A {
    ExerciseN23En enu;

    public ExerciseN23A (ExerciseN23En enu) {
        this.enu = enu;

        this.showInfo();
    }

    private void showInfo() {
        switch (enu) {
            case USD:
                print("name is -> " + enu.name());
                enu.getObjInfo();
                break;
            case EURO:
                print("name is -> " + enu.name());
                enu.getObjInfo();
                break;
            case GBP:
                print("name is -> " + enu.name());
                enu.getObjInfo();
                break;

        }
    }
}
