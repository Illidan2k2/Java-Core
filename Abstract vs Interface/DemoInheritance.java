import java.util.ArrayList;

public class DemoInheritance {
    void show(){
        System.out.println("Hello");
    }
}

class MyDemo extends DemoInheritance{
    @Override
    void show(){
        System.out.println("Hello World");
    }
}

class YourDemo extends DemoInheritance{
    @Override
    void show(){
        System.out.println("Goodbye");
    }
}

class Implementation{
    public static void main(String[] args) {
        ArrayList<DemoInheritance> n = new ArrayList<>();
        MyDemo a = new MyDemo();
        YourDemo b = new YourDemo();
        a.show();
        n.add(a);
        n.add(b);
    }
}
