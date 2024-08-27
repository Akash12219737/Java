// This is a public class named Student_01
public class Student_01 {
    // This is a public static nested class named Student
    public static class Student {
        // This is a String variable to store the student's name
        String name;
        // This is an integer variable to store the student's roll number
        int rno;
        // This is a double variable to store the student's percentage
        double percent;
    }

    // This is a public static method to change a string
    public static void Changestrings(Student s) {
        // This method changes the name of the student object passed as a parameter
        s.name = "Rohan";
    }

    // This is a public static method to change an integer
    public static void change(int x) {
        // This method changes the value of the local variable x, but it does not affect the original value passed as a parameter
        x = 7; 
        return;
    }

    // This is the main method where the program starts execution
    public static void main(String[] args) {
        // Create a new Student object named x
        Student x = new Student();
        // Initialize the properties of x
        x.name = "Akash";
        x.rno = 54;
        x.percent = 85.5;
        // Print the name of x
        System.out.println(x.name);

        // Create a new Student object named s
        Student s = new Student();
        // Initialize the properties of s
        s.name = "Rahul";
        s.rno = 55;
        s.percent = 59;
        // Print the name of s
        System.out.println(s.name);

        // Update the name of s
        s.name = "Raj";
        // Print the updated name of s
        System.out.println(s.name);

        // Declare an integer variable y and initialize it with 5
        int y = 5;
        // Print the value of y
        System.out.println(y);
        // Call the change method to try to change the value of y
        change(y); 
        // Print the value of y again to show that it did not change
        System.out.println(y);

        // Create a new Student object named s1
        Student s1 = new Student();
        // Initialize the properties of s1
        s1.name = "Mohan";
        s1.rno = 56;
        s1.percent = 88.5;
        // Print the name of s1
        System.out.println(s1.name);
        // Call the Changestrings method to change the name of s1
        Changestrings(s1);
        // Print the updated name of s1
        System.out.println(s1.name);
    }
}