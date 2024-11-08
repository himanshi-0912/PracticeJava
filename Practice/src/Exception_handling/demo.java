package Exception_handling;

public class demo
{
    public static void main(String[] args)
    {

        System.out.println("Before it catch the exception");
        System.out.println("Before it catch the exception");
        System.out.println("Before it catch the exception");
        System.out.println("Before it catch the exception");
        try {
             int a = 1 / 0;
        }catch(Exception e){

            //System.out.println(e.getMessage());
            e.printStackTrace();

            //Exception e = new ArchthmeticException();
        }

        System.out.println("After it catch the exception");
        System.out.println("After it catch the exception");
        System.out.println("After it catch the exception");
        System.out.println("After it catch the exception");


    }
}
