package world.arossa.polymorphism;
import java.util.Arrays;
import java.util.Random;

import static world.arossa.helpers.Print.*;

class Rodent {
    protected void food() {
        print("food for " + this.getClass().getSimpleName());
    }
}

class Mouse extends Rodent {
    @Override
    protected void food() {
        print("food for " + this.getClass().getSimpleName());
    }
}

class Gerbil extends Rodent {
    @Override
    protected void food() {
        print("food for " + this.getClass().getSimpleName());
    }
}


class Hamster extends Rodent {
    @Override
    protected void food() {
        print("food from Hamster class for " + this.getClass().getSimpleName());
    }


}

class X extends Hamster {
    @Override
    protected void food() {
        print("food for " + this.getClass().getSimpleName());
    }
}

public class RodentsInfo {
    private Rodent[] rodents = new Rodent[10];
    private Random r = new Random();

    public RodentsInfo() {
        this.GetRandomRodents();
    }

    private Rodent next() {
        int n = r.nextInt(3);
        print(n);
        switch (n) {
            default:
            case 0: return new Gerbil();
            case 1: return new Mouse();
            case 2: return new Hamster();
        }
    }

    private void GetRandomRodents () {
        for (int i = 0; i < rodents.length; i++) {
            rodents[i] = next();
        }
        for (Rodent rodent : rodents
             ) {
            rodent.food();
        }
    }

    private void printInfo(Rodent[] rodents) {

    }
}

