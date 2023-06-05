package Problem3;

import java.util.Random;

public class Car implements Vehicle{

    int speed;
    Operator operator;

    public Car (int speed) {
       this.speed = speed;
       operator = getOperator();
    }

    @Override
    public void start() {
        System.out.println("Car has started");
    }

    @Override
    public boolean stop(int distance) {
        return (distance<=6*speed);
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
