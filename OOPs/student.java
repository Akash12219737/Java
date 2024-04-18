package OOPs;

public class student {
    private String name;
    private int age;
    private String grade;

    public student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGrade() {
        return grade;
    }

    public void promote() {
        if (grade.equals("12th")) {
            System.out.println("This student has graduated!");
        } else {
            int currentGrade = Integer.parseInt(grade.substring(0, grade.indexOf("th")));
            currentGrade++;
            grade = currentGrade + "th";
            System.out.println(name + " has been promoted to grade " + grade);
        }
    }

    public static void main(String[] args) {
        student student1 = new student("Alice", 16, "10th");

        System.out.println("Student Details:");
        System.out.println("Name: " + student1.getName());
        System.out.println("Age: " + student1.getAge());
        System.out.println("Grade: " + student1.getGrade());

        student1.promote();
    }
}
