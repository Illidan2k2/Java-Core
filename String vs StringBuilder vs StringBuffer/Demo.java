public class Demo {
    public static void ConcatString(String s1){
        s1 = s1 + " World";
    }
    public static void ConcatStringBuilder(StringBuilder s2){
        s2.append(" World");
    }

    public static void ConcatStringBuffer(StringBuffer s3){
        s3.append(" World");
    }

    public static void main(String[] args) {
        //Literal
        String s1 = new String("Hello");
        ConcatString(s1);
        //s1 is not changed
        System.out.println("String: "+s1);

        StringBuilder s2 = new StringBuilder("Hello");
        ConcatStringBuilder(s2);
        //s2 is changed
        System.out.println("String builder: "+s2);

        StringBuffer s3 = new StringBuffer("Hello");
        ConcatStringBuffer(s3);
        //s3 is changed
        System.out.println("String buffer: "+s3);
    }
}
