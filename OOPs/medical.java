package OOPs;
import java.util.*;

class Medicine {
    private String name;
    private int quantity;

    public Medicine(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public void updateQuantity(int quantity) {
        this.quantity += quantity;
    }

    public int getQuantity() {
        return quantity;
    }
}

class MedicalShop {
    private Map<String, Medicine> inventory;

    public MedicalShop() {
        inventory = new HashMap<>();
    }

    public void addMedicine(String name, int quantity) {
        if (inventory.containsKey(name)) {
            Medicine existingMedicine = inventory.get(name);
            existingMedicine.updateQuantity(quantity);
        } else {
            Medicine newMedicine = new Medicine(name, quantity);
            inventory.put(name, newMedicine);
        }
    }

    public void displayInventory() {
        System.out.println("Medicine Inventory:");
        for (Map.Entry<String, Medicine> entry : inventory.entrySet()) {
            System.out.println("Medicine: " + entry.getKey() + ", Quantity: " + entry.getValue().getQuantity());
        }
    }
}
public class medical {
    public static void main(String[] args) {
        MedicalShop medicalShop = new MedicalShop();

        medicalShop.addMedicine("Paracetamol", 100);
        medicalShop.addMedicine("Aspirin", 50);
        medicalShop.addMedicine("Ibuprofen", 75);

        medicalShop.displayInventory();
    }
    
}
