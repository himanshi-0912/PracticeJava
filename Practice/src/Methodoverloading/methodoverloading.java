package Methodoverloading;

public class methodoverloading {
        public  void data(int num){
            System.out.println("number " + num);
        }
        public  void data(String msg){
            System.out.println("message " + msg);
        }
        public  void data(int num, String msg){
            System.out.println("number and message" + num + msg);
        }
        public  void data(String msg, int num){
            System.out.println("message and number " + msg +num);
        }
        public static void main(String[] args){
            methodoverloading ref = new methodoverloading();
            ref.data(123);
            ref.data("hello");
            ref.data(123, "hi");
            ref.data("ni hao", 123);
        }
    }

