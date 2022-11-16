import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

// Consumer is a functional interface that accepts a single input and returns no output
public class DemoConsumer {
    public static void main(String[] args) {
        LongConsumer consumer = n -> System.out.println(n+20000000000000L);
        consumer.accept(30000000000000L);

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"Long","Hoang","Pham");
        list.forEach(System.out::println);
    }
}

