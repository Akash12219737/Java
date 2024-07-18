import java.util.ArrayList;

public class Array_list_all_idx_digit_17 {
    static ArrayList<Integer> allIdx(int[] a, int n, int target, int idx){
         ArrayList<Integer> ans = new ArrayList<>();
          // base case
        if(idx >= n){
            return ans; // return empty arraylist
        }
        // self work
        if(a[idx] == target){ // ans -> {0}
            ans.add(idx);
        }
        // recursive work
        ArrayList<Integer> smallAns = allIdx(a, n, target, idx+1); // smallAns = {1, 3}

        ans.addAll(smallAns); // {0, 1, 3}
        return ans;
    }

    public static void main(String[] args) {
        int [] a = {1, 2, 4, 4, 5, 4};
        int target = 4;
        int n = a.length;
        ArrayList<Integer> ans = allIdx(a, n, target,0);
        for(Integer i: ans){
            System.out.println(i);
        }
    }
}
