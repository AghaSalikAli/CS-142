public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Mallard duck quacks!");
    }

    @Override
    public void fly() {
        System.out.println("Mallard duck can fly!");
    }
}