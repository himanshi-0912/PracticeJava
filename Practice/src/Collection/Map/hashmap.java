package Collection.Map;

import java.util.HashMap;
import java.util.Map;

public class hashmap {
    public static void main(String[] args) {
        Map<Integer,String> obj = new HashMap<>();
        //create
        obj.put(null,null);
        obj.put(2,null);

        //read
        System.out.println(obj);
        System.out.println(obj.get(2));

        //update
        obj.put(1,"Himanshi");
        System.out.println(obj);

        //remove
//        obj.remove(2);
//        System.out.println(obj);

    }
}
