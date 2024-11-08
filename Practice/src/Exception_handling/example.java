package Exception_handling;

public class example {
    public static void main(String[] args) {
        try{
            String name="himanshi";
        }
        catch (ArithmeticException a){
            System.out.println(a);
        }
        System.out.println("correct");
    }
}

