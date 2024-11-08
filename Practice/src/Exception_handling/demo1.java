package Exception_handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class demo1 {
    public static void main(String[] args) {

      /*  File file = new File("C:\\Personal\\himanshi.txt");//specify the path of file
        FileReader fr = new FileReader(file); // FileNotFoundException
        System.out.println(fr);*/
/*try {
    String str = null;

    System.out.println( str.length());
}
       catch(Exception e) {
            System.out.println(e.getMessage()); // null pointer exception
        }*/
try {
    int[] a = {1, 2, 3};
    System.out.println(a[5]);
}
          catch(Exception e) {
            System.out.println(e.getMessage()); //ArrayIndexoutofBoundException
        }

    }
}
//compile error /exception