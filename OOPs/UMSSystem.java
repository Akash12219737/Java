package OOPs;

import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private String name;
    private String studentId;

    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student Name: " + name + ", Student ID: " + studentId;
    }
}

class UniversityManagementSystem {
    private ArrayList<Student> students;

    public UniversityManagementSystem() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayStudents() {
        System.out.println("List of Students:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

public class UMSSystem {
    public static void main(String[] args) {
        UniversityManagementSystem ums = new UniversityManagementSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String studentName = scanner.nextLine();
                    System.out.print("Enter student ID: ");
                    String studentId = scanner.nextLine();
                    ums.addStudent(new Student(studentName, studentId));
                    break;
                case 2:
                    ums.displayStudents();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
