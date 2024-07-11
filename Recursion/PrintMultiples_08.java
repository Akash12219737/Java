import java.util.*;
public class PrintMultiples_08 {


    static void printmultiple(int n, int m){
        if (m == 0) {
            return ;
        }
        printmultiple(n, m-1);
        System.out.println(n*m);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st numbere :- ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number :- ");
        int b = sc.nextInt();
        printmultiple(a, b);
    }
}
