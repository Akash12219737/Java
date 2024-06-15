import java.util.*;

public class Taking_input_02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int number[] = new int [size];

        // taking input
        for(int i = 0; i< size;i++){
            number[i] = sc.nextInt();
        }
        System.out.println("For the output");
        for(int i =0 ; i<size; i++){
                System.out.println(number[i]);
        }
    }
    
}
