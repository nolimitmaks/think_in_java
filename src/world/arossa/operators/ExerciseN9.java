package world.arossa.operators;
import static world.arossa.helpers.Print.*;

public class ExerciseN9 {
    float fMax;
    float fMin;
    double dMax;
    double dMin;

    public ExerciseN9 (float fMax, float fMin, double dMax, double dMin) {
        this.fMax = fMax;
        this.fMin = fMin;
        this.dMax = dMax;
        this.dMin = dMin;

        this.showData();
    }
    private void showData () {
        print(fMax);
        print(fMin);
        print(dMax);
        print(dMin);
    }
}
