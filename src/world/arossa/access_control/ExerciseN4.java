package world.arossa.access_control;
import java.lang.reflect.Method;

import static world.arossa.helpers.Print.*;

public class ExerciseN4 {
    public ExerciseN4 () {
    }

    protected void showInfo() {
        print("info from protected method");
    }


    protected void showMetods () {
        Class x2 = ExerciseN4.class;
        Method[] m = x2.getMethods();

        for (Method method : m) {

            String MethodName = method.getName();

            print(
                    "Name of the method: "
                            + MethodName
            );
        }
    }

    protected void showMetodsV2 ()  {

        for ( Method m : ExerciseN4.class.getDeclaredMethods()
        ) {
            print( m.getName() );
        }
    }

}
