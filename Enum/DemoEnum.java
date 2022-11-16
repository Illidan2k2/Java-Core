public class DemoEnum {
    public static void main(String[] args) {
        Day.forecast();
        Day today = Day.SUNDAY;
        today.setA(3);
        System.out.println(today.getA());
    }
}
