package world.arossa.initialization_cleanup;

import world.arossa.access_control.ExerciseN5;

import static world.arossa.helpers.Print.print;

public class ExerciseN26 {
    public ExerciseN26 () {
//        outside its own package ExerciseN5 object has access to its public fields only
        ExerciseN5 n = new ExerciseN5();
        print("\n\n\ninfo from ExerciseN26");
        print(n.public_field);
        n.showPublicInfo();
//        n.showPrivetInfo();
//        java: showPrivetInfo() has private access in world.arossa.access_control.ExerciseN5
//        n.showProtectedInfo();
//        java: showProtectedInfo() has protected access in world.arossa.access_control.ExerciseN5


//        print(n.privet_field);
//        java: privet_field has private access in world.arossa.access_control.ExerciseN5
//        print(n.protected_field);
//        java: protected_field has protected access in world.arossa.access_control.ExerciseN5

    }
}


//Exercise 5: (2) Create a class with public, private, protected, and package-access
//        fields and method members. Create an object of this class and see what kind of compiler
//        messages you get when you try to access all the class members. Be aware that classes in the
//        same directory are part of the “default” package.