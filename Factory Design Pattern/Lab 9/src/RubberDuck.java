public class RubberDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Rubber duck squeaks!");
    }

    @Override
    public void fly() {
        System.out.println("Rubber duck cannot fly!");
    }
}
