package Variable;

public class GlobalVariable {
    int num1 = 15;
    int num2 = 12;

    public static void main(String[] args) {
        GlobalVariable obj = new GlobalVariable();
       int a = obj.num1;
       int b = obj.num2;

        System.out.println("Addition of two numbers is " + obj.add(a, b));
    }

    private int add(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }
}