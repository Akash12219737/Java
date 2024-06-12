// package Loops_06;

public class For_loop_03 {
    public static void main(String[] args){

        for(int i = 0; i<=10; i++){
            System.out.println(i);
        }

        System.out.println("Print odd numbers");
        int n = 5;
        for(int i=0; i<=n; i+=2){  // wrong method
        System.out.println(i);
        

        }
        System.out.println("Alternate method to print odd number");

        int m= 5;
        for(int i = 0; i<=m ; i++){
                System.out.println(2*i+1);
        }
    }
}

