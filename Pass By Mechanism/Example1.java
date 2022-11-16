public class Example1 {
    int num = 10;

    public int change(int num){
        num = num + 10;
        return num;
    }

    // Pass by value

    public static void main(String[] args) {
        Example1 example = new Example1();
        System.out.println(example.num);
        System.out.println(example.change(example.num));
        System.out.println(example.num);
    }
}
