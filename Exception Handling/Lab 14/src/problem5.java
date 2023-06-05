import java.util.Scanner;

public class problem5 {
    public static void main(String[] args) {
        int a =-1;
        int b;
        Scanner sc = new Scanner(System.in);

        try {
           a = sc.nextInt();
           b=sc.nextInt();
            System.out.println(a/b);
        }
        catch (Exception e) {
            System.out.println("Cannot divide by zero. Please enter the second number again.");
            b=sc.nextInt();
            while (b==0) {
                System.out.println("Cannot divide by zero. Please enter the second number again.");
                b = sc.nextInt();
            }
            System.out.println(a/b);
        }
    }
}
