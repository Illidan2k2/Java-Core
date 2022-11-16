import java.util.function.Consumer;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;
import java.util.function.Predicate;

public class DemoPredicate {
    //Predicate interface represents a boolean-valued-function of an argument
    //Used to filter data from a Java Stream

    public static void main(String[] args) {
        IntPredicate predicate = n -> n%2==0;
        System.out.println(predicate.test(20));

        predicate = n -> n %3 == 0;
        System.out.println(predicate.test(20));

        IntPredicate answer = n -> (n ^ 64) - 1 > (2^64) ;
        System.out.println(answer.test(2));
    }
}
