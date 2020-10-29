package world.arossa.reusing_classes;

public class Frog extends Amphibian {

    public void upcastToSuper(Frog f) {
        Amphibian.show(f);
    }

}
