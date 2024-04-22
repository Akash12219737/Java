package OOPs;
import java.util.ArrayList;
import java.util.List;

class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}

class Customer {
    private String name;
    private String email;

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
    private Customer customer;
    private List<Product> products;

    public Order(Customer customer) {
        this.customer = customer;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void displayOrderDetails() {
        System.out.println("Customer: " + customer.getName());
        System.out.println("Email: " + customer.getEmail());
        System.out.println("Ordered Products:");
        for (Product product : products) {
            System.out.println("- " + product.getName() + " | Price: $" + product.getPrice() + " | Quantity: " + product.getQuantity());
        }
    }
}


public class ECommerceSystem {
    public static void main(String[] args) {
        Product laptop = new Product("Laptop", 999.99, 1);
        Product phone = new Product("Phone", 699.99, 2);

        Customer customer = new Customer("John Doe", "john@example.com");

        Order order = new Order(customer);
        order.addProduct(laptop);
        order.addProduct(phone);

        System.out.println("Order Details:");
        order.displayOrderDetails();
    }
}
