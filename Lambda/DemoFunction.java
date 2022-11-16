import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DemoFunction {
    public static void main(String[] args) {
        //A Function interface is more of a generic one that takes one argument and produces a result

        Function<Integer, String> number = a -> "The result is "+ String.valueOf(a/2);
        System.out.println(number.apply(50));

        List<String> names = Arrays.asList("Smith", "Gourav", "Heather", "John", "Catania");
        Function<String, Integer> nameMappingFunction = String::length;

        List<Integer> nameLength = names.stream().map(nameMappingFunction).collect(Collectors.toList());
        System.out.println(nameLength);
    }
}
