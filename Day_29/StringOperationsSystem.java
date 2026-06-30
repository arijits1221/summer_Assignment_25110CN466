import java.util.Scanner;

public class StringOperationsSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n--- STRING OPERATIONS SYSTEM ---");
            System.out.println("1. FIND STRING LENGTH");
            System.out.println("2. REVERSE A STRING");
            System.out.println("3. MERGE TWO STRINGS");
            System.out.println("4. EXIT");
            System.out.print("ENTER YOUR CHOICE: ");

            if (input.hasNextInt()) {
                int choice = input.nextInt();
                input.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("ENTER A STRING: ");
                        String str1 = input.nextLine();
                        System.out.println("LENGTH OF STRING: " + str1.length());
                        break;
                    case 2:
                        System.out.print("ENTER A STRING: ");
                        String str2 = input.nextLine();
                        String reversed = new StringBuilder(str2).reverse().toString();
                        System.out.println("REVERSED STRING: " + reversed.toUpperCase());
                        break;
                    case 3:
                        System.out.print("ENTER FIRST STRING: ");
                        String s1 = input.nextLine();
                        System.out.print("ENTER SECOND STRING: ");
                        String s2 = input.nextLine();
                        System.out.println("MERGED RESULT: " + (s1 + s2).toUpperCase());
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
                input.nextLine();
            }
        }
    }
}
