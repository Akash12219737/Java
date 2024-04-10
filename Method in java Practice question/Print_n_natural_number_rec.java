public class Print_n_natural_number_rec {
    static int rec(int n){
        if(n==1){
            return 1;
        }
        else{
            return n+ rec(n-1);
        }
    }


    public static void main(String[] args) {
        // rec(4);
        System.out.println(+rec(4));
    }
}



// public static void main(String[] args) {
//     int result = rec(4);
//     System.out.println("Sum of the first 4 natural numbers: " + result);
// }
// }