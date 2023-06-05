public class Employee {
    int hours;
    double salary;
    int vacdays;
    String form;

    public Employee () {
        hours=40;
        salary=40000;
        vacdays=10;
        form="Yellow";
    }
    public int getHours() {
        return hours;
    }

    public double getSalary() {
        return salary;
    }

    public int getVacdays() {
        return vacdays;
    }

    public String getForm() {
        return form;
    }
}

