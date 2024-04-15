package OOPs;

class Employee{
    int id;
    int salary;
    String name;
    public void printdetails(){
        System.out.println("My id is "+id);
        System.out.println("and name is "+name);
    }
    public int getsalary(){
        return salary;
    }
}

public class OOPs_1 {
    public static void main(String[] args) {
        Employee akash = new Employee();
        Employee riya = new Employee();
        akash.id = 2635;
        akash.name = "coderarmy";
        akash.salary=35000;
        riya.id = 236498;
        riya.name = "Riya khandwal";

        // System.out.println(akash.id);
        // System.out.println(akash.name);
        akash.printdetails();
        riya.printdetails();
        int salary = akash.getsalary();
        System.out.println(salary);

    }
    
}
