import java.util.Scanner;

public class problem4 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter a 3 digit number: ");
            int a = sc.nextInt();
            if (a<0 || a>999)
                throw new myexception("Your entered number is incorrect.");
            System.out.println((a%10) + (a/10 %10) + (a/100 %10));
        }catch (myexception e) {
            System.out.println(e.getMessage());
        }
    }
}