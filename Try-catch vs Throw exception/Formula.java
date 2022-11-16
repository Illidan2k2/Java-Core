import javax.management.RuntimeErrorException;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class Formula {
    // Catch and handle the method
    public static void CatchError() throws ClassNotFoundException {
        Scanner input = new Scanner(System.in);
        // Unchecked exception
        try{
            int a = input.nextInt();
            int n = 100 / a;
            System.out.println(n);
        } catch (ArithmeticException ex){
            System.out.println("Long");
            //Checked exception
            throw new ClassNotFoundException();
        }
    }

    public static void Handle() throws ClassNotFoundException{
        CatchError();
        System.out.println("Afterlife");
    }

    // Throw method
    // Calling method to execute the thrown method


    public static void main(String[] args) throws ClassNotFoundException {
        Handle();
    }
}