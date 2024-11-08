package Rough;

public class demo1 {
    private int a=2;//10
    public int himanshi(){
        return a;
    }
    public void hussain(int b) //int b = 10; , a = b, a =10
    {
        this.a=b;
    }

    public static void main(String[] args){
        demo1 obj=new demo1();
        System.out.println( obj.himanshi());
        obj.hussain(10);
        System.out.println( obj.himanshi());


    }
}
