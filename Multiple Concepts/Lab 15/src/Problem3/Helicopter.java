package Problem3;

public class Helicopter implements Vehicle{

    int rotations;
    Operator operator;

    public Helicopter (int rotations) {
        this.rotations = rotations;
        this.operator = getOperator();
    }
    @Override
    public void start() {
        System.out.println("Helicopter has started");
    }

    @Override
    public boolean stop(int distance) {
        return (distance<=10*rotations);
    }

    @Override
    public Operator getOperator() {
        return new Pilot();
    }
}
