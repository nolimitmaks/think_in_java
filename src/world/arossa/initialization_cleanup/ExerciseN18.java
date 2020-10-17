package world.arossa.initialization_cleanup;

import java.util.Arrays;

import static world.arossa.helpers.Print.print;

public class ExerciseN18 {

    public ExerciseN18 () {
        this.showInfo();
    }

    private void showInfo() {

        ExerciseN17[] arr = new ExerciseN17[4];
        arr[0] = new ExerciseN17("a");
        arr[1] = new ExerciseN17("b");
        arr[2] = new ExerciseN17("c");
        arr[3] = new ExerciseN17("d");
        print(Arrays.toString(arr));

        arr[1].show();

    }
}
