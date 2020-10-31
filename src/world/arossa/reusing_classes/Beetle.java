package world.arossa.reusing_classes;
import static world.arossa.helpers.Print.*;

class Insect {
    private int i = 9;
    protected int j;
    Insect() {
        print("i = " + i + ", j = " + j);
        j = 39;
        print("Insect constructor");
    }
    private static int x1 =
            printInit("static Insect.x1 initialized");

    static int printInit(String s) {
        print(s);
        return 47;
    }

    protected static void loading() {
        print("loading\n");
    }
}




public class Beetle extends Insect {
    private int k = printInit("Beetle.k initialized");
    public Beetle() {
        print("k = " + k);
        print("j = " + j);
        print("Beetle constructor");
    }

    private static int x2 =
            printInit("static Beetle.x2 initialized");

    public static void show() {
        Insect.loading();
        new Insect();
    }

}
