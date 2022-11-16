package Static_variable;

public class DemoStatic {
    //Abstract method cannot be static
    //Cannot use this or super keyword for static
    //Static variable and method can be instantiated and inherited
    int ID = 5;
    static String name = "Long";

    // Independent on any object
    public static void Greet(){
        name = "Hoa";
        System.out.println("Hello "+name);
    }
    public void Bye(){
        System.out.println("Bye "+name);
    }

    public static void Perplex(){
        Greet("Hoang");
    }

    public static void Greet(String name){
        System.out.println("Hello "+name);
    }

    public static void main(String[] args) {
        new DemoStatic();
        System.out.println(name);
        Greet();
        Greet("Long");
    }

}
