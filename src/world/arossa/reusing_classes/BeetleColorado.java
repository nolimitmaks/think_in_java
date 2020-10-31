package world.arossa.reusing_classes;
import static world.arossa.helpers.Print.*;

public class BeetleColorado extends Beetle {

    private int k = printInit("\n\nBeetleColorado.k initialized");
    public BeetleColorado() {
        print("\nBeetleColorado constructor");
        print("k in BeetleColorado = " + k);
        print("j in BeetleColorado = " + j);
        print("BeetleColorado constructor\n");
    }

    private static int x3 =
            printInit("static BeetleColorado.x3 initialized");
    public static void show() {
        Insect.loading();
    }

}


/*
Exercise 24: (2) In Beetle.java, inherit a specific type of beetle from class Beetle,
following the same format as the existing classes. Trace and explain the output

* ANSWER for Trace and explain the output
Loading starting: 
-> 1 -> we initialize & and assign (if there is any ) value to  all static instance fields in super class & all subclasses

-> 2 -> we initialize all privet, protected or public fields and then constructor is activated  in super class Insect -> the same process in sub class Beetle -> the same process in sub class ColoradoBeetle

*
* */