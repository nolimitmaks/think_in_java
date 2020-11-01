package world.arossa.polymorphism;
import static world.arossa.helpers.Print.*;

public class ShowUpcasting {
    private Unicycle unicycle;
    private Bicycle bicycle;
    private Tricycle tricycle;

    public ShowUpcasting () {
        unicycle = new Unicycle();
        bicycle = new Bicycle();
        tricycle = new Tricycle();


//        we use object extended from super class Cycle, use upcasting;
        this.ride(unicycle);
        this.ride(bicycle);
        this.ride(tricycle);
    }

    private void ride(Cycle cycle) {
        print(cycle);
        print("\n");
    }
}
