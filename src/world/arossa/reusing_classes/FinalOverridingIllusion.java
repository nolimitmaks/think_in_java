package world.arossa.reusing_classes;
import static world.arossa.helpers.Print.*;

class WithFinals {
    // Identical to "private" alone:
    private final void f() { print("WithFinals.f()"); }
    // Also automatically "final":
    private void g() { print("WithFinals.g()"); }
}

class OverridingPrivate extends WithFinals {

//    @Override -> will do nothing. we cant override privet method in super class.
//    here we just have method with the same name. so @Override anotation will do nothing
    private final void f() {
        print("not OverridingPrivate.f()");
    }
    private void g() {
        print("not OverridingPrivate.g()");
    }
}

public class FinalOverridingIllusion extends OverridingPrivate {
//    @Override -> do nothing / forbidden here
    public final void f() {
        print("not OverridingPrivate2.f()");
    }
//    @Override -> do nothing / forbidden here
    public void g() {
        print("not OverridingPrivate2.g()");
    }
}
