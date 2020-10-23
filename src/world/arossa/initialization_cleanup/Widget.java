package world.arossa.initialization_cleanup;
import static world.arossa.helpers.Print.print;

public class Widget {
    private String s = "Widjet Obj info from privet field";

    private Widget () {
        print(s);
    }

    private static Widget w = new Widget();

    public static Widget showInfo() {
        return w;
    }


}
