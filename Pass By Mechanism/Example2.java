public class Example2 {
    int num = 10;

    public int change(Example2 ex){
        ex.num = ex.num + 10;
        return ex.num;
    }

    // Pass by reference

    public static void main(String[] args) {
        Example2 example = new Example2();
        System.out.println(example.num);
        System.out.println(example.change(example));
        System.out.println(example.num);
    }
}
