import java.util.HashMap;
import java.util.Random;

public class DemoHashMap {
    static Random random = new Random();

    public static void main(String[] args) {
        // Sorted by key
        HashMap<Integer, String> employees = new HashMap<>();
        employees.put(1, "Roman");
        employees.put(2, "Karl");
        employees.put(7, "");
        employees.put(null, null);
        employees.put(8, "Jason");

        // Null key elements will be put to the head
        employees.put(null, "Jason");
        employees.put(4, "Long");
        employees.put(3, null);
        employees.put(6, "Dragonfly");
        employees.put(null,"Java");

        System.out.println(employees);
        System.out.println(employees.size());

    }
}
