package Variable;

public class NonStatic {
    public static void main(String[] args){
        int a=5;
        NonStatic obj = new NonStatic();    //static to non static
        System.out.println("area of square is" + obj.square(a));
    }
    private int square(int a){
        int sqr=a*a*a*a;
        return sqr;
    }
}


