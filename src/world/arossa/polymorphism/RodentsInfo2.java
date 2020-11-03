package world.arossa.polymorphism;
import java.util.Arrays;
import java.util.Random;

import static world.arossa.helpers.Print.*;

class Rodent2 {
    protected static int count = 0;
    Rodent2() {
    }
    Rodent2(String s) {
        print("Object From " + s);
    }
    protected void food() {
        print("food for " + this.getClass().getSimpleName());
    }
}

class Mouse2 extends Rodent2 {
    Mouse2() {
        String s = "Mouse2";
        Rodent2 r1 = new Rodent2(s);
        Rodent2 r2 = new Rodent2(s);
    }

    @Override
    protected void food() {
        print("food for " + this.getClass().getSimpleName());
    }
}

class Gerbil2 extends Mouse2 {
    Gerbil2 () {
        String s = "Gerbil2";
        Rodent2 r1 = new Rodent2(s);
        Rodent2 r2 = new Rodent2(s);
    }

    @Override
    protected void food() {
        print("food for " + this.getClass().getSimpleName());
    }
}


class Hamster2 extends Gerbil2 {
    Hamster2 () {
        String s = "Hamster2";
        Rodent2 r1 = new Rodent2(s);
        Rodent2 r2 = new Rodent2(s);
    }

    @Override
    protected void food() {
        print("food from Hamster class for " + this.getClass().getSimpleName());
    }


}

class X2 extends Hamster2 {
    String s = this.getClass().getSimpleName();
    Rodent2 r1 = new Rodent2(s);
    Rodent2 r2 = new Rodent2(s);

    @Override
    protected void food() {
        print("food for " + this.getClass().getSimpleName());
    }
}




public class RodentsInfo2 {
    private Rodent2[] rodents = new Rodent2[10];
    private Random r = new Random();

    public RodentsInfo2() {
        new Hamster2();
//        this.GetRandomRodents();
    }

    private Rodent2 next() {
        int n = r.nextInt(3);
        print(n);
        switch (n) {
            default:
            case 0: return new Gerbil2();
            case 1: return new Mouse2();
            case 2: return new Hamster2();
        }
    }

    private void GetRandomRodents () {
        for (int i = 0; i < rodents.length; i++) {
            rodents[i] = next();
        }
        for (Rodent2 rodent : rodents
        ) {
            rodent.food();
        }
    }

    private void printInfo(Rodent2[] rodents) {

    }
}
