public class Undertaker extends Wrestler {
    @Override
    public void Salary(int salary) {
        super.Salary(salary);
    }

    @Override
    public void Finisher() {
        System.out.println("Tombstone");
    }

    @Override
    public void Momentum() {
        System.out.println("Choke slam");
    }


}
