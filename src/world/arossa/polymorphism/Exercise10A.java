package world.arossa.polymorphism;

import static world.arossa.helpers.Print.print;

public class Exercise10A extends Exercise10 {
    public Exercise10A () {

    }
    @Override
    protected void b () {
        print("Override b");
    }

    public void show() {
        Exercise10[] arr = new Exercise10[2];

        arr[0] = new Exercise10A();
        arr[1] = new Exercise10A();

        for (int i = 0; i < arr.length; i++) {
            arr[i].a();
        }
    }
}
