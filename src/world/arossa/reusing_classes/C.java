package world.arossa.reusing_classes;

public class C extends A {

    public C ( int n, String s) {
        super(n, s);

        B b = new B(n,s);

    }
}
