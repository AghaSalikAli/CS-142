public class t1driver {
    public static void main(String[] args) {
        Employee[] emp = new Employee[5];
        emp[0] = new SalaryEmployee("Agha", "Salik", 250.5);
        emp[1] = new SalaryEmployee("Ahmad", "Murtaz", 200.5);
        emp[2] = new HourlyEmployee("Alina", "Zindani", 10.5, 7);
        emp[3] = new HourlyEmployee("Dawood", "Ibrahim", 10.5, 9);
        emp[4] = new SalaryEmployee("Mahmood", "Abbasi", 300);

        for (Employee e : emp) {
            System.out.print(e);
            System.out.println();   //for ease of readability
        }

        for (Employee e: emp) {     //this is for running the earnings method
            Boolean b = e instanceof HourlyEmployee;
            if (b)
                e = (HourlyEmployee) e;
            else
                e = (SalaryEmployee) e;
            System.out.println(e.earnings());
        }
    }
}