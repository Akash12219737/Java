package Inheritance;


// Vehicle.java
public class Vehicle {
    protected String brand;
    protected int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }
}

// Car.java
public class Car extends Vehicle {
    private int numberOfSeats;

    public Car(String brand, int year, int numberOfSeats) {
        super(brand, year);
        this.numberOfSeats = numberOfSeats;
    }

    public void displayCarInfo() {
        super.displayInfo();
        System.out.println("Number of Seats: " + numberOfSeats);
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 2022, 5);
        myCar.displayCarInfo();
    }
}
