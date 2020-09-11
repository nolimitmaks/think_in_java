package world.arossa.everything_is_an_object;

public class ExerciseN4 {
    int i;
    double d;
    boolean b;

    public ExerciseN4 (int n, double duo, boolean bool ) {
        this.i = n;
        this.d = duo;
        this.b = bool;

    }

    public void showInfo(ExerciseN4 data) {
        System.out.println(data.i);
        System.out.println(data.b);
        System.out.println(data.d);
    }
}
