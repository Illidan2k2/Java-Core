public class Chess {
    // Stop change value
    // Stop override
    // Stop inheritance
    public void Rules(){
        System.out.println("Checkmate to win");
    }

    public final void Moves(){
        System.out.println("Move to win");
    }

    final int ID = 100;
    String name = "Long";

    public static void main(String[] args) {
        Chess chess = new Chess();
        chess.name = "Hoa";
        System.out.println(chess.name);
    }
}
