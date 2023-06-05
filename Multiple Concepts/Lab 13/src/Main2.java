public class Main2 {
    public static void main(String[] args) {
        FeetInches a = new FeetInches(3,4);
        System.out.println(a);
        FeetInches b = new FeetInches(4,38);
        System.out.println(b);
        FeetInches c = new FeetInches(3,14);
        System.out.println(c);
        FeetInches d = new FeetInches(3,14);
        System.out.println(d);
        System.out.println(c.equals(d));
        FeetInches e = new FeetInches(2,9);
        System.out.println(a.add(e));

    }
}
