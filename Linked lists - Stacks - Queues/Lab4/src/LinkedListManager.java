public class LinkedListManager {
    public static void main (String [] args) {
       Linkedlist l = new Linkedlist();
       // l.currentstate();
         l.append(4);
         l.append(5);
        l.append(4);
        l.append(5);
        l.append(6);
        l.append(6);
        l.currentstate();
       //l.remove(4);
       //l.currentstate();
       //l.removeNumall(4);
       // l.currentstate();
        l.add(3,5);
        l.currentstate();
       /* Linkedlist l2 = new Linkedlist();
        l2.getAscii("lol");
        l2.currentstate();
        Linkedlist l3 = new Linkedlist();
        l3.append(108);
        l3.append(111);
        l3.append(108);
        System.out.print(l3.getString());*/
    }
}
