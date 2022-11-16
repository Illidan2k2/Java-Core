public class Queen extends Rook{
    @Override
    public void Rules() {
        System.out.println("Protect the King");
    }

    public static void main(String[] args) {
        Queen queen = new Queen();
        queen.name = "Queen";
        System.out.println(queen.name);
        queen.Rules();
    }
}
