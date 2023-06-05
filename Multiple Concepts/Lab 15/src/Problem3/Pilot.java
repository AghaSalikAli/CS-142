package Problem3;

public class Pilot implements Operator,Flier{
    @Override
    public void operate() {
        System.out.println("Im a pilot");
        flies();
    }

    @Override
    public void flies() {
        System.out.println("Helicopter flying");
    }
}
