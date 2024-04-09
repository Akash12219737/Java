// calculate factorail using recursion

public class cwh_34_Recursion {

    static int factorial(int n){
        if(n==0 || n == 1){
            return 1;
        }else{
            return n*factorial(n-1);
        }

    }
    static int Fibonacci(int n){
        if(n == 0 || n == 1){
            return n;
        }else{
            return Fibonacci(n-1)+Fibonacci(n-2);
        }

        
    }
        
    public static void main(String[] args) {
        int a = 5;
        System.out.println("The factorail of a is: " +factorial(a));
        int  x =10;
        System.out.println("To calculate the Fibonacci number"+Fibonacci(x));
    }
}
