package world.arossa.controlling_execution;
import java.util.ArrayList;
import java.util.Random;
import static world.arossa.helpers.Print.*;


public class ExerciseN4 {
    int range;
    int size;

    ArrayList<Integer> dataList = new ArrayList<>();
    ArrayList<ArrayList> arr = new ArrayList<>();

   public ExerciseN4 (int range, int size) {
       this.range = range;
       this.size = size;

       this.createData();
   }

    private void createData () {

        Random r = new Random();

        for (int j = 0; j < size; j++) {
            dataList.clear();

            int size_new = r.nextInt(size)+ 1;
//            check if we not reached limit of our arrayList max index
            while (size_new > size) {
                size_new = r.nextInt(range) + 1;
            }
            print(size_new);
            
            // Generate a numbers within range
            for (int i = 0; i < size_new; i++) {
                dataList.add( (r.nextInt(range) + 1) );
            }

//        just for fun reset ArrayList
            for (int i = 0; i < size_new; i++) {
                dataList.set(i, (r.nextInt(range) + 1) );
            }
            
            print(dataList.toString());

//          reset reference to dataList
            ArrayList<Integer> x = new ArrayList<>();
            for (int i = 0; i < dataList.size(); i++) {
                x.add(dataList.get(i));
            }
            arr.add(x);

            for (int i = 0; i < dataList.size(); i++) {
                dataList.remove(i);
            }
//          or use this one?
            dataList.clear();
        }

        print(arr.toString());

        this.showIndo(arr);
    }

    private void showIndo(ArrayList<ArrayList> x) {

        for (int i = 0; i < x.size(); i++) {

            for (int j = 0; j < x.get(i).size(); j++) {

                int n = (Integer) x.get(i).get(j);
                if( n % 2 != 0 )  print(n);

            }
        }
    }
}
