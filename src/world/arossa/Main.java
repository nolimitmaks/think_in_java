package world.arossa;

import java.lang.reflect.Method;
import java.sql.Connection;
import java.util.Arrays;
import java.util.Random;
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
//import world.arossa.operators.ExerciseN14;



//import world.arossa.controlling_execution.ExerciseN1;
//import world.arossa.controlling_execution.ExerciseN2;
//import world.arossa.controlling_execution.ExerciseN4;
//import static world.arossa.controlling_execution.ExerciseN6.*;
//import world.arossa.controlling_execution.ExerciseN7;
//import world.arossa.controlling_execution.ExerciseN8;
//import world.arossa.controlling_execution.ExerciseN9;



//import world.arossa.initialization_cleanup.ExerciseN1;
//import world.arossa.initialization_cleanup.ExerciseN2;
//import world.arossa.initialization_cleanup.ExerciseN3;
//import world.arossa.initialization_cleanup.ExerciseN4;
//import world.arossa.initialization_cleanup.ExerciseN5;
//import world.arossa.initialization_cleanup.ExerciseN6;
//import world.arossa.initialization_cleanup.ExerciseN7;
//import world.arossa.initialization_cleanup.ExerciseN8;
//import world.arossa.initialization_cleanup.ExerciseN9;
//import world.arossa.initialization_cleanup.ExerciseN14;
//import world.arossa.initialization_cleanup.ExerciseN15;
//import world.arossa.initialization_cleanup.ExerciseN16;
//import world.arossa.initialization_cleanup.ExerciseN16A;
//import world.arossa.initialization_cleanup.ExerciseN17;
//import world.arossa.initialization_cleanup.ExerciseN17A;
//import world.arossa.initialization_cleanup.ExerciseN18;


//import world.arossa.access_control.ExerciseN1;
//import world.arossa.access_control.ExerciseN2;
import world.arossa.access_control.*;
import world.arossa.initialization_cleanup.Foreign;
//import world.arossa.access_control.ExerciseN3;
//import world.arossa.access_control.ExerciseN4;
//import world.arossa.access_control.ExerciseN5;
//import world.arossa.initialization_cleanup.*;


import world.arossa.reusing_classes.*;



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

//        String[] arr = {"<", ">", ">=", "<=", "==", "!=", "equal", "equalIgnoreCase"};
//        ExerciseN14 x = new ExerciseN14("jbl", "bose",  arr);


//        world.arossa.controlling_execution.ExerciseN1;
//        ExerciseN1 x = new ExerciseN1(1, 100);


//        world.arossa.controlling_execution.ExerciseN2;
//        ExerciseN2 x = new ExerciseN2(10, 25);

//        world.arossa.controlling_execution.ExerciseN4;
//        ExerciseN4 x = new ExerciseN4(25, 5);

//import static world.arossa.controlling_execution.ExerciseN6.*;
//        print(test(5, 10, 4, 4));

//        world.arossa.controlling_execution.ExerciseN7;
//        ExerciseN7 x = new ExerciseN7(5, 10, 7);


//        world.arossa.controlling_execution.ExerciseN8;
//        ExerciseN8 x = new ExerciseN8();

//        world.arossa.controlling_execution.ExerciseN9;
//        ExerciseN9 x = new ExerciseN9(10);
/* we get fibonaci
1
1
2
3
5
8
13
21
34
55
* */

//        world.arossa.initialization_cleanup.ExerciseN1;
//        ExerciseN1 x = new ExerciseN1();

//world.arossa.initialization_cleanup.ExerciseN2;
//        ExerciseN2 x = new ExerciseN2();
/*
*       answer -> a String field that is initialized at the point of
definition are visible to all methods. its scope of class.
*
* a String field that is initialized with constructor are visible only inside constructor method but we have an option to set it with constructor parameter
*
* */

//        world.arossa.initialization_cleanup.ExerciseN3;
//        ExerciseN3 x = new ExerciseN3();

//        world.arossa.initialization_cleanup.ExerciseN4;
//        ExerciseN4 x = new ExerciseN4("overloding");

//        world.arossa.initialization_cleanup.ExerciseN5;
//        ExerciseN5 x = new ExerciseN5(5, false, 2.75);

//        world.arossa.initialization_cleanup.ExerciseN6;
//        ExerciseN6 x = new ExerciseN6(false, 7.29);

//        world.arossa.initialization_cleanup.ExerciseN7;
//        ExerciseN7 x = new ExerciseN7();
//        x.showInfo();

//        world.arossa.initialization_cleanup.ExerciseN8;
//        ExerciseN8 x = new ExerciseN8();


//        world.arossa.initialization_cleanup.ExerciseN9;
//        ExerciseN9 x = new ExerciseN9(10);

//        world.arossa.initialization_cleanup.ExerciseN14;
//        ExerciseN14.showInfo();

//        world.arossa.initialization_cleanup.ExerciseN15;
//        ExerciseN15 x1 = new ExerciseN15();
//        ExerciseN15 x2 = new ExerciseN15("inside constructor with parameter");

//        world.arossa.initialization_cleanup.ExerciseN16;
//        ExerciseN16 n = new ExerciseN16("A", "B", "C", "D", "E");


//        world.arossa.initialization_cleanup.ExerciseN16A;
//        ExerciseN16A n = new ExerciseN16A(4);

//        world.arossa.initialization_cleanup.ExerciseN17 ~17A;
//        ExerciseN17A s = new ExerciseN17A();

//        world.arossa.initialization_cleanup.ExerciseN18;
//        ExerciseN18 s = new ExerciseN18();


//        world.arossa.initialization_cleanup.ExerciseN19;
//        ExerciseN19.printArgs("A", "B", "C");
//        String[] arr = {"alfa", "beta", "delta"};
//        ExerciseN19.printArgs(arr);

//        world.arossa.initialization_cleanup.ExerciseN21 ~ 21A;
//        ExerciseN21A x = new ExerciseN21A();

//        world.arossa.initialization_cleanup.ExerciseN21 ~ 22;
//        ExerciseN22 enum1 = new ExerciseN22( ExerciseN21.EURO );
//        ExerciseN22 enum2 = new ExerciseN22( ExerciseN21.GBP );
//        ExerciseN22 enum3 = new ExerciseN22( ExerciseN21.EURO );
//        ExerciseN22 enum4 = new ExerciseN22( ExerciseN21.JPN );
//        ExerciseN22 enum5 = new ExerciseN22( ExerciseN21.PLZ );
//        ExerciseN22 enum6 = new ExerciseN22( ExerciseN21.UAH );



//        world.arossa.initialization_cleanup.ExerciseN23~23A
//        ExerciseN23A enum1 = new ExerciseN23A( ExerciseN23En.USD );
//        ExerciseN23A enum2 = new ExerciseN23A( ExerciseN23En.EURO );
//        ExerciseN23A enum3 = new ExerciseN23A( ExerciseN23En.GBP );


        //world.arossa.access_control.ExerciseN1;
        //world.arossa.initialization_cleanup.*;
//        ExerciseN1 x = new ExerciseN1();

//world.arossa.access_control.ExerciseN2;
//world.arossa.initialization_cleanup.*;
//        ExerciseN2 x = new ExerciseN2();



// world.arossa.access_control.ExerciseN3;
// world.arossa.initialization_cleanup.*;
//        ExerciseN3  production_version = new ExerciseN3(true);
//        ExerciseN3 non_production_version = new ExerciseN3(false);

//world.arossa.access_control.Sundae;
//        Sundae x = new Sundae();



//world.arossa.access_control.ExerciseN4;
//world.arossa.access_control.ExerciseN4A;
//        ExerciseN4A extends ExerciseN4 with protected methods
//        ExerciseN4A x = new ExerciseN4A();

//        ExerciseN25 x = new ExerciseN25();




//world.arossa.access_control.ExerciseN5;
//world.arossa.initialization_cleanup.*;
//        ExerciseN5 x = new ExerciseN5();
//        print(x.public_field);
//        x.showPublicInfo();

//        x.showPrivetInfo();
//        java: showPrivetInfo() has private access in world.arossa.access_control.ExerciseN5
//        x.showProtectedInfo();
//        java: showProtectedInfo() has protected access in world.arossa.access_control.ExerciseN5

//        print(x.privet_field);
//        java: privet_field has private access in world.arossa.access_control.ExerciseN5
//        print(x.protected_field);
//        java: protected_field has protected access in world.arossa.access_control.ExerciseN5

//        ExerciseN26 e26 = new ExerciseN26();



//      ExerciseN5 super class ExerciseN27 sub class. ExerciseN27 outside of its own package it has access only to public methods & fields
//        ExerciseN27 e27 = new ExerciseN27();
//        print(e27.public_field);
//        e27.showPublicInfo();


//        ExerciseN6A n = new ExerciseN6A("\n\n\nprotected field`s value in super class is changed in subclass");


//        ExerciseN7 x = new ExerciseN7();


//        ConnectionManager.printInfo();


//        Foreign x = new Foreign();
//        Foreign2 x2 = new Foreign2();
//        Explain why the compiler generates an error.
//        Would making the Foreign class part of the
//        access.local package change anything? -> Yes it would make the diference beacouse Forein2 is inside  of the
//        package access_controls



// world.arossa.reusing_classes.*;
//        ExerciseN1A x = new ExerciseN1A();

//        Cleanser c = new Cleanser();
//        c.append(" aqua");
//        c.dilute();
//        c.apply();
//        c.scrub();
//        print("\nfrom Cleanser \n" + c);
//
//        Detergent d = new Detergent();
//        d.append(" Detergent ");
//        d.apply();
//        d.scrub();
//        print("\nfrom Detergent \n" + d);
//
//
//        Sterilizing x = new Sterilizing();
//        x.scrub();
//        x.sterilize().foam();
//        print("\nfrom Sterilizing ");
//        print(x);

//        Sterilizing x = new Sterilizing();


//        C n = new C();


//        Chess x = new Chess();
        /*
        answer is :
        we cannot create an obj without using a conctructor in Board Games CLass
        * */


//                C obj = new C(5, "apple");

//        E obj = new E();
//        E obj_constructor_with_args = new E("apple", 10);


//        Stem st = new Stem();
//        st.dispose();

//        DetergentA det = new DetergentA();
//        det.append(" Apple");
//        det.apply();
//        det.dilute();
//        det.scrub();
//        det.foam();
//        print(det.toString());



//        B1 x = new B1();


//        try {
//
//        } finally {
//
//        }

//        CarShow x = new CarShow();

//        ProtectedB x = new ProtectedB("apple");
//        x.show();

//        Frog x = new Frog();
//        x.upcastToSuper(x);

//        FinalA x = new FinalA();

//        FinalData x = new FinalData();

//        FinalOverridingIllusion x = new FinalOverridingIllusion();
//        x.f();
//        x.g();

//        InheritFinalMethod x = new InheritFinalMethod();
//        x.show();

//        AtemptToInheritFromFinalClass x = new AtemptToInheritFromFinalClass();



//        Beetle b = new Beetle();
        BeetleColorado b = new BeetleColorado();
        b.show();

    }

}
