// package Bit Manipulation;

public class Set_bits_02 {
    public static void main(String[] args) {
        int n = 5;
         int pos = 1;
         int bitMask= 1<< pos;
         int newnum = bitMask | n;
         System.out.println(newnum);
    }
    
}
