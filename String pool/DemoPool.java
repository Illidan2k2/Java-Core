public class DemoPool {
    public static void change(StringBuilder s){
        s.append(" Hoang");
        System.out.println(s);
    }

    public static void main(String[] args) {
        String s1 = new String("Long");

        StringBuffer s2 = new StringBuffer("Long");
        StringBuilder s3 = new StringBuilder("Long");

        change(s3);
        System.out.println(s3);
    }
}
