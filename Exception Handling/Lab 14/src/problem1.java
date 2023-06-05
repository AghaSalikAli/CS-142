import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = null;
        String b = null;
        try {
            System.out.println("Enter a number: ");
                a = sc.next();
            System.out.println("Enter a number: ");
                b = sc.next();
            System.out.println(Integer.parseInt(a)*Integer.parseInt(b));
        } catch (Exception e) {
            if (a.matches("^[0-9]")) {
                for (int i=0; i<Integer.parseInt(a); i++) {
                    System.out.print(b);
                }
            }else
                for (int i=0; i<Integer.parseInt(b); i++) {
                    System.out.print(a);
                }
        }
    }
}
