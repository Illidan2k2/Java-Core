public class Employee {
    static int[] list = {50, 43, 63};

    static double average(Measurable measurable) {
        return measurable.getMeasure() / list.length;
    }

    public static void main(String[] args) {
        Measurable measurable = () -> {
            int sum = 0;
            for (int i : list) {
                sum += i;
            }
            return sum;
        };
        System.out.println(average(measurable));
    }
}
