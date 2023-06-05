package Problem2;

public class Developer extends Employee{
    private String language;

    public Developer(String name, double salary, String department, String language) {
        super(name, salary, department);
        this.language = language;
    }

    @Override
    public String toString() {
        return super.toString() + ", Language: " + language;
    }
}
