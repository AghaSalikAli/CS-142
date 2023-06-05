import java.util.LinkedList;
import java.util.Queue;

public class Ferry {
    private int truckcounter;
    Queue<Truck> trucks;
    public Ferry () {
        trucks = new LinkedList<>();
    }

    public int getTruckcounter() {
        return truckcounter;
    }

    public Queue<Truck> getTrucks() {
        return trucks;
    }
    public void load (Truck truck) {
        if(truckcounter<50) {
            trucks.add(truck);
            truckcounter++;
        }
        else
            System.out.println("Cannot load truck! Ferry has reached capacity.");
    }

    public Truck unload () {
        truckcounter--;
        return trucks.remove();
    }

    @Override
    public String toString() {
        return "Ferry{" +
                "trucks=" + trucks +
                '}';
    }
}