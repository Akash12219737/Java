public class Fabonacci_04 {
    static int fab(int n){
        if(n == 0 || n == 1){ //base case
            return n;
        }
        int prev = fab(n-1); // sub problem
        int prev2 = fab(n-2);
        int ans = fab(n-1)+fab(n-2); //self work
        return ans;
    }

    public static void main(String[] args) {
        for(int i = 0; i<=10; i++){
        System.out.println(fab(i));
          }  }
}
