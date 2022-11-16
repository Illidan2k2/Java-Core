import java.util.HashMap;
import java.util.Map;

public class DemoMap {
    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>();
        students.put("Long",20);
        students.put("Hoang",26);
        students.put("Pham",30);
        System.out.println(students);

        students.put("Long",23);
        students.put("Long",40);
        students.put("",21);

        System.out.println(students);

        System.out.println(students.get("Long"));


    }
}
