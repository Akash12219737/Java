// Sum of digit

public class SOD_05 {

    static int SumOfDigit(int n){
        // base case
        if(n>=0 && n<=9){
            return n;
        }

        // recursion work --> small ans
        int smallAns = SumOfDigit(n/10);
        //self work
        int ans = smallAns + n%10;
        return ans;

    }
    public static void main(String[] args) {
        // int n;
        System.out.println(SumOfDigit(123));
    }







}
