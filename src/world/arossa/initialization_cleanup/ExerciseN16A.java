package world.arossa.initialization_cleanup;
import static world.arossa.helpers.Print.*;

import java.util.ArrayList;
import java.util.Random;

public class ExerciseN16A {

    String alfa = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String alfa_lower = alfa.toLowerCase();

    public ExerciseN16A (int arrayListSize) {
        ArrayList<String> arr = new ArrayList<>();

        this.showInfo(arr, arrayListSize);
    }

    private void showInfo(ArrayList<String> arr, int arrayListSize) {

        for (int i = 0; i < arrayListSize; i++) {
            Random r = new Random();
            int lengthForRandomString = r.nextInt(alfa.length());

            print("lengthForRandomString" + lengthForRandomString);

            String word = "";
            for (int j = 0; j < lengthForRandomString; j++) {

            word += j % 2 == 0 ?
                    alfa.charAt(r.nextInt(alfa.length()))
                    :
                    alfa_lower.charAt(r.nextInt(alfa.length()));

            }

            arr.add(word);
        }
        print(arr.toString());
    }
}
