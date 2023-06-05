import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = null;
        String b = null;
        try {
            System.out.println("Enter a number: ");
            a = sc.next();
            System.out.println("Enter a number: ");
            b = sc.next();
            System.out.println(Integer.parseInt(a)-Integer.parseInt(b));
        } catch (Exception e) {
            try {
            if (a.matches("^[0-9]")) {
                    b = b.substring(0,b.length()-Integer.parseInt(a));
                System.out.print(b);
            }else {
                    a = a.substring(0,a.length()-Integer.parseInt(b));
            System.out.println(a);
            }
            } catch (Exception f) {
                System.out.println("Not possible");
            }
        }
    }
}
