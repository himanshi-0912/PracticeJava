package Typecasting;

public class classtype {
    public static void main(String[] args) {
        int a = 10;
        webdriver ref1 = new chromedriver(); //upcasting ---> sub class type to super class type
         ref1.get();

        chromedriver ref2 = (chromedriver)ref1; //downcasting ---> super class into sub
         ref2.get();
    }
}
 interface webdriver //super class----> WebDriver
 {
    public void get();
}
class chromedriver implements webdriver //sub class
{
    chromedriver(){
        System.out.println("lunch browser");
    }

    public void get(){
        System.out.println("i am a sub class");
    }
}
