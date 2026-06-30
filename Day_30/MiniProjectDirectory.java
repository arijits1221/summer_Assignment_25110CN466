import java.util.Scanner;

public class MiniProjectDirectory {
    static String[] names = new String[100];
    static String[] phones = new String[100];
    static int recordCount = 0;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;
        
        while (running) {
            displayMenu();
            int choice = getChoice();
            
            switch (choice) {
                case 1:
                    addRecord();
                    break;
                case 2:
                    viewRecords();
                    break;
                case 3:
                    System.out.println("EXITING PROJECT. GOODBYE!");
                    running = false;
                    break;
                default:
                    System.out.println("INVALID CHOICE.");
            }
        }
    }

    static void displayMenu() {
        System.out.println("\n--- DIRECTORY MINI PROJECT ---");
        System.out.println("1. ADD CONTACT");
        System.out.println("2. VIEW CONTACTS");
        System.out.println("3. EXIT");
        System.out.print("ENTER CHOICE: ");
    }

    static int getChoice() {
        if (scanner.hasNextInt()) {
            int choice = scanner.nextInt();
            scanner.nextLine();
            return choice;
        } else {
            scanner.nextLine();
            return -1;
        }
    }

    static void addRecord() {
        if (recordCount < 100) {
            System.out.print("ENTER NAME: ");
            names[recordCount] = scanner.nextLine().trim().toUpperCase();
            System.out.print("ENTER PHONE NUMBER: ");
            phones[recordCount] = scanner.nextLine().trim().toUpperCase();
            recordCount++;
            System.out.println("CONTACT SAVED.");
        } else {
            System.out.println("DIRECTORY FULL.");
        }
    }

    static void viewRecords() {
        if (recordCount == 0) {
            System.out.println("NO CONTACTS TO DISPLAY.");
        } else {
            System.out.println("--- SAVED CONTACTS ---");
            for (int i = 0; i < recordCount; i++) {
                System.out.println("NAME: " + names[i] + " | PHONE: " + phones[i]);
            }
        }
    }
}