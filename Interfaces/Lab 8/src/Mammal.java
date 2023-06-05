public abstract class Mammal implements MilkProvider{
    @Override
    public void givesMilk() {
        System.out.println("A mammal that gives milk");
    }
}
