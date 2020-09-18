package world.arossa.operators;

import static world.arossa.helpers.Print.*;

import java.util.Random;

public class ExerciseN4 {

    private double distance;
    private double time;
    private double velocity;

    private int sMin;
    private int sMax;
    private int tMin;
    private int tMax;

    public ExerciseN4 (int sMin, int sMax, int tMin, int tMax) {
        this.sMin = sMin;
        this.sMax = sMax;
        this.tMin = tMin;
        this.tMax = tMax;

        this.getVelocity();
    }

    final void getVelocity() {
        Random r = new Random();
        distance = Math.round( (sMin + (sMax-sMin) * r.nextDouble() ) * 100)/ 100.00;
        print("\n"+distance + " -> distance in km\n");

        r = new Random();
        time = Math.round( tMin + (tMax-tMin) * r.nextDouble() );
        print(time + " -> time in minutes\n");

        velocity = distance / time * 60;
        print(Math.round(velocity) + " -> km / H\n");

    }
}
