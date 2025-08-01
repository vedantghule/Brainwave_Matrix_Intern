package hospital.management.inventory;

import java.util.ArrayList;
import java.util.Scanner;

public class InventoryManager {
    private ArrayList<InventoryItem> items = new ArrayList<>();
    private int nextId = 1;
    Scanner sc = new Scanner(System.in);

    public void addItem() {
        System.out.print("Enter Item Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Quantity: ");
        int qty = Integer.parseInt(sc.nextLine());
        System.out.print("Enter Unit (e.g. pieces, boxes, ml): ");
        String unit = sc.nextLine();

        InventoryItem item = new InventoryItem(nextId++, name, qty, unit);
        items.add(item);
        System.out.println("Item added to inventory.");
    }

    public void viewInventory() {
        if (items.isEmpty()) {
            System.out.println("Inventory is empty.");
        } else {
            for (InventoryItem item : items) {
                item.display();
            }
        }
    }

    public void updateStock() {
        System.out.print("Enter Item ID to update: ");
        int id = Integer.parseInt(sc.nextLine());
        InventoryItem found = null;

        for (InventoryItem item : items) {
            if (item.getItemId() == id) {
                found = item;
                break;
            }
        }

        if (found == null) {
            System.out.println("Item not found.");
            return;
        }

        System.out.print("Add or Reduce Stock? (add/reduce): ");
        String action = sc.nextLine();
        System.out.print("Enter quantity: ");
        int qty = Integer.parseInt(sc.nextLine());

        if (action.equalsIgnoreCase("add")) {
            found.addStock(qty);
            System.out.println("Stock updated.");
        } else if (action.equalsIgnoreCase("reduce")) {
            found.reduceStock(qty);
            System.out.println("Stock updated.");
        } else {
            System.out.println("Invalid action.");
        }
    }
}
