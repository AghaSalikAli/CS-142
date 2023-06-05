package Problem3;

import java.util.Random;

public class Bike implements Vehicle{

    int gear;
    Operator operator;

    public Bike (int gear) {
        this.gear = gear;
        operator = getOperator();
    }


    @Override
    public void start() {
        System.out.println("Bike has started");
    }

    @Override
    public boolean stop(int distance) {
        return (distance<=3*gear);
    }

    @Override
    public Operator getOperator() {
        int a = new Random().nextInt(1,3);
        if (a==1)
            return new Driver();
        else if (a==2)
            return new Rider();
        else
            return new Pilot();
    }
}
