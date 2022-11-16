import java.util.LinkedList;
import java.util.Queue;

public class DemoQueue {
    //FIFO

    // Queue does not accept null element
    // Allow same elements
    public static void main(String[] args) {
        Queue<String> movies = new LinkedList<>();

        movies.add("Avengers");
        movies.add("Dead Silence");
        movies.add("Avatar");
        movies.add("");
        movies.add("The Revenant");

        System.out.println(movies);
        movies.remove();
        System.out.println(movies);

        // Retrieve but not remove
        System.out.println(movies.peek());

        // Retrieve and remove
        System.out.println(movies.poll());

        System.out.println(movies.peek());

        movies.removeIf(String::isEmpty);
        System.out.println(movies);

    }
}
