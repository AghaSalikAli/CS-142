import java.util.Arrays;
import java.util.Stack;

public class Truck {
    String trucknumber;
    private int carcounter;
    Stack<Car>cars;
    public Truck() {
    cars = new Stack<>();
    trucknumber = "T" + (int)(Math.random()*1000);
    }
    public int getCarcounter() {
        return carcounter;
    }

    public Stack<Car> getCars() {
        return cars;
    }

    public void load (Car mycar) {
    if(carcounter<20) {
        cars.push(mycar);
        carcounter++;
    }
    else
        System.out.println("Cannot load car! Truck has reached capacity.");
    }

    public Car unload () {
        carcounter--;
        return cars.pop();
    }

    @Override
    public String toString() {
        return "{" +
                trucknumber + "}";
    }
}