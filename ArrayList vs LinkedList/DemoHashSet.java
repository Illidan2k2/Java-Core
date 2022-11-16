import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class DemoHashSet {
    public static void main(String[] args) {
        // Sort by hashcode
        Set<Integer> foods = new HashSet<>();
        /*foods.add("Apple");
        foods.add("Banana");
        foods.add("Melon");
        foods.add("Grape");*/
        foods.add(3);
        foods.add(9);
        foods.add(5);
        foods.add(7);
        foods.add(2);
        foods.add(8);

        //foods.stream().forEach(System.out::println);
        System.out.println(foods);
    }
}
