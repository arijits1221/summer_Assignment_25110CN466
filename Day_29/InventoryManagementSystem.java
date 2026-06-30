import java.util.ArrayList;
import java.util.Scanner;

class InventoryItem {
    private String id;
    private String name;
    private int quantity;

    public InventoryItem(String id, String name, int quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public void addQuantity(int amount) {
        this.quantity += amount;
    }

    @Override
    public String toString() {
        return "ITEM ID: " + id.toUpperCase() + 
               " | NAME: " + name.toUpperCase() + 
               " | QUANTITY IN STOCK: " + quantity;
    }
}

public class InventoryManagementSystem {
    public static void main(String[] args) {
        ArrayList<InventoryItem> inventory = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n--- INVENTORY MANAGEMENT SYSTEM ---");
            System.out.println("1. ADD NEW ITEM");
            System.out.println("2. UPDATE STOCK QUANTITY");
            System.out.println("3. VIEW FULL INVENTORY");
            System.out.println("4. EXIT");
            System.out.print("ENTER YOUR CHOICE: ");

            if (input.hasNextInt()) {
                int choice = input.nextInt();
                input.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("ENTER ITEM ID: ");
                        String id = input.nextLine().trim();
                        System.out.print("ENTER ITEM NAME: ");
                        String name = input.nextLine().trim();
                        System.out.print("ENTER INITIAL QUANTITY: ");
                        
                        if (input.hasNextInt()) {
                            int qty = input.nextInt();
                            if (qty >= 0) {
                                inventory.add(new InventoryItem(id, name, qty));
                                System.out.println("ITEM ADDED SUCCESSFULLY!");
                            } else {
                                System.out.println("QUANTITY CANNOT BE NEGATIVE.");
                            }
                        } else {
                            System.out.println("INVALID QUANTITY.");
                            input.nextLine();
                        }
                        break;
                    case 2:
                        if (inventory.isEmpty()) {
                            System.out.println("INVENTORY IS EMPTY. NOTHING TO UPDATE.");
                            break;
                        }
                        System.out.print("ENTER ITEM ID TO UPDATE: ");
                        String searchId = input.nextLine().trim();
                        boolean found = false;
                        
                        for (InventoryItem item : inventory) {
                            if (item.getId().equalsIgnoreCase(searchId)) {
                                System.out.print("ENTER QUANTITY TO ADD (OR SUBTRACT USING NEGATIVE): ");
                                if (input.hasNextInt()) {
                                    item.addQuantity(input.nextInt());
                                    System.out.println("STOCK UPDATED SUCCESSFULLY!");
                                } else {
                                    System.out.println("INVALID AMOUNT.");
                                    input.nextLine();
                                }
                                found = true;
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println("ITEM WITH ID " + searchId.toUpperCase() + " NOT FOUND.");
                        }
                        break;
                    case 3:
                        if (inventory.isEmpty()) {
                            System.out.println("NO ITEMS FOUND IN INVENTORY.");
                        } else {
                            System.out.println("\n--- CURRENT INVENTORY ---");
                            for (InventoryItem item : inventory) {
                                System.out.println(item);
                            }
                        }
                        break;
                    case 4:
                        System.out.println("EXITING SYSTEM. GOODBYE!");
                        running = false;
                        break;
                    default:
                        System.out.println("INVALID CHOICE. ENTER A NUMBER BETWEEN 1 AND 4.");
                }
            } else {
                System.out.println("INVALID INPUT. PLEASE ENTER A MENU NUMBER.");
                input.nextLine();
            }
        }
    }
}