package world.arossa.access_control;
import java.util.Random;

import static world.arossa.helpers.Print.*;


class Connection {
    private static int n = 0;
    private int obj_number = n++;

    Connection () {
    }

    public String toString() {
        return "obj Connection # " + obj_number;
    }
}

public class ConnectionManager {
    private static int arr_length;
    private static int new_random;

    static {
        arr_length = set_arr_length();
    }

    private static Connection[] arr = new Connection[arr_length];
    private static int c = 0;

    static {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Connection();

        }
    }

    public ConnectionManager() {

    }

    public static Connection getData () {

        if(c < arr.length)
            return arr[c++];

        return null;

    }

    public static void  printInfo() {
        Connection x = ConnectionManager.getData();

        while (x != null) {
            System.out.println(x);
            x = ConnectionManager.getData();
        }

    }

    private static int set_arr_length() {
        Random r = new Random();

        new_random = r.nextInt(10);
        while (new_random == 0)
            new_random = r.nextInt(10);

        print("\nnew_random is -> " + new_random + "\n");
        return new_random;
    }
}