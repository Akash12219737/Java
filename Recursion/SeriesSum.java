import java.util.Scanner;

public class SeriesSum {
    static int SeriesSum(int n) {
        if (n == 0) {
            return 0;
        } else if (n % 2 == 0) {
            // If n is even
            return SeriesSum(n - 1) - n;
        } else {
            // If n is odd
            return SeriesSum(n - 2) + n;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = sc.nextInt();
        System.out.println("Sum of series up to " + a + " is: " + SeriesSum(a));
    }
}
