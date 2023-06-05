import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Car[] cars = new Car[4];
        File file = new File("cars.txt");
        Scanner sc = new Scanner(file);
        for (int i = 0; i < 4; i++) {
            String[] lines = new String[10];
            for (int j = 0; j < 10; j++) {
                lines[j] = sc.nextLine();
            }
            cars[i] = new Car();
            cars[i].setModelName(lines[0]);
            cars[i].setPrice(Double.parseDouble(lines[1].substring(11)));
            cars[i].setNewPriceRw(Double.parseDouble(lines[2].substring(24)));
            double minv = Double.parseDouble(lines[3].substring(23, 26));
            double maxv = Double.parseDouble(lines[3].substring(31));
            cars[i].setRoadTax(new RoadTax(minv, maxv));
            cars[i].setBodyType(lines[4].substring(12));
            cars[i].setTransmission(lines[5].substring(15));
            cars[i].setNumOfSeats(Integer.parseInt(lines[6].substring(17)));
            cars[i].setSegment(lines[7].substring(10));
            cars[i].setIntroduction(lines[8].substring(15));
            cars[i].setInstock(!lines[9].isEmpty());
            if (i == 3) break;
            sc.nextLine();
        }
        int totalCars = (int) (Math.random() * 801) + 200;
        Truck[] totalTrucks = new Truck[(totalCars/20) + 1];
        for (int j=0; j<totalTrucks.length; j++) {
            totalTrucks[j] = new Truck();
            for (int i=0; i<20; i++) {
                int b = (int) (Math.random() * 4);
                Car [] carPerTruck = new Car[20];
                carPerTruck[i] = new Car();
                carPerTruck[i] = cars[b];
                totalTrucks[j].load(carPerTruck[i]);
                if ((j==totalTrucks.length-1) && (i==totalCars-((totalTrucks.length-1)*20)-1)) {
                    break;
                }
            }
        }
        System.out.println("Total number of cars are " + totalCars);
        System.out.println("Total number of trucks are " + totalTrucks.length);
        Ferry ferry = new Ferry();
        for (Truck totalTruck : totalTrucks) {
            ferry.load(totalTruck);
        }
        System.out.println("Last truck is loaded with " + totalTrucks[totalTrucks.length-1].getCarcounter() + " car(s)");
        System.out.println("Ferry is loaded with " + ferry.getTruckcounter() + " truck(s)");
        System.out.println();

        System.out.println("PRINT STATEMENTS TO SHOW QUEUE AND STACKS HAVE BEEN IMPLEMENTED: Please check comments.");
        //PRINT STATEMENTS TO SHOW QUEUE AND STACKS HAVE BEEN IMPLEMENTED
    //When a queue is printed, it shows the elements from start to end
    //When a stack is printed, it shows the elements from bottom to top
        System.out.println(ferry); //trucks shown in queue(ferry)
        System.out.println(ferry.trucks.peek()); //truck at start of queue(ferry)
        Truck a = ferry.unload();
        System.out.println(ferry); //second truck in queue(ferry) is now at start of queue(ferry)
        System.out.println();
        System.out.println(a.cars); //cars shown in stack(truck)
        System.out.println(a.cars.peek()); //car at top of stack(truck)
        Car c = a.unload();
        System.out.println(a.cars); //car before c in stack(truck) is now at top of stack(truck)

        System.out.println();

        while (!ferry.trucks.isEmpty()) {
            Truck t = ferry.unload();
            while (!t.cars.isEmpty()) {
                t.unload();
            }
        }
        System.out.println(ferry);
        System.out.println("All trucks and cars have been offloaded.");
    }
}