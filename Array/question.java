package Array;
// Take an array as input from the user. Search for a given number x and print the index at which it occurs.


import java.util.*;

public class question {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        int number[] = new int[size];
        System.out.println("Enter numbers : ");
        for(int i =0;i<size; i++){

            number[i]  = sc.nextInt();
        }
        System.out.println("Enter number to search: ");
        int x = sc.nextInt();

        for(int i = 0; i<size; i++){
            if(number[i] == x){
                System.out.println(i);
                break;
            }
        }
        sc.close();
    }
}