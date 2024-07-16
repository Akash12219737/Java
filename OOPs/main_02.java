import java.util.Scanner;

class Add {
    int a;
    int b;

    // Default constructor
    Add() {
        a = 0;
        b = 0;
    }

    // Parameterized constructor
    Add(int x, int y) {
        a = x;
        b = y;
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        a = sc.nextInt();  // Assign to class variable a
        System.out.println("Enter 2nd number: ");
        b = sc.nextInt();  // Assign to class variable b
    }

    void display() {
        System.out.println("a=" + a + " , b=" + b);
    }

    void output() {
        int c = a + b;
        System.out.println("Addition = " + c);
    }
}

public class main_02 {
    public static void main(String[] args) {
        Add aa = new Add();
        aa.display();
        aa.input();
        aa.output();
        Add bb = new Add(5, 23);  // paramertrise constructor
        bb.display();
    }
}
