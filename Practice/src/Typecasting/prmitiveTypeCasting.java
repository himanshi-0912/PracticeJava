package Typecasting;

public class prmitiveTypeCasting {
    public static void main(String[] args) {
        //narrowing
        double a =4.3 ;
        int b =(int)a;

        //widening
        int c = 4;
        double d = c;
        System.out.println("--------narrowing------------------------");
        System.out.println(a);
        System.out.println(b);
        System.out.println("--------widening------------------------");
        System.out.println(c);
        System.out.println(d);
    }
}
