package Static_block;

public class DemoBlock {
    static int age = 20;

    static {
        int ID = 0;
        String name = "Long";
        System.out.println("ID: "+ID+" ;Name: "+name+" ;Age: "+age);
    }

    static {
        String name = "Jerry";
        System.out.println(name);
    };

    public static void main(String[] args) {
        new DemoBlock(); // Auto print all static blocks
        System.out.println(DemoBlock.age);

    }
}
