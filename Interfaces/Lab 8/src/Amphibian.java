public abstract class Amphibian implements WaterBreather, EggLayer {
    @Override
    public void waterbreathing() {
        System.out.println("An Amphibian that breathes water");
    }

    @Override
    public void laysEggs() {
        System.out.println("An Amphibian that lays eggs");
    }
}
