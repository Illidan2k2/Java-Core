package Static_block;

import java.util.ArrayList;

public class StaticBlock {
    static ArrayList<String> games = new ArrayList<>();

    static {
        games.add("Minecraft");
        games.add("Starcraft");
        games.add("Warcraft");
        games.stream().map(letter -> letter+" Java").forEach(System.out::println);
        System.out.println(games);
    }

    class Block{
        void talk(){
            System.out.println("World");
        }
    }
    static class Non_Block{
        void sound(){
            System.out.println("Hello");
        }
    }


}

class Test{
    public static void main(String[] args) {
        StaticBlock.Non_Block a = new StaticBlock.Non_Block();
        a.sound();
    }
}
