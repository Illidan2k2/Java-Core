package Pass_by_value;
// Make a copy
// Primitive
public class Main {
    public static void modify(int x, int y) {
        x = 100;
        y = 200;
        System.out.println("X - Y from modify: " + x + " - " + y);
    }
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        System.out.println("X - Y before modify: " + x + " - " + y);

        modify(x, y);
        System.out.println("X - Y after modify: " + x + " - " + y);
    }
}
