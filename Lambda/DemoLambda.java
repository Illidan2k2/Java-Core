import java.util.ArrayList;
import java.util.Scanner;

public class DemoLambda {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        names.add("Long");
        names.add("Hoang");
        names.add("Pham");

        final int[] i = {0};
        names.forEach(n -> {
            System.out.println("Index: "+ i[0] +" ;Name: "+n);
            i[0]++;
        });
    }
}
