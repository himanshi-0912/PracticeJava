package Abstraction;



public class mainclass {
    public static void main(String[] args) {

        showroom ref = new showroom();
        ref.accelerator();
        ref.engine();
    }
}
abstract class BMW{
   abstract  void engine();
    abstract void accelerator();

    void add(){
        System.out.println("test");
    }
}
class showroom extends BMW{

    @Override
    public void engine() {
        System.out.println("this is robust engine");
    }

    @Override
    public void accelerator() {
        System.out.println(" 1000kmpls");
    }
}
//declare essential properties either interface or bstract class and provide the implementation to the sub class

