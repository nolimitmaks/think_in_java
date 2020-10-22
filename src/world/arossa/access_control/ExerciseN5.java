package world.arossa.access_control;
import static world.arossa.helpers.Print.*;

public class ExerciseN5 {
    public String public_field = "public_field";
    private String privet_field = "privet_field";
    protected String protected_field = "protected_field";

    public ExerciseN5 () {

    }

    public void showPublicInfo () {
        print("this info from public showPublicInfo method");
    }

    private void showPrivetInfo () {
        print("this info from public showPrivetInfo method");
    }

    protected void showProtectedInfo () {
        print("this info from public showProtectedInfo method");
    }
}


//Exercise 5: (2) Create a class with public, private, protected, and package-access
//        fields and method members. Create an object of this class and see what kind of compiler
//        messages you get when you try to access all the class members. Be aware that classes in the
//        same directory are part of the “default” package.