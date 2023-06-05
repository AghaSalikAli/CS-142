import java.util.ArrayList;

public abstract class Ticket {
    private int sNum;
    int price;

    public static ArrayList<Integer>sNumlist = new ArrayList<Integer>();

    public Ticket () {
        boolean a = true;
        int x = (int)(Math.random()*99999)+1;
        while (a)
            if (!sNumlist.contains(x)) {
                sNumlist.add(x);
                sNum = x;
                a = false;
            }else
                x = (int)(Math.random()*99999)+1;
    }

    public abstract int getPrice();

    public int getsNum() {
        return sNum;
    }


    public String toString() {
        return "SN: " + getsNum() + ", " + "$" + getPrice();
    }
}
