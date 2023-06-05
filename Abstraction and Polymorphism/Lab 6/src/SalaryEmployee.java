public class SalaryEmployee extends Employee {

    private double weeklysalary;

    public SalaryEmployee(String fname, String lname, double weeklySalary) {
        super(fname, lname);
        this.weeklysalary = weeklySalary;
    }

    public double getWeeklysalary () {
        return weeklysalary;
    }

    public void setWeeklysalary(double weeklysalary) {
        this.weeklysalary = weeklysalary;
    }

    public double earnings () {
        return weeklysalary*4;
    }

    public String toString () {
        return "First Name: " + getfname() + "\n"
                + "Last Name: " + getLname() + "\n"
                + "Earnings: "  + earnings() + "\n";
    }
}
