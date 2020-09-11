package world.arossa.everything_is_an_object;

public class ExerciseN6 {
    String s = "Hello Java";

    public int storage(String s) {
        return s.length() + 2;
    }

    public void printInfo() {
        System.out.println("storage is " + storage(s));
    }
}
