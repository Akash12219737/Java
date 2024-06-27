// package OOPs 2;

public class Car extends Vehicle {
    void startCar() {
        super.start();  // Call the start method from the Vehicle class
        System.out.println("Car model: " + model + ", Wheel count: " + wheelcount);
    }
    Car(){
        System.out.println("car is being created");
    }

    public static void main(String[] args) {
        Car obj = new Car();
        obj.wheelcount = 4;
        obj.model = "I20";  
        obj.startCar();  // Call the startCar method to use super
    }
}
