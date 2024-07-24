public class Selection_sort_dec_04 {

    static void Selection_sort(int [] a) {
        for(int i = 0; i<a.length-1; i++){
            int max = i;
            for(int j = i+1; j<a.length; j++){
                if (a[j]>a[max]) {
                    max= j;
                }
            }
            int temp = a[i];
            a[i] =a[max];
            a[max]= temp;
        }
    
        
    }
    public static void main(String[] args) {
        int a [] = {6, 2 , 8, 9 ,12};
        Selection_sort(a);
        for (int i : a) {
            System.out.print(i+" ");
            
        }
    }
}
