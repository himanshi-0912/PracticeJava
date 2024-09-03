package Encapsulation;

public class example {
    public static void main(String[] args) {
        data obj=new data();
        System.out.println(obj.getA());
        obj.setA("automation tester");
        System.out.println(obj.getA());
    }
}
class data {
    String job = "engineer";

    public String getA() {
        return job;
    }

    public void setA(String job) {
        this.job = job;
    }
}

