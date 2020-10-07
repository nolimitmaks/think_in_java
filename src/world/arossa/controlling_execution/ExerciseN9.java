package world.arossa.controlling_execution;
import java.util.ArrayList;

import static world.arossa.helpers.Print.*;

public class ExerciseN9 {
    int fibo;

    ArrayList<Integer> intArr = new ArrayList<>();

public ExerciseN9 (int fibo) {
    this.fibo = fibo;
    this.intArr.add(1);
    this.intArr.add(1);


    this.showInfo();
}

private void showInfo() {

    for (int i = 0; i < fibo; i++) {

        if(i < 2) {
            print(this.intArr.get(i));
        }
        else if(i >= 2){
            this.intArr.add(
                    this.intArr.get(i - 1) + this.intArr.get(i - 2)
            );

            print(this.intArr.get(i));
        }
    }
}

}
