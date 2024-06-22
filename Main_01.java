// package OOPs;

public class Main_01 {
    public static void main(String[] args) {

        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "gel";

        Pen pen2 = new Pen();
        pen2.color = "blue";
        pen2.type = "ballpoint";

        pen1.write();
        pen1.printColor();

        pen2.write();
        pen2.printColor();



        Student s1 = new Student();
        s1.name = "aman";
        s1.age = 24;

        s1.printInfo();


    }
}


class Student{
    String name ;
    int age;


    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}
class Pen {
    String color;
    String type;

    public void write() {
        System.out.println("writing something");
    }

    public void printColor() {
        System.out.println(this.color);
    }
}

