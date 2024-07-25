// package Sorting_Question;

public class Ques_02 {
    static void sortFruits(String[] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j].compareTo(a[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element
            String temp = a[minIndex];
            a[minIndex] = a[i];
            a[i] = temp;
        }
    }

    public static void main(String[] args) {
        String[] fruits = {"mango", "papaya", "kivi", "apple"};
        sortFruits(fruits);
        for (String fruit : fruits) {
            System.out.print(fruit + "  ");
        }
    }
}
