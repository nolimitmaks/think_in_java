package world.arossa.initialization_cleanup;
import static world.arossa.helpers.Print.*;

public class ExerciseN21A {
    public ExerciseN21A() {
        this.showInfo();
    }

    private void showInfo() {
        for ( ExerciseN21 e : ExerciseN21.values()
             ) {
            print( "enum name is -> " + e.name() + "\n\t\t\t\t\t & ordinal # ->"+ e.ordinal());
        }
    }
}
