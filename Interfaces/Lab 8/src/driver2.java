public class driver2 {
    public static void main(String[] args) {
        Mammal m1 = new Platypus();
        m1.givesMilk();
        Chimera c1 = new Chimera();
        c1.flies();
        c1.givesMilk();
        c1.laysEggs();
        c1.waterbreathing();
        Bat b1 = new Bat();
        b1.flies();
    }
}
