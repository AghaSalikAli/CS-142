public class Janitor extends Employee{
    @Override
    public int getHours() {
        return super.getHours()*2;
    }
    @Override
    public double getSalary() {
        return super.getSalary()-10000;
    }
    @Override
    public int getVacdays() {
        return super.getVacdays()/2;
    }
    public String clean () {
        System.out.println("Working for the man.");
        return null;
    }
}
