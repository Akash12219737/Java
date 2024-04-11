public class Fabonacci_series_recursion {
    static int fab(int n){
        if(n==1){
            return 0;
        }if(n==2 ){
            return 1;
        }else{
            return fab(n-1)+fab(n-2);
        }
    }

    public static void main(String[] args) {
        int result =fab(5);
        System.out.println(result);
    }
    
}
