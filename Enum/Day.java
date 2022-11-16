public enum Day implements Weather{
    MONDAY(9), TUESDAY(10), WEDNESDAY(20), THURSDAY(50), FRIDAY(44), SATURDAY(100), SUNDAY(1);
    private int a;
    private final int b=3;
    private static int c;
    private Person person;
    public enum Month{
        JANUARY, FEBRUARY, MARCH
    };

    // default level
    Day(int a){
        this.a = a;
    }

    public void setA(int a){
        this.a = a;
    }

    public int getA(){
        return a;
    }

    @Override
    public void predict(){
        System.out.println("Everwinter");
    }

    static void forecast(){
        System.out.println("Storm is coming");
    }

}

class Implements{
    public static void main(String[] args) {
        Day.Month day = Day.Month.MARCH;
        System.out.println(day);
    }
}
