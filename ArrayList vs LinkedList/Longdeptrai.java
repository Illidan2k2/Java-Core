import java.util.List;
import java.util.Random;

public class Longdeptrai {
    static Random random = new Random();
    static long start_time = 0;
    static long finished_time = 0;
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    static int[] A = new int[50];

    synchronized public static int findPrime(int a, int b) {
        if(a<b){
            int count = 0;
            for (int i = a; i<b; i++) {
                if (isPrime(i)) {
                    count++;
                    System.out.println("Prime"+ count+" is: "+i);
                }
            }
            System.out.println("All prime numbers are: ");
            return count;
        }
        return 0;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            A[i] = random.nextInt();
        }
        Longdeptrai s1 = new Longdeptrai();
        Longdeptrai s2 = new Longdeptrai();

        Thread t1 = new Thread(){
            @Override
            public void run(){
                start_time = System.currentTimeMillis();
                System.out.println(Longdeptrai.findPrime(1,A.length/2));
                finished_time = System.currentTimeMillis();
                System.out.println("Time for thread 1: ");
                System.out.println(finished_time-start_time);
            }
        };

        Thread t2 = new Thread(){
            @Override
            public void run(){
                start_time = System.currentTimeMillis();
                System.out.println(Longdeptrai.findPrime((A.length/2)+1, A.length));
                finished_time = System.currentTimeMillis();
                System.out.println("Time for thread 2: ");
                System.out.println(finished_time-start_time);
            }
        };
        t1.start();
        t2.start();
    }
}

