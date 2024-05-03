class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("Animal sound");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }

    public String getBreed() {
        return breed;
    }
}

class Cat extends Animal {
    private String color;

    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }

    public String getColor() {
        return color;
    }
}

public class AnimalDemo {
    public static void main(String[] args) {
        Animal animal1 = new Dog("Buddy", 3, "Labrador");
        Animal animal2 = new Cat("Whiskers", 5, "White");

        System.out.println(animal1.getName() + " is a " + ((Dog) animal1).getBreed() + " aged " + animal1.getAge());
        animal1.makeSound();

        System.out.println(animal2.getName() + " is a " + ((Cat) animal2).getColor() + " cat aged " + animal2.getAge());
        animal2.makeSound();
    }
}
