public class Driver1 {
    public static void main (String [] args) {
        Employee e1 = new Employee();
        Lawyer l1 = new Lawyer();
        Secretary s1 = new Secretary();
        LegalSecretary ls1 = new LegalSecretary();
        Marketer m1 = new Marketer();
        Janitor j1 = new Janitor();
        System.out.println(e1.getVacdays());
        System.out.println(l1.getVacdays());
        System.out.println(e1.getForm());
        System.out.println(l1.getForm());
        l1.sue();
        System.out.println(ls1.getSalary());
        s1.takeDictation("Hello");
        ls1.fileLegalbriefs();
        System.out.println(m1.getSalary());
        m1.advertise();
        System.out.println(j1.getHours());
        System.out.println(j1.getSalary());
        System.out.println(j1.getVacdays());
        j1.clean();

    }
}
