package Methodoverloading;

public class methodoverloading {
        public static void data(int num){
            System.out.println("number " + num);
        }
        public static void data(String msg){
            System.out.println("message " + msg);
        }
        public static void data(int num, String msg){
            System.out.println("number and message" + num + msg);
        }
        public static void data(String msg, int num){
            System.out.println("message and number " + msg +num);
        }
        public static void main(String[] args){
            methodoverloading.data(123);
            methodoverloading.data("hello");
            methodoverloading.data(123, "hi");
            methodoverloading.data("ni hao", 123);
        }
    }

