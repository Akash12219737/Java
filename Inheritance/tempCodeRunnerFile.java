class Animal {
    String species;

    public Animal(String species) {
        this.species = species;
    }

    public void makeSound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    String name;

    public Dog(String name) {
        super("Canine");
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy");
        System.out.println("Species: " + myDog.species);
        System.out.println("Name: " + myDog.name);
        myDog.makeSound();
    }
}
