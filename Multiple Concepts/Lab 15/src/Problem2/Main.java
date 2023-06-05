package Problem2;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("Salik", 75000, "Sales", 5000);
        Developer developer = new Developer("Ahmad", 65000, "IT", "Java");
        System.out.println(manager.toString());
        System.out.println(developer.toString());
        }
    }

