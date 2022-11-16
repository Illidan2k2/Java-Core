package Override_static;

class A {
    public static void display() {
        System.out.println("Inside static method of superclass");
    }
}

class B extends A {
    public void show() {
        B.display();
    }

   /* public static void display() {
        System.out.println("Inside static method of this class");
    }*/
}
class Test {
    public static void main(String[] args) {
        B b = new B();
        // prints: Inside static method of this class
        //b.display();
        b.show();

        A a = new B();
        // prints: Inside static method of superclass
        a.display();
    }
}