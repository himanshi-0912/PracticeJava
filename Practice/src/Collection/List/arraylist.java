package Collection.List;

import java.util.ArrayList;
import java.util.List;

public class arraylist {
    public static void main(String[] args) {
        //Vector, priorityqueue , set
        List<Integer> ref = new ArrayList<>();
        //created data
        ref.add(3);
        ref.add(3);

        //read the data
        System.out.println(ref);
        System.out.println(ref.get(0)+ref.get(0));

        //update
        /*ref.set(1,"test engineer");*/
        System.out.println(ref);

        //delete
        ref.remove(0);
        System.out.println(ref);

    }
}
