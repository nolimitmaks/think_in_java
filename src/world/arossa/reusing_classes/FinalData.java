package world.arossa.reusing_classes;
import static world.arossa.helpers.Print.*;

class FinalDataA {
    public FinalDataA () {
        print("Object is final");
    }
}

public class FinalData {
    private final int n;
    private final FinalDataA obj;

    public FinalData () {
        n = 1;
        obj = new FinalDataA();

//        beacouse of final we have error variable n might already have been assigned
//        n = 5;
//        same is here variable obj might already have been assigned / obj is final we cant change it once it have been assigned with value
//        obj = new FinalDataA();

    }
}
