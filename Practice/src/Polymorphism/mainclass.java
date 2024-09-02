package Polymorphism;

public class mainclass {
    public static void main(String[] args) {
        dog ref1 = new dog();
        cat ref2 = new cat();
        stimulator.demo(ref1);
        stimulator.demo(ref2);
    }
}
class animal{
    void noise(){
        System.out.println("please make some noice");
    }
}
class dog extends animal{
   void noise(){
       System.out.println(" bow bbow");
   }
}
class cat extends animal{
    void noise(){
        System.out.println("mewow meow");
    }
}
class stimulator{
    static void demo( animal a){
       // animal a = new dog();
        a.noise();

    }
}

