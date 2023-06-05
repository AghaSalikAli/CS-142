public class LegalSecretary extends Secretary{
    @Override
    public double getSalary() {
        return super.getSalary() + 5000;
    }
    public String fileLegalbriefs () {
        System.out.println("I could file all day!");
        return null;
    }

}
