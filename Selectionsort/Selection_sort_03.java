public class Selection_sort_03 {
    static void selection(int[] b) {
        for (int i = 0; i < b.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < b.length; j++) {
                if (b[j] < b[minIndex]) {
                    minIndex = j;
                }
            }
        }
    }

    public static void main(String[] args) {
        int a[] = { 4, 8, 5, 12, 16 };
        selection(a);
        for (int num : a) {
            System.out.println(num + " ");
        }
    }
}
