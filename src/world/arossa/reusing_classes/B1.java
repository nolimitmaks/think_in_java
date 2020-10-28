package world.arossa.reusing_classes;
import static world.arossa.helpers.Print.*;

public class B1 extends A1 {

    public B1 () {
        this.show();
        super.show(5);
        this.show("from super class");

        this.show('B');
        this.show(10);

    }

    private void show(char c) {
        print("B1 class method with char parameter -> " + c);
    }


    @Override
    protected void show(int n) {
        print("Override A1 class method in B1  with int parameter   n -> " + n);
    }

}
