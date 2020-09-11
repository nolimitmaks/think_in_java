package world.arossa.everything_is_an_object;

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
        System.out.println(ch);
        System.out.println(n1);
        System.out.println(b1);
        System.out.println(d1);
        System.out.println(by1);
        System.out.println(f1);
        System.out.println(sh1);
        System.out.println(l1);
    }
}
