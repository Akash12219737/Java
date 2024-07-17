public class Searching_15 {
    // static boolean search(int[] a, int n, int target, int idx){
    //     if(idx >= n) return false;
    //     if(a[idx] == target) return true;
    //     return search (a, n, target,  idx+1);
    // }



    // if find target then return the index
    static int findIndex(int[] a, int n, int target, int idx){
        // base case
        if(idx >= n) return -1;
        //self work
        if(a[idx] == target) return idx;
        //recursive work
        return findIndex(a, n, target, idx+1);
    }
    public static void main(String[] args) {
        // int [] a = {1, 4, 5, 6};
        // int target = 5;
        // if(search(a, a.length, target, 0)){
        //     System.out.println("found");
        // }else{
        //     System.out.println("Not found");
        // }


        
            int[] a = {1, 2, 4, 4, 4, 5, 6};
            int target = 4;
            int n = a.length;
            System.out.println(findIndex(a, n, target, 0));
    }
}
