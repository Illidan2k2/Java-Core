public class Bishop {
    final void move(){
        System.out.println("Move diagonally!");
    }

    void check(){
        System.out.println("Check");
    }
}

class Pawn extends Bishop{
    final void move(String n){
        System.out.println(n+" move quickly");
    }

    void check(){
        System.out.println("Checkmate");
    }

    public static void main(String[] args) {

        Pawn m = new Pawn();

        Bishop n = new Pawn();

        m.move("You");
        m.move();
        n.move();

        n.check();
        m.check();


    }
}

