import java.util.ArrayList;
import java.util.LinkedList;

class DemoMutable {
    public DemoMutable(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
}

class Main2{
    public static void main(String[] args) {
        DemoMutable example = new DemoMutable("Hello");
        System.out.println(example.getName());
        example.setName("World");
        System.out.println(example.getName());

        DemoMutable obj = new DemoMutable("Long");
        obj.setName("Hoang");
        System.out.println(obj.getName());
        zap(obj);
        System.out.println(obj.getName());

    }

    public static void zap(DemoMutable name) {
        name = new DemoMutable("X");
        name.setName("Dragon");
    }
}
