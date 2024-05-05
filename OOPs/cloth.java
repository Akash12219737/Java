class ClothingItem {
    String name;
    double price;

    public ClothingItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class Customer {
    String name;
    String email;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}

class Order {
    Customer customer;
    List<ClothingItem> items;

    public Order(Customer customer, List<ClothingItem> items) {
        this.customer = customer;
        this.items = items;
    }

    
    public double calculateTotal() {
        double total = 0;
        for (ClothingItem item : items) {
            total += item.getPrice();
        }
        return total;
    }
}

public class main {
    public static void main(String[] args) {
        
        ClothingItem shirt = new ClothingItem("Shirt", 25.99);
        ClothingItem pants = new ClothingItem("Pants", 35.99);
        ClothingItem shoes = new ClothingItem("Shoes", 49.99);

        
        Customer customer = new Customer("John Doe", "john@example.com");

       
        List<ClothingItem> items = new ArrayList<>();
        items.add(shirt);
        items.add(pants);
        items.add(shoes);
        Order order = new Order(customer, items);

        
        System.out.println("Order for: " + order.customer.getName());
        System.out.println("Items:");
        for (ClothingItem item : order.items) {
            System.out.println("- " + item.getName() + ": $" + item.getPrice());
        }
        System.out.println("Total: $" + order.calculateTotal());
    }
}
