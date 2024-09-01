package Inheritance.multiple_level;

public class elonmask implements twitter,whatsapp {

    public static void main(String[] args) {
        elonmask obj = new elonmask();
        obj.own();
        obj.own1();
        }
       public void own(){
           System.out.println("I have whatsapp and tweeter");
        }
        public void own1(){
            System.out.println("I have whatsapp and tweeter");
        }

}
