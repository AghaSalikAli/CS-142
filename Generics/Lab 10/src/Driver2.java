import java.util.ArrayList;
import java.util.List;

//TASK3
public class Driver2{
    public static void main(String[] args) {
        List<Pair<String>> ps = new ArrayList<>();
        List<Pair<Double>> pd = new ArrayList<>();
        ps.add(new Pair<>("Ahmad", "Murtaza"));
        pd.add(new Pair<>(0.1,0.2));
        List<DisparatePair<String,Integer>> p = new ArrayList<>();
        p.add(new DisparatePair<>("1.3",3));
        for (int i = 0; i<ps.toArray().length; i++) {
            System.out.println(ps.get(i).getFirst());
            System.out.println(ps.get(i).getSecond());
         }
        System.out.println();

        for (int i = 0; i<pd.toArray().length; i++) {
            System.out.println(pd.get(i).getFirst());
            System.out.println(pd.get(i).getSecond());
        }
        System.out.println();

        for (int i = 0; i<p.toArray().length; i++) {
            System.out.println(p.get(i).getFirst());
            System.out.println(p.get(i).getSecond());
        }
    }
}
