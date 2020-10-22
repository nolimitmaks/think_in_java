package world.arossa.initialization_cleanup;
import static world.arossa.helpers.Print.print;

import world.arossa.access_control.ExerciseN5;

public class ExerciseN27 extends ExerciseN5 {

    public ExerciseN27 () {
        print("\n\n\ninfo from ExerciseN27");
        print(this.public_field);
        this.showPublicInfo();

        print(this.protected_field);
        this.showProtectedInfo();

//         we have access to public and protected fields & methods inhereted from super class in this class
//        obviously to public fields & methods of super class also has access
    }
}
