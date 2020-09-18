package world.arossa.everything_is_an_object;
import static world.arossa.helpers.Print.*;

public class ExerciseN9 {
    char c = 'c';
    Character ch = new Character(c);

    int n = 1;
    Integer n1 = new Integer(n);

    boolean b = true;
    Boolean b1 = new Boolean(b);

    double d = 1.5;
    Double d1 = new Double(d);

    byte by = -128;
    Byte by1 = new Byte(by);

    float f =  	500.0f;
    Float f1 = new Float(f);

    short sh = -2^15;
    Short sh1 = new Short(sh);

    long l = 264-1;
    Long l1 = new Long(l);




    public void printInfo() {
        print(ch);
        print(n1);
        print(b1);
        print(d1);
        print(by1);
        print(f1);
        print(sh1);
        print(l1);
    }
}
