package world.arossa.polymorphism;

import static world.arossa.helpers.Print.print;

public class PolymorphTest extends Shape {

    @Override
    public void draw() {
        this.message();
        print("PolymorphTest.draw");
    }
    @Override
    public void erase() {
        print("PolymorphTest.erase()");
    }

    @Override
    protected void message() {
        print("message from super class PolymorphTest");
    }



}
