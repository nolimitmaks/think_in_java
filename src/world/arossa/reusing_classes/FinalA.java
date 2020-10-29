package world.arossa.reusing_classes;
import static world.arossa.helpers.Print.*;

class Final {

    private static int count;
    private int id = count++;

    public String toString() {
        return "Final id -> " + id ;
    }

}


class ShowInfo {
    private static final Final sfFinal = new Final();
    private final Final fFinal = new Final();

    public String toString() {
        return "fFinal = " + fFinal + "\nsfFinal = " + sfFinal;
    }
}

public class FinalA {

    {
        print(new ShowInfo());
        print(new ShowInfo());
    }

}

