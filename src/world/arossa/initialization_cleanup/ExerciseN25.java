package world.arossa.initialization_cleanup;

import world.arossa.access_control.ExerciseN4;

public class ExerciseN25  {
    public ExerciseN25 () {
        ExerciseN4 x = new ExerciseN4();

//        if we try get access to protected Object`method
//        x.showInfo();
//        it will crashed
//java: showInfo() has protected access in world.arossa.access_control.ExerciseN4

    }
}

/* this class for from access controls
* Exercise 4: (2) Show that protected methods have package access but are not public.
* */


//answer
//java: showInfo() has protected access in world.arossa.access_control.ExerciseN4