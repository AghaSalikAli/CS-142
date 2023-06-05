//TASK2
import java.util.LinkedList;
public class Maillist {
    public static void main(String[] args) {
        LinkedList<Address> list = new LinkedList<>();
        list.add(new Address("A", "11 Ave", "U", "IL", "11111"));
        list.add(new Address("R", "11 Lane", "M", "IL", "22222"));
        list.add(new Address("T", "8 St", "C", "IL", "33333" ));
        for (Address a:  list) {
            System.out.println(a);
            System.out.println();
        }
     }
}
