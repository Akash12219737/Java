import java.util.*;

public class Clear_bit_03 {
    public static void main(String[] args){
        // Scanner sc =new Scanner (System.in);
        int n =5;
        int pos = 2;
        int bitMask = 1 << pos;
        int notBitMask = ~ (bitMask);
        int newnumber =notBitMask & n ;
        System.out.println(newnumber);
    }
}
