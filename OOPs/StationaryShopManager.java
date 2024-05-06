package OOPs;
import java.util.ArrayList;
import java.util.Scanner;

class StationaryItem {
    private String itemName;
    private double price;
    private int quantity;

    public StationaryItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Item: " + itemName + ", Price: $" + price + ", Quantity: " + quantity;
    }
}

class StationaryShop {
    private ArrayList<StationaryItem> inventory;

    public StationaryShop() {
        inventory = new ArrayList<>();
    }

    public void addItem(StationaryItem item) {
        inventory.add(item);
    }

    public void updateItem(String itemName, double price, int quantity) {
        for (StationaryItem item : inventory) {
            if (item.getItemName().equalsIgnoreCase(itemName)) {
                item.setPrice(price);
                item.setQuantity(quantity);
                System.out.println("Item updated successfully.");
                return;
            }
        }
        System.out.println("Item not found.");
    }

    public void deleteItem(String itemName) {
        for (StationaryItem item : inventory) {
            if (item.getItemName().equalsIgnoreCase(itemName)) {
                inventory.remove(item);
                System.out.println("Item deleted successfully.");
                return;
            }
        }
        System.out.println("Item not found.");
    }

    public void displayInventory() {
        if (inventory.isEmpty()) {
            System.out.println("Inventory is empty.");
            return;
        }
        System.out.println("Inventory:");
        for (StationaryItem item : inventory) {
            System.out.println(item);
        }
    }
}

public class StationaryShopManager {
    public static void main(String[] args) {
        StationaryShop shop = new StationaryShop();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Add item");
            System.out.println("2. Update item");
            System.out.println("3. Delete item");
            System.out.println("4. Display inventory");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter item name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    shop.addItem(new StationaryItem(name, price, quantity));
                    break;
                case 2:
                    System.out.print("Enter item name to update: ");
                    String itemNameToUpdate = scanner.nextLine();
                    System.out.print("Enter new price: ");
                    double newPrice = scanner.nextDouble();
                    System.out.print("Enter new quantity: ");
                    int newQuantity = scanner.nextInt();
                    shop.updateItem(itemNameToUpdate, newPrice, newQuantity);
                    break;
                case 3:
                    System.out.print("Enter item name to delete: ");
                    String itemNameToDelete = scanner.nextLine();
                    shop.deleteItem(itemNameToDelete);
                    break;
                case 4:
                    shop.displayInventory();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
