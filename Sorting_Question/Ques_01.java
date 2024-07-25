// package Sorting_Question;

public class Ques_01 {
    static void ques(int arr[]) {
        int n = arr.length;
        boolean swapped;

        // Perform bubble sort with a swap check
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] == 0 && arr[j + 1] != 0) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no elements were swapped in this pass, break the loop
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int a[] = {0, 5, 0, 42, 3};
        ques(a);
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}
