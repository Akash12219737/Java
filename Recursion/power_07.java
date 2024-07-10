// Given two numbers p & q, find the value p^q using a recursive function.

import java.util.Scanner;

public class power_07 {
    // public static void main(String[] args) {
    //     Scanner scanner = new Scanner(System.in);

    //     System.out.print("Enter the base (p): ");
    //     int p = scanner.nextInt();

    //     System.out.print("Enter the exponent (q): ");
    //     int q = scanner.nextInt();

    //     int result = 1;
    //     for (int i = 0; i < q; i++) {
    //         result *= p;
    //     }

    //     System.out.println("Result: " + result);
    // }

    static int pow(int n, int m){
        if(m==0){
            return 1;
        }
        return pow(n, m-1)*n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of p :-");
        int a = sc.nextInt();
        System.out.println("Enter the exponent b :-");
        int b = sc.nextInt();
        System.out.println(pow(a,b));
    }
}
