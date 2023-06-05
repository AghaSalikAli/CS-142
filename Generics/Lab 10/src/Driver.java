//TASK 1
public class Driver {
    public static void main(String[] args) {
        Person person = new Person(200, 300, "Agha", "Salik");
        System.out.println(person.ComputeTotalWealth());
        System.out.println(person.getName());
        PersonInterface personInterface1 = person;
        System.out.println(personInterface1.ComputeTotalWealth());
        System.out.println(personInterface1.getName());
        boolean b1 = (person==personInterface1);
        System.out.println("Do person and personInterface1 point to the same object instance? " + b1);
        PersonInterface personinterface2 = new Person(3000, 4000, "Ahmad", "Murtaza");
        System.out.println(personinterface2.ComputeTotalWealth());
        System.out.println(personinterface2.getName());
    }
}
