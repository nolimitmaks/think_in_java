package world.arossa.reusing_classes;

import static world.arossa.helpers.Print.print;

public class Frog extends Amphibian {

    public void upcastToSuper(Frog f) {
        Amphibian.show(f);
        this.swim();
    }



}
