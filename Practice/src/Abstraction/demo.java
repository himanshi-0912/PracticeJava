package Abstraction;

import static Abstraction.demo.a;

public class demo {
     public static int a =10; // package or default

    public static void main(String[] args) {
        System.out.println(" the value of a is : "+ a);
    }
}
class demo1{
    public static void main(String[] args) {
        System.out.println(" the value of a is : "+ a);
    }
}
