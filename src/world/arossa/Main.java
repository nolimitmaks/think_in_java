package world.arossa;
import world.arossa.helpers.Print;

//import world.arossa.everything_is_an_object.ExerciseN1;
//import world.arossa.everything_is_an_object.ExerciseN2;
//import world.arossa.everything_is_an_object.ExerciseN3;

//import world.arossa.everything_is_an_object.ExerciseN4;

//import world.arossa.everything_is_an_object.ExerciseN6;

//import world.arossa.everything_is_an_object.ExerciseN7Incrementable;
//import world.arossa.everything_is_an_object.ExerciseN7StaticTest;

//import world.arossa.everything_is_an_object.ExerciseN9;


//import world.arossa.operators.ExerciseN1;
//import world.arossa.operators.ExerciseN2;
import world.arossa.operators.ExerciseN3;
import world.arossa.operators.ExerciseN3A;


public class Main {

    public static void main(String[] args) {
//        everything_is_an_object.ExerciseN1;
//        ExerciseN1 x = new ExerciseN1();
//        x.getInstanceFields();


//        everything_is_an_object.ExerciseN2;
//        ExerciseN2 d = new ExerciseN2();
//        d.dateInfo();

//        everything_is_an_object.ExerciseN3;
//        ExerciseN3 empty = new ExerciseN3();

//        everything_is_an_object.ExerciseN4;
//        ExerciseN4 dataOnly = new ExerciseN4(1, 7.25, false);
//        dataOnly.showInfo(dataOnly);
//        System.out.println(dataOnly.getClass());

//        everything_is_an_object.ExerciseN6;
//        ExerciseN6 st = new ExerciseN6();
//        st.printInfo();

//        everything_is_an_object.ExerciseN7Incrementable;
//        everything_is_an_object.ExerciseN7StaticTest;
//        ExerciseN7StaticTest st1 = new ExerciseN7StaticTest();
//        ExerciseN7StaticTest st2 = new ExerciseN7StaticTest();
//        System.out.println(st1.n);
//        System.out.println(st2.n);
//        ExerciseN7Incrementable.increment();
//        System.out.println(st1.n);
//        System.out.println(st2.n);

//        world.arossa.everything_is_an_object.ExerciseN9
//          ExerciseN9 a = new ExerciseN9();
//          a.printInfo();

//         world.arossa.operators.ExerciseN1
//            ExerciseN1 x = new ExerciseN1("Let's code)");



//        world.arossa.operators.ExerciseN2
//        ExerciseN2 f1 = new ExerciseN2();
//        ExerciseN2 f2 = new ExerciseN2();
//
//        f1.f = 500.0f;
//        f2.f = 300.0f;
//        Print.f(f1.f);
//        Print.f(f2.f);
//
//        f1 = f2;
//        Print.f(f1.f);
//        Print.f(f2.f);
//
//        f1.f = 9.0f;
//        Print.f(f1.f);
//        Print.f(f2.f);

//        world.arossa.operators.ExerciseN3
        ExerciseN3A f1 = new ExerciseN3A();
        f1.f = 9.0f;

        Print.f(f1.f);

        ExerciseN3.f(f1);

        Print.f(f1.f);

    }
}
