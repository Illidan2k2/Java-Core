public class DemoGenerics <T> {
    T ThingToPrint;

    public DemoGenerics(T ThingToPrint){
        this.ThingToPrint = ThingToPrint;
    }

    public void Print(){
        System.out.println(ThingToPrint);
    }

    public static void main(String[] args) {
        DemoGenerics<String> letter = new DemoGenerics<>("Hello");
        letter.Print();

        DemoGenerics<Integer> number = new DemoGenerics<>(20);
        number.Print();

        DemoGenerics<Double> double_number = new DemoGenerics<>(32.23d);
        double_number.Print();
    }
}

/*public class DemoGenerics {
    Integer ThingToPrint;

    public Printer(Double ThingToPrint){
        this.ThingToPrint = ThingToPrint;
    }
}*/

