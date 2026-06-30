import java.util.Scanner;

public class MenuCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n--- MENU-DRIVEN CALCULATOR ---");
            System.out.println("1. ADDITION");
            System.out.println("2. SUBTRACTION");
            System.out.println("3. MULTIPLICATION");
            System.out.println("4. DIVISION");
            System.out.println("5. EXIT");
            System.out.print("ENTER YOUR CHOICE: ");

            if (input.hasNextInt()) {
                int choice = input.nextInt();
                
                if (choice == 5) {
                    System.out.println("EXITING. GOODBYE!");
                    running = false;
                    continue;
                }

                if (choice >= 1 && choice <= 4) {
                    System.out.print("ENTER FIRST NUMBER: ");
                    double num1 = input.nextDouble();
                    System.out.print("ENTER SECOND NUMBER: ");
                    double num2 = input.nextDouble();

                    switch (choice) {
                        case 1:
                            System.out.println("RESULT: " + (num1 + num2));
                            break;
                        case 2:
                            System.out.println("RESULT: " + (num1 - num2));
                            break;
                        case 3:
                            System.out.println("RESULT: " + (num1 * num2));
                            break;
                        case 4:
                            if (num2 != 0) {
                                System.out.println("RESULT: " + (num1 / num2));
                            } else {
                                System.out.println("ERROR: DIVISION BY ZERO!");
                            }
                            break;
                    }
                } else {
                    System.out.println("INVALID CHOICE. ENTER A NUMBER BETWEEN 1 AND 5.");
                }
            } else {
                System.out.println("INVALID INPUT. PLEASE ENTER A NUMBER.");
                input.next();
            }
        }
    }
}
