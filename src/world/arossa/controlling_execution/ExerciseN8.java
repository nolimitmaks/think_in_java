package world.arossa.controlling_execution;
import java.util.ArrayList;

import static world.arossa.helpers.Print.*;


public class ExerciseN8 {
    ArrayList<String> arr = new ArrayList<>();


    public ExerciseN8 () {

        arr.add("sunny");
        arr.add("windy");
        arr.add("rainy");
        arr.add("snowy");

        this.showInfo(arr);
    }

    private void showInfo(ArrayList<String> x) {
        for (int i = 0; i < x.size(); i++) {

            switch (x.get(i)) {
                case "sunny":
                    print("Take tesla roadster for a ride");
                    break;
                case "windy":
                    print("Take tesla model x for a ride");
                    break;
                case "rainy":
                    print("Take ford mustang for a ride");
                    break;
                case "snowy":
                    print("Take hummer for a ride");
                    break;
            }
        }
    }

}
