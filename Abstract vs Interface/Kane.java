public class Kane implements Referee{

    @Override
    public void Penalty() {
        System.out.println("Disqualified");
    }

    public static void Pin(){
        System.out.println("1 to 10! Out!");
    }

    public static void main(String[] args) {
        //Cannot be overridden
        Referee.Pin();
        Pin();
    }
}
