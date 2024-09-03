package Encapsulation;

public class Mainclass  {

    public static void main(String[] args) {
        himanshi ref = new himanshi();
        System.out.println(ref.getA());
        ref.setA(100);
        System.out.println(ref.getA());
    }

}
class himanshi{
    private int a = 10;

    public int getA(){
        return a;
    }
    public void setA(int a){
        this.a = a;
    }
}
//declare the data memeber as private and restrict the access outside of class
//and provide indirect access by using public services like gtters and setters ---> encapsulation