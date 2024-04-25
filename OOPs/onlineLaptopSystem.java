package OOPs;
import java.util.ArrayList;
import java.util.List;

class Laptop {
    private String brand;
    private String model;
    private double price;

    public Laptop(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }
}

class ShoppingCart {
    private List<Laptop> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public void addItem(Laptop laptop) {
        items.add(laptop);
    }

    public List<Laptop> getItems() {
        return items;
    }

    public double calculateTotal() {
        double total = 0;
        for (Laptop laptop : items) {
            total += laptop.getPrice();
        }
        return total;
    }
}
public class onlineLaptopSystem {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("Dell", "XPS 13", 1200.0);
        Laptop laptop2 = new Laptop("Apple", "MacBook Pro", 2000.0);

        ShoppingCart cart = new ShoppingCart();
        cart.addItem(laptop1);
        cart.addItem(laptop2);

        System.out.println("Shopping Cart:");
        for (Laptop laptop : cart.getItems()) {
            System.out.println(laptop.getBrand() + " " + laptop.getModel() + " - $" + laptop.getPrice());
        }

        System.out.println("Total: $" + cart.calculateTotal());
    }
}
