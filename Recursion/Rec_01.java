// Print the number from 5 to 1

import java.util.*;
class Rec_01{

    static int printnumber(int n){
        if(n == 0){
            return 0;
        }
        System.out.println(n);
        printnumber(n-1);
        
        return 0;
    }
    public static void main(String[] args) {
         Scanner a  = new Scanner(System.in);
         System.out.println("Enter the number");
         int n = a.nextInt();
         printnumber(n);
        
    }
}