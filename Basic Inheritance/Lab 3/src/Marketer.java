public class Marketer extends Employee{
    @Override
    public double getSalary() {
        return super.getSalary() + 10000;
    }

    public String advertise() {
        System.out.println("Act now, while supplies last!");
        return null;
    }
}
