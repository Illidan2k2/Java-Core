public class Ex3 {
    public void change(String p1, String p2){
        p1 = p2;
        p1 = "3";
        System.out.println(p1);
        System.out.println(p2);
    }

    public static void main(String[] args) {
        Ex3 ex = new Ex3();
        String p1 = new String("2");
        String p2 = new String("4") ;
        ex.change(p1,p2);
        System.out.println(p1);
        System.out.println(p2);
    }
}
