public abstract class Birds implements EggLayer, Flyer {
    @Override
    public void laysEggs() {
        System.out.println("A bird that lays eggs");
    }

    @Override
    public void flies() {
        System.out.println("A bird that flies");
    }
}
