import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        int[] random = new int[5];
        int a=-1;
        int b=-1;
        Scanner sc = new Scanner(System.in);
        try {
                System.out.println("Enter an index: ");
                a = sc.nextInt();
                System.out.println("Enter a value: ");
                b = sc.nextInt();
                random[a] = b;
            }
        catch (Exception e) {
        int [] randomnew = new int[a+1];
        for (int n: random) {
            randomnew[n] = random[n];
        }
            randomnew[a] = b;
            System.out.println(Arrays.toString(random));
            System.out.println(Arrays.toString(randomnew));
        }
    }
}