package world.arossa.initialization_cleanup;
import java.util.Arrays;

import static world.arossa.helpers.Print.*;

public class ExerciseN16 {
    String[] s = new String[5];

    public ExerciseN16 (String s1, String s2, String s3, String s4, String s5) {
        s[0] = s1;
        s[1] = s2;
        s[2] = s3;
        s[3] = s4;
        s[4] = s5;
        print(Arrays.toString(s));

        this.showInfo(s);
    }

    private void showInfo(String[] x) {
        for (int i = 0; i < x.length; i++) {
            print(x[i]);
        }
    }


}

