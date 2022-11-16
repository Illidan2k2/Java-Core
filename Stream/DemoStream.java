import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DemoStream {
    //Stream là đại diện cho mỗi chuỗi các đối tượng từ một nguồn, hỗ trợ các hoạt động tổng hợp.

    public static void main(String[] args) {
        String[] names = {"Long","Hoa","Hoa","David","John Doe","Jane Doe","Long"};

        // Filter
        List<String> list = Arrays.stream(names).filter(s->s.length()>4).collect(Collectors.toList());
        System.out.println(list);

        // Map
        List<Integer> numbers = Arrays.asList(1,3,8,44,99,24,67,5,7);
        System.out.println(numbers.stream().map(x->x*2).collect(Collectors.toList()));

        // Collect
        String[] titles = {"Baron","Viscount","Duke","King","Earl"};
        System.out.println(Arrays.stream(titles).map(String::toUpperCase).collect(Collectors.toList()));

        // Reduce
        ArrayList<Integer> dices = new ArrayList<>();
        Collections.addAll(dices,1,2,3,4,5,6);
        System.out.println(dices.stream().reduce(Integer::sum).get());

    }
}
