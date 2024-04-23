package OOPs;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Student {
    private String name;
    private String rollNumber;
    private Map<String, Integer> subjectMarks;

    public Student(String name, String rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.subjectMarks = new HashMap<>();
    }

    public void addSubjectMark(String subject, int mark) {
        subjectMarks.put(subject, mark);
    }

    public Map<String, Integer> getSubjectMarks() {
        return subjectMarks;
    }

    public String getName() {
        return name;
    }

    public String getRollNumber() {
        return rollNumber;
    }
}

class Subject {
    private String name;

    public Subject(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class ResultManagementSystem {
    private List<Student> students;
    private List<Subject> subjects;

    public ResultManagementSystem() {
        students = new ArrayList<>();
        subjects = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addSubject(Subject subject) {
        subjects.add(subject);
    }

    public void printResult() {
        for (Student student : students) {
            System.out.println("Name: " + student.getName());
            System.out.println("Roll Number: " + student.getRollNumber());
            System.out.println("Subjects:");
            for (Map.Entry<String, Integer> entry : student.getSubjectMarks().entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
            System.out.println("-------------------------------");
        }
    }
}

public class result {
    public static void main(String[] args) {
        ResultManagementSystem rms = new ResultManagementSystem();

        Subject math = new Subject("Math");
        Subject physics = new Subject("Physics");
        rms.addSubject(math);
        rms.addSubject(physics);

        Student student1 = new Student("John", "1");
        student1.addSubjectMark("Math", 85);
        student1.addSubjectMark("Physics", 78);

        Student student2 = new Student("Alice", "2");
        student2.addSubjectMark("Math", 90);
        student2.addSubjectMark("Physics", 82);

        rms.addStudent(student1);
        rms.addStudent(student2);

        rms.printResult();
    }
}

public class result {
    
}
