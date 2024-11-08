package Collection.List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class vectorlist {
    public static void main(String[] args) {
        ArrayList obj = new ArrayList();
        obj.add(10);
        obj.add(15);

        System.out.println(obj);                   //read data
        System.out.println(obj.get(0));           //read specific data

        obj.set(0, 12);                          //update the data
        System.out.println(obj);

        obj.remove(0);
        System.out.println(obj);                //delete specific data
    }
}
