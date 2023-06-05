package Problem3;

import java.util.ArrayList;
import java.util.Random;

public class TransportCompany {
    private ArrayList<Car> cars = new ArrayList<>();
    private ArrayList<Bike> bikes = new ArrayList<>();
    private ArrayList<Helicopter> helicopters = new ArrayList<>();

    public TransportCompany() {
        for (int i = 0; i < new Random().nextInt(10,100); i++) {
            cars.add(new Car(new Random().nextInt(60,120)));
        }

        for (int i = 0; i < new Random().nextInt(10,100); i++) {
            bikes.add(new Bike(new Random().nextInt(4,6)));
        }

        for (int i = 0; i < new Random().nextInt(10,100); i++) {
            helicopters.add(new Helicopter(new Random().nextInt(2,9)));
        }

    }

    public void receiveRequest(int numPassengers) {
        if (numPassengers == 1) {
            Bike bike = bikes.get(new Random().nextInt(bikes.size()));
            Operator operator = bike.operator;
            bike.start();
            operator.operate();
            if (bike.stop(100)) {
                System.out.println("Bike stopped successfully.");
            } else {
                System.out.println("Bike couldn't stop in time.");
            }
        } else if (numPassengers <= 4) {
            Car car = cars.get(new Random().nextInt(cars.size()));
            Operator operator = car.operator;
            car.start();
            operator.operate();
            if (car.stop(200)) {
                System.out.println("Car stopped successfully.");
            } else {
                System.out.println("Car couldn't stop in time.");
            }
        }else {
            Helicopter helicopter = helicopters.get(new Random().nextInt(helicopters.size()));
            Operator operator = helicopter.operator;
            helicopter.start();
            operator.operate();
            if (helicopter.stop(500)) {
            System.out.println("Helicopter stopped successfully.");
        } else {
            System.out.println("Helicopter couldn't stop in time.");
            }
        }
    }
}