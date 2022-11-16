public class DemoString {
    public static void main(String[] args) {
       String s1 = "example";
       String s2 = "example";

       System.out.println(s1==s2);

       String s3 = new String("example");

       System.out.println(s3==s2);

       String s4 = new String("example");

       System.out.println(s4==s3);

       // create a copy
       String s5 = s4.intern();

       System.out.println(s5);

    }

}
