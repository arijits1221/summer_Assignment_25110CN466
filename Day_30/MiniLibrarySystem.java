import java.util.Scanner;

public class MiniLibrarySystem {
    public static void main(String[] args) {
        String[] books = new String[50];
        int count = 0;
        Scanner input = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n--- MINI LIBRARY SYSTEM ---");
            System.out.println("1. ADD BOOK");
            System.out.println("2. VIEW BOOKS");
            System.out.println("3. EXIT");
            System.out.print("ENTER CHOICE: ");

            if (input.hasNextInt()) {
                int choice = input.nextInt();
                input.nextLine();

                switch (choice) {
                    case 1:
                        if (count < 50) {
                            System.out.print("ENTER BOOK TITLE: ");
                            books[count] = input.nextLine().trim().toUpperCase();
                            count++;
                            System.out.println("BOOK ADDED!");
                        } else {
                            System.out.println("LIBRARY FULL.");
                        }
                        break;
                    case 2:
                        if (count == 0) {
                            System.out.println("NO BOOKS AVAILABLE.");
                        } else {
                            System.out.println("--- BOOK LIST ---");
                            for (int i = 0; i < count; i++) {
                                System.out.println((i + 1) + ". " + books[i]);
                            }
                        }
                        break;
                    case 3:
                        System.out.println("EXITING SYSTEM.");
                        running = false;
                        break;
                    default:
                        System.out.println("INVALID CHOICE.");
                }
            } else {
                System.out.println("INVALID INPUT.");
                input.nextLine();
            }
        }
    }
}
