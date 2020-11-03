package world.arossa.polymorphism;
import static world.arossa.helpers.Print.*;



class Meal {
    Meal() { print("Meal()"); }
}
class Bread {
    Bread() { print("Bread()"); }
}
class Cheese {
    Cheese() { print("Cheese()"); }
}
class Pickle extends Meal {
    Pickle() {
        print("Pickle()");
    }
}
class Lettuce {
    Lettuce() { print("Lettuce()"); }
}
class Lunch extends Meal {
    Lunch() { print("Lunch()"); }
}
class PortableLunch extends Lunch {
    PortableLunch() { print("PortableLunch()");}
}



public class Sandwich extends PortableLunch  {
    private Bread b = new Bread();
    private Cheese c = new Cheese();
    private Lettuce l = new Lettuce();
    private Pickle p = new Pickle();
    public Sandwich() { print("Sandwich()"); }
}
