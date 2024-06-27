import java.util.Scanner;
class B extends A_01 {
    int c;

    void getdata() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the third number");
        c = sc.nextInt();
    }

    void display() {
        System.out.println("Total Addition: " + (a + b + c));  // Properly add a, b, and c
    }
}

public class Demo_01 {
    public static void main(String[] args) {
        B aa = new B();
        aa.input();      // Inputs for 'a' and 'b': 5 and 6
        aa.getdata();    // Input for 'c': 8
        aa.add();        // Should print "Addition: 11"
        aa.display();    // Should print "Total Addition: 19"
    }
}