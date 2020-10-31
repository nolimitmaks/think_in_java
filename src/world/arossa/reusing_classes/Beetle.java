package world.arossa.reusing_classes;
import static world.arossa.helpers.Print.*;

class Insect {
    private int i = 9;
    protected int j;

    {
        print(j);
    }

    Insect() {
        print("\nInsect constructor");
        print("i from Insect = " + i + ", j = " + j);
        j = 39;
        print("Insect constructor\n");
    }
    private static int x1 =
            printInit("static Insect.x1 initialized");

    static int printInit(String s) {
        print(s);
        return 47;
    }

    static int printInit(int n) {
        print(n);
        return n;
    }

    protected static void loading() {
        print("loading\n");
    }
}




public class Beetle extends Insect {
    private int n = 1234;
    {
        print("\n"+ n);
    }
    private int k =
            printInit("Beetle.k initialized");
    public Beetle() {
        print("\nBeetle constructor");
        print("k in Beetle = " + k);
        print("j in Beetle = " + j);
        print("Beetle constructor\n");
    }

    private static int x2 =
            printInit("static Beetle.x2 initialized");

    public static void show() {
        Insect.loading();
    }

}