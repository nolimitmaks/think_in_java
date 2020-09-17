package world.arossa.operators;

import world.arossa.helpers.Print;

import java.util.Random;

public class ExerciseN4 {

    public static double distance;
    public static double time;
    public static double velocity;

    public static void getVelocity(int sMin, int sMax, int tMin, int tMax) {

//        generate distance
        Random r = new Random();
        distance = Math.round( (sMin + (sMax-sMin) * r.nextDouble() ) * 100)/ 100.00;
        Print.s("\n"+distance + " -> distance in km\n");

//        generate time
        r = new Random();
        time = Math.round( tMin + (tMax-tMin) * r.nextDouble() );
        Print.s(time + " -> time in minutes\n");

//        find out km / hour
        velocity = distance / time * 60;
        Print.s(Math.round(velocity) + " -> km / H\n");

    }
}
