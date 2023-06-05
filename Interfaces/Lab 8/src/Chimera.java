public class Chimera implements EggLayer, WaterBreather, Flyer, MilkProvider {
    @Override
    public void laysEggs() {
        System.out.println("A chimera that lays eggs");
    }

    @Override
    public void flies() {
        System.out.println("A chimera that flies");
    }

    @Override
    public void waterbreathing() {
        System.out.println("A chimera that breathes water");
    }

    @Override
    public void givesMilk() {
        System.out.println("A chimera that gives milk");
    }
}
