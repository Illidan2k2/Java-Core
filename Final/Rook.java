public class Rook extends Chess{
    @Override
    public void Rules() {
        System.out.println("Checkmate is not where the game end");
    }

    public static void main(String[] args) {
        Rook rook = new Rook();
        rook.name = "Rookie";
        System.out.println(rook.name);
        rook.Rules();
    }
}

