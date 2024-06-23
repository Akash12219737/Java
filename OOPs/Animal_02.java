public class Animal_02 {
    
    public static void main(String[] args) {
         Dog d1 = new Dog();
         d1.name = "leo";
         d1.bark();
         d1.walk();

         Dog d2 = new Dog();
         d2.name="Tommy";
         d2.walk();


         complex num1 = new complex();
        num1.a = 3;
        num1.b = 4;
        num1.print();
    }
}

class Dog {
    String name;
    int age;
    String color;
    void bark(){
        System.out.println(name + " is barking");
    }
    void walk(){
        System.out.println(name+" is walking");
    }
}
class complex{
    int a ,b;
    void print(){
        System.out.println(a+ " + "+b+"i");
    }
}