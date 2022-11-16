package Static_class;

class Chess1 {
    private static int ID = 2;
    private String name = "Long";

    // Static nested class
    public static class Pawn{
        static void Move(String name){
            System.out.println(ID+" 1 step forward vertically");
        }
    }

    // Inner class
    public class Bishop{
        void Move(String n){
            System.out.println(ID+"  Move any number of squares diagonally");
        }
    }

    public static void main(String[] args) {
        Chess1 chess = new Chess1();
        Pawn pawn = new Pawn();
        Pawn.Move("Long");
        Chess1.Pawn.Move("Long");
        Chess1.Pawn pawn1 = new Chess1.Pawn();
        Chess1.Bishop bishop = new Chess1().new Bishop();
    }
}


