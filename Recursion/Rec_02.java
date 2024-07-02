// Pritn the number from to 1 to n

import java.util.*;


public class Rec_02 {
     static void  printnum(int n){
        if(n == 6){
            return ;
        }
        System.out.println(n);
        printnum(n+1);
        // System.out.println(n);
        
    }
    public static void main(String[] args) {
        int n = 1;
        printnum(n);
    }

}
