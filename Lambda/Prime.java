import java.util.Scanner;

@FunctionalInterface
interface Calculation{
    int result(int a,int b,int c);
}

class MainProgram{
    static void print(Calculation calculation){
        System.out.println(calculation.result(2,3,1));
    }

    public static void main(String[] args) {
        Calculation sum = (a,b,c)->{
            return a+b-c;
        };
        print(sum);
    }
}
