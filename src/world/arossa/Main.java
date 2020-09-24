package world.arossa;

import java.util.Random;
import java.util.zip.DeflaterOutputStream;

import static world.arossa.helpers.Print.*;


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
//import world.arossa.operators.ExerciseN3;
//import world.arossa.operators.ExerciseN3A;
//import world.arossa.operators.ExerciseN4;
//import world.arossa.operators.ExerciseN5;
//import world.arossa.operators.ExerciseN7;
//import world.arossa.operators.ExerciseN8;
//import world.arossa.operators.ExerciseN9;
//import world.arossa.operators.ExerciseN10;
//import world.arossa.operators.ExerciseN11;
//import world.arossa.operators.ExerciseN12;
//import world.arossa.operators.ExerciseN13;
import world.arossa.operators.ExerciseN14;

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
//        print(st1.n);
//        print(st2.n);
//        ExerciseN7Incrementable.increment();
//        print(st1.n);
//        print(st2.n);

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
//        print(f1.f);
//        print(f2.f);
//
//        f1 = f2;
//        print(f1.f);
//        print(f2.f);
//
//        f1.f = 9.0f;
//        print(f1.f);
//        print(f2.f);

//        world.arossa.operators.ExerciseN3
//        ExerciseN3A f1 = new ExerciseN3A();
//        f1.f = 9.0f;
//
//        print(f1.f);
//
//        ExerciseN3.f(f1);
//
//        print(f1.f);


//        provide range of distance, range of time in minutes to find out velocity
//        ExerciseN4 v = new ExerciseN4(100, 250, 10, 125);

/*
        ExerciseN5 dog1 = new ExerciseN5("spot", "Ruff!");
        ExerciseN5 dog2 = new ExerciseN5("scruffy", "Wurf!");
        print(dog1.name);
        print(dog1.say);
        print(dog2.name);
        print(dog2.say);

        ExerciseN5 dog3 = new ExerciseN5("doberman", "Rrr!");
        dog1 = dog3;
        print(dog3.name);
        print(dog3.say);
        print(dog1.name);
        print(dog1.say);

        print(dog1 == dog2);
        print(dog1 == dog3);
        print(dog1.equals(dog2));
        print(dog1.equals(dog3));

 */

//        world.arossa.operators.ExerciseN7;
//        ExerciseN7 coin = new ExerciseN7();


//        world.arossa.operators.ExerciseN8;
//        ExerciseN8 x = new ExerciseN8(0x2f, 0X2F, 0177);


//        ExerciseN9 x = new ExerciseN9(Float.MAX_VALUE, Float.MIN_VALUE, Double.MAX_VALUE, Double.MIN_VALUE);
//        3.4028235E38
//        1.4E-45
//        1.7976931348623157E308
//        4.9E-324


//        world.arossa.operators.ExerciseN10;
//        ExerciseN10 x = new ExerciseN10(0xbfffffb, 0x99999999);


//        import world.arossa.operators.ExerciseN11;
//        ExerciseN11 x = new ExerciseN11(0x80000000);

        //        import world.arossa.operators.ExerciseN12;
//        ExerciseN12 x = new ExerciseN12(-1 >> 1);


//      world.arossa.operators.ExerciseN13;
//        ExerciseN13 x = new ExerciseN13('f', 'a', 'n', 'g');


        ExerciseN14 x = new ExerciseN14("a", "b");
        x.showInfo("!=");
    }
}
