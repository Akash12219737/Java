// package MergSort;

public class Merg_sort {

    // Method to merge two sorted halves of the array
    public static void conquer(int arr[], int si, int mid, int ei) {
        int merge[] = new int[ei - si + 1];
        int idx1 = si;    // Starting index for the left subarray
        int idx2 = mid + 1; // Starting index for the right subarray
        int x = 0;        // Index for the merged array

        // Merge the two subarrays
        while (idx1 <= mid && idx2 <= ei) {
            if (arr[idx1] <= arr[idx2]) {
                merge[x] = arr[idx1];
                x++; idx1++;
            } else {
                merge[x] = arr[idx2];
                x++;idx2++;
            }
        }

        // Copy remaining elements of the left subarray
        while (idx1 <= mid) {
            merge[x] = arr[idx1];
            x++; idx1++;
        }

        // Copy remaining elements of the right subarray
        while (idx2 <= ei) {
            merge[x] = arr[idx2];
            x++; idx2++;
        }

        // Copy the merged elements back into the original array
        for (int i = 0, j = si; i < merge.length; i++, j++) {
            arr[j] = merge[i];
        }
    }

    // Method to divide the array into subarrays
    public static void divide(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;
        divide(arr, si, mid);      // Recursively divide the left half
        divide(arr, mid + 1, ei);  // Recursively divide the right half
        conquer(arr, si, mid, ei); // Merge the divided subarrays
    }

    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8};
        int n = arr.length;

        divide(arr, 0, n - 1); // Start the divide and conquer process

        // Print the sorted array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
