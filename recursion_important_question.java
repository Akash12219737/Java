// Write a Java program to implement a recursive function to compute the factorial of a non-negative integer entered by the user. Ensure to handle the base case and provide appropriate error checking.

// Your program should:

// Prompt the user to enter a non-negative integer.
// Use recursion to calculate the factorial of the entered integer.
// Display the computed factorial.
// Your program should terminate after displaying the result.

import java.util.Scanner;
public class recursion_important_question {
    static int factorial(int n) {
        
        if (n == 0 || n == 1) {
            return 1;
        }
        
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int num = scanner.nextInt();

        
        if (num < 0) {
            System.out.println("Error: Entered number is negative.");
        } else {
            
            int result = factorial(num);
            System.out.println("The factorial of " + num + " is: " + result);
        }

        scanner.close();
    }
    
}
