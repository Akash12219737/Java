package OOPs;

import java.util.ArrayList;
import java.util.List;

// Car class representing individual cars in the inventory
class Car {
    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return year + " " + make + " " + model;
    }
}

// Main class to demonstrate the functionality of the car rental system
public class CarRentalSystem {
    public static void main(String[] args) {
        // Create a list to store cars in the inventory
        List<Car> inventory = new ArrayList<>();

        // Add cars to the inventory
        inventory.add(new Car("Toyota", "Camry", 2020));
        inventory.add(new Car("Honda", "Civic", 2019));
        inventory.add(new Car("Ford", "Focus", 2018));

        // Display the cars in the inventory
        System.out.println("Available Cars:");
        for (Car car : inventory) {
            System.out.println(car);
        }
    }
}
