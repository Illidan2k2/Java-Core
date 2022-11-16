import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

public class DemoSpeed {
    static long start_time = 0;
    static long finished_time = 0;
    static final int NUMBER = 10000000;
    static Random random = new Random();
    static HashSet<Person> number1 = new HashSet<>();
    static HashMap<Integer,Person> number2 = new HashMap<>();

    public static int randomValue(){
        return random.nextInt(1,1000);
    }

    public static Person getPerson(){
        Person person = new Person(randomValue(),"Long");
        return person;
    }

    public static void calculateTime1() {
        start_time = System.currentTimeMillis();

        for (int i = 1; i < NUMBER; i++) {
            number1.add(getPerson());
        }
        finished_time = System.currentTimeMillis();
        System.out.println("The process time hashset: " + (finished_time - start_time));
    }
    public static void calculateTime2(){
        start_time = System.currentTimeMillis();
        for(int i=1; i< NUMBER;i++){
            number2.put(i,getPerson());
        }
        finished_time = System.currentTimeMillis();
        System.out.println("The process time hashmap: "+(finished_time - start_time));
    }

    public static void main(String[] args) {
        calculateTime1();
        calculateTime2();

    }

}



