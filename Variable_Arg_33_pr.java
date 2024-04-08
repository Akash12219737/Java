
// Certainly! Let's make the question a bit more challenging:

// Question:

// Write a Java program to implement a method minMaxAverage that accepts a variable number of integer arguments and returns an array of three elements. The first element should represent the minimum value among the arguments, the second element should represent the maximum value among the arguments, and the third element should represent the average value of all the arguments. If no arguments are passed, the method should return null.

// Your task is to implement the minMaxAverage method as described above and then complete the main method to test its functionality by printing the minimum value, maximum value, and average value among the provided arguments.

// Your implementation should be able to handle the following test cases:

// minMaxAverage(5, 8, 3, 12) should return an array {3, 12, 7}.
// minMaxAverage(17, 9, 4) should return an array {4, 17, 10}.
// minMaxAverage() should return null.
public class Variable_Arg_33_pr {
    static double[] minMaxAverage(int... numbers) {
        if (numbers.length == 0) {
            return null;
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
            sum += num;
        }

        double average = (double) sum / numbers.length;

        return new double[]{min, max, average};
    }

    public static void main(String[] args) {
        // Test cases
        double[] result1 = minMaxAverage(5, 8, 3, 12);
        System.out.println("Minimum: " + result1[0] + ", Maximum: " + result1[1] + ", Average: " + result1[2]);

        double[] result2 = minMaxAverage(17, 9, 4);
        System.out.println("Minimum: " + result2[0] + ", Maximum: " + result2[1] + ", Average: " + result2[2]);

        double[] result3 = minMaxAverage();
        if (result3 == null) {
            System.out.println("No arguments provided.");
        }
    }
}
