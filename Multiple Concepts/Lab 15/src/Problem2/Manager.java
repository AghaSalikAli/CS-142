package Problem2;

public class Manager extends Employee {
    private double bonus;

    public Manager(String name, double salary, String department, double bonus) {
        super(name, salary, department);
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return super.toString() + ", Bonus: " + bonus;
    }
}


