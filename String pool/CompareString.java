import java.util.Collections;
import java.util.LinkedList;

public class CompareString {
    public static void main(String[] args) {

        // Check if there is any object values "Hello" in the string pool or not
        // If no object values "Hello" then create a new "Hello" object in the string pool
        String a1 = "Hello";

        // If there is already an object values "Hello" in the string pool
        // Then assign (point) the value of a2 to a1 as "Hello" instead of creating new object values "Hello"
        String a2 = "Hello";

        //Create a new "Hello" object in the heap memory
        String a3 = new String("Hello");
        System.out.println(a1.hashCode());
        System.out.println(a3.hashCode());

        //Compare the address (identity) of a1 and a2
        System.out.println(a1==a2);

        //Compare the value of a1 and a2
        System.out.println(a1.equals(a2));

        //a1 address is in the string pool while a3 address is in the heap memory
        System.out.println(a1==a3);

        //Compare the value of a1 and a3
        System.out.println(a1.equals(a3));

        // Create a new object in the memory heap values "Hello World"
        // The original object values "Hello" is still in the pool and cannot be changed
        // String is immutable

        a1 = a1 + " World";
        String a0 = "Hello World";

        // Create a new object values "Hello World" in the memory heap
        // The object values "Hello" in the heap is still immutable
        // Address is immutable

        a3 = a3 + " World";

        System.out.println(a1==a0);
        System.out.println(a1==a3);

        LinkedList<Integer> list = new LinkedList<>();

        Collections.addAll(list,1,4,6,2,8,10);

        list.remove(0);
        System.out.println(list.indexOf(4));

    }
}
