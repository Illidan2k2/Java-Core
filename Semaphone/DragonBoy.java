import jdk.jshell.execution.Util;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Semaphore;

public class DragonBoy {
    Random random = new Random();
    int minRange = 10, maxRange = 100;
    public synchronized List<Integer> RandomNumber(){
        int[] numbers = new int[100];
        for(int i =0; i< numbers.length;i++){
            numbers[i] =
        }
        System.out.println(numbers);
        System.out.println("Thread 1 finished");
        return numbers;
    }

    public synchronized void FilterNumber(){
        List<Integer> numbers = RandomNumber();
        int count_prime = 0, count_square = 0;
        for(int n : numbers){
            if(isPrime(n)){
                count_prime ++;
                System.out.println("The "+count_prime+" prime number is: "+n);
            }
            if(isPerfectSquare(n)){
                count_square++;
                System.out.println("The "+count_square+" square number is: "+n);
            }
        }
        System.out.println("Thread 2 finished");
    }

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
    public static boolean isPerfectSquare(int num)
    {
        double root = Math.sqrt(num);
        return (Math.floor(root) - root) == 0;
    }
}
