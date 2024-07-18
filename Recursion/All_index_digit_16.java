// Given an array arr of size N and an integer X. The task is to find all the indices of the integer X in the array.


public class All_index_digit_16 {
    static void findAllIndices(int[] a, int n, int target, int idx){
        //base case
        if(idx >= n){
            return;
        }
        //self work 
        if(a[idx] ==target){
            System.out.print(idx+" ");
        }
        // recursive work
        findAllIndices(a, n, target, idx+1);
    }

    public static void main(String[] args) {
        int [] a ={1, 2, 4, 4, 5, 6};
        int n = a.length;
        int target = 4;
        findAllIndices(a, n, target ,0 );
    }
}
