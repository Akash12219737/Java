import java.util.*;
public class SeriesSum_09 {

    static int seriessum(int n){
        if (n == 0) {
            return 0;
        }
        int result= seriessum(n-1);
        int sum = result+n;
        return sum;    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number :- ");
        int a = sc.nextInt();
        System.out.println(seriessum(a));
    }
}
