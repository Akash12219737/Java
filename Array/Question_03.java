// Qs. Take an array as input from the user. Search for a
// given number x and print the index at which it occurs.
import java.util.*;

public class Question_03 {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();
        int number[] = new int [size];
        
        System.out.println("Taking input from user");
        for(int i = 0; i< number.length ; i++){
            number[i]= sc.nextInt();
            
        }
        System.out.println("find number");
        int x = sc.nextInt();
        System.out.println("Output");
        for(int i = 0;i<number.length;i++){
            if(number[i]==x){
                System.out.println("Found the number" + i);
            }
        }
        
    }
}
