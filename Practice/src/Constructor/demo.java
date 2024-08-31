package Constructor;

public class demo {
    String name;
    public demo(String name){
        this.name=name;
    }

    public static void main(String[] args) {
        demo obj = new demo("himanshi");
        System.out.println(obj.name);
    }
}

