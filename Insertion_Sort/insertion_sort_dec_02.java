//  package Insertion_Sort;

class insertion_sort_dec_02 {
    static void Insertionsort(int [] arr){
        int n =arr.length;
        for(int i= 1; i< n;i++){
            int j =i;
            while (j>0 && arr[j]>arr[j-1]) {
                int temp = arr[j];
                arr[j]= arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }
public static void main(String[] args) {
    int [] a = {8, 3, 6, 5, 4, 2};
    Insertionsort(a);
    for (int i : a) {
        System.out.print(i+" ");
    }
}
    
}