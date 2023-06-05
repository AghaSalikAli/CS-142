public class Platypus extends Mammal implements EggLayer{
    @Override
    public void givesMilk() {
        System.out.println("A platypus that gives milk");
    }

    @Override
    public void laysEggs() {
        System.out.println("A platypus that lays eggs");
    }
}
