import java.util.ArrayList;
import java.util.Scanner;

public class ArrayOperationsSystem {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n--- ARRAY OPERATIONS SYSTEM ---");
            System.out.println("1. ADD ELEMENT");
            System.out.println("2. REMOVE ELEMENT BY INDEX");
            System.out.println("3. DISPLAY ARRAY");
            System.out.println("4. EXIT");
            System.out.print("ENTER YOUR CHOICE: ");

            if (input.hasNextInt()) {
                int choice = input.nextInt();
                
                switch (choice) {
                    case 1:
                        System.out.print("ENTER NUMBER TO ADD: ");
                        if (input.hasNextInt()) {
                            numbers.add(input.nextInt());
                            System.out.println("ELEMENT ADDED SUCCESSFULLY.");
                        } else {
                            System.out.println("INVALID NUMBER.");
                            input.next();
                        }
                        break;
                    case 2:
                        System.out.print("ENTER INDEX TO REMOVE: ");
                        if (input.hasNextInt()) {
                            int index = input.nextInt();
                            if (index >= 0 && index < numbers.size()) {
                                numbers.remove(index);
                                System.out.println("ELEMENT REMOVED SUCCESSFULLY.");
                            } else {
                                System.out.println("INVALID INDEX.");
                            }
                        } else {
                            System.out.println("INVALID INPUT.");
                            input.next();
                        }
                        break;
                    case 3:
                        if (numbers.isEmpty()) {
                            System.out.println("ARRAY IS CURRENTLY EMPTY.");
                        } else {
                            System.out.println("ARRAY ELEMENTS: " + numbers);
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
                System.out.println("INVALID INPUT. PLEASE ENTER A NUMBER.");
                input.next();
            }
        }
    }
}