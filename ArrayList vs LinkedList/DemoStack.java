import java.util.Collections;
import java.util.Stack;

public class DemoStack {
   // LIFO

    public static void main(String[] args) {
        Stack<String> games = new Stack<>();
        games.push("Minecraft");
        games.push("Age of Empires");
        games.push("Feeding Frenzy");
        games.push("");
        games.push("World of Warcraft");

        // Stack from top to bottom
        System.out.println(games);

        // Get the top element of the stack
        System.out.println(games.peek());

        games.pop();
        System.out.println(games);
        System.out.println(games.peek());

        boolean n = Collections.addAll(games,"Starcraft");
        System.out.println(n);
        System.out.println(games);

        games.clear();
        System.out.println(games);
    }
}
