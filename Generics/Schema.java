import java.util.ArrayList;
import java.util.List;

public class Schema {
    // wildcard <?>
    public static void PrintList(List<?> list){
        System.out.println(list);
    }

    public static void main(String[] args) {
        List<String> games = new ArrayList<>();
        games.add("Minecraft");
        games.add("Warcraft");
        games.add("Starcraft");

        PrintList(games);
    }
}
