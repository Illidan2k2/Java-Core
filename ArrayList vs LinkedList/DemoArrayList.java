import java.util.ArrayList;
import java.util.List;

public class DemoArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(4);
        list.add(10);
        list.add(10);
        list.add(200);

        System.out.println("Current elements in the list: "+list);
        list.remove(2);

        System.out.println("Current elements in the list: "+list);

        System.out.println(list.get(2));
        System.out.println(list.contains(10));
        System.out.println(list.contains(5));

        list.hashCode();

    }
}
