// Return the count of digit
 
class Count_digit_06 {

    static int count(int n){
        if(n==0){
            return 0;
        }
        int ans = count(n/10);
        int output = ans + 1;
        return output;
    }
    public static void main(String[] args) {
        System.out.println(count(4568));
    }
}
