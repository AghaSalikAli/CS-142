package Problem3;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(50);
        car.start();
        System.out.println(car.stop(60));
        Bike bike = new Bike(4);
        bike.start();
        System.out.println(bike.stop(55));
        Helicopter helicopter = new Helicopter(50);
        helicopter.start();
        System.out.println(helicopter.stop(34));
        TransportCompany t = new TransportCompany();
        t.receiveRequest(1);
        t.receiveRequest(4);
        t.receiveRequest(6);
    }
}
