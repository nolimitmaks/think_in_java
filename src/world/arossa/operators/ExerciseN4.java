package world.arossa.operators;

import world.arossa.helpers.Print;

import java.util.Random;

public class ExerciseN4 {

    public double distance;
    public double time;
    public double velocity;

    public int sMin;
    public int sMax;
    public int tMin;
    public int tMax;

    public ExerciseN4 (int sMin, int sMax, int tMin, int tMax) {
        this.sMin = sMin;
        this.sMax = sMax;
        this.tMin = tMin;
        this.tMax = tMax;

        this.getVelocity();
    }
    public void getVelocity() {

        Random r = new Random();
        distance = Math.round( (sMin + (sMax-sMin) * r.nextDouble() ) * 100)/ 100.00;
        Print.s("\n"+distance + " -> distance in km\n");

        r = new Random();
        time = Math.round( tMin + (tMax-tMin) * r.nextDouble() );
        Print.s(time + " -> time in minutes\n");

        velocity = distance / time * 60;
        Print.s(Math.round(velocity) + " -> km / H\n");

    }
}
