package Abstraction;

public class example {
    public static void main(String[] args) {
        data obj = new data();
        obj.age();
        obj.job();
    }
}
    interface himanshi{
        void job();
        void age();
    }

    class data implements himanshi{
        @Override
        public void age() {
            System.out.println("My age is 27");
        }

        @Override
        public void job() {
            System.out.println("i am an engineer");
        }
    }

