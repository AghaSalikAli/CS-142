public class DecoyDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Decoy duck makes no sound!");
    }

    @Override
    public void fly() {
        System.out.println("Decoy duck cannot fly!");
    }
}
