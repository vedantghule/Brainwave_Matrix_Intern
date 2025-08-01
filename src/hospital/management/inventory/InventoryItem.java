package hospital.management.inventory;

public class InventoryItem {
    private int itemId;
    private String itemName;
    private int quantity;
    private String unit;

    public InventoryItem(int itemId, String itemName, int quantity, String unit) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.quantity = quantity;
        this.unit = unit;
    }

    public int getItemId() {
        return itemId;
    }

    public void addStock(int amount) {
        this.quantity += amount;
    }

    public void reduceStock(int amount) {
        if (quantity >= amount) {
            this.quantity -= amount;
        } else {
            System.out.println("Not enough stock to remove.");
        }
    }

    public void display() {
        System.out.println("Item ID: " + itemId +
                ", Name: " + itemName +
                ", Quantity: " + quantity + " " + unit);
    }
}
