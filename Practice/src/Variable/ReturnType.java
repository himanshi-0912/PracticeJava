package Variable;

public class ReturnType {
    public static void main(String[] args){
        int r=10;
        double cr=circle(r);
        System.out.println("area of circle is " + cr);
    }
    private static double circle(int r){
        double cr=3.14*r*r;
        return cr;
    }
}


