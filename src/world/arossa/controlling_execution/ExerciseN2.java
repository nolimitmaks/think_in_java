package world.arossa.controlling_execution;
import java.util.ArrayList;
import java.util.Random;
import static world.arossa.helpers.Print.*;

public class ExerciseN2 {
    int range;
    int size;

    ArrayList<Integer> dataList = new ArrayList<Integer>();

    public ExerciseN2 (int range, int size) {
        this.range = range;
        this.size = size;

       this.showInfo();
    }

    private void showInfo () {

        Random r = new Random();

        // Generate a numbers within range
        for (int i = 0; i < size; i++) {
            dataList.add( (r.nextInt(range) + 1) );
        }
        print(dataList.toString());
        print(dataList.size());

//        just for fun reset ArrayList
        for (int i = 0; i < size; i++) {
            dataList.set(i, (r.nextInt(range) + 1) );
        }
        print(dataList.toString());
        print(dataList.size());

        this.checkData(dataList);
    }

    private void checkData (ArrayList<Integer> x) {
        String less = "Previous Less";
        String greater = "Previous greater";
        String equal = "Previous equal";

        for (int i = 0; i < x.size(); i++) {

            if(i != 0) {
                if(x.get(i - 1 ) > x.get(i )) {
                    print(greater);
                }
                else if (x.get(i - 1 ) < x.get(i)) {
                    print(less);
                }
                else {
                    print(equal);
                }
            }
        }
    }

}
