package Static_block;

import java.util.LinkedList;
import java.util.List;

public class DemoBlock2 {
    public static List<String> ranks = new LinkedList<>();

    static {
        System.out.println("List of ranks: ");
        ranks.add("Lieutenant");
        ranks.add("Captain");
        ranks.add("Major");
    }

    static {
        System.out.println("List of titles:");
        ranks.add("Colonel");
        ranks.add("General");
    }

    public static void main(String[] args) {
        System.out.println("Server is running");
    }

}
