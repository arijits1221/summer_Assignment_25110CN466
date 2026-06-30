import java.util.Scanner;

public class StudentRecordSystem {
    public static void main(String[] args) {
        String[] names = new String[100];
        int[] rollNos = new int[100];
        int count = 0;
        Scanner input = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n--- STUDENT RECORD SYSTEM ---");
            System.out.println("1. ADD STUDENT");
            System.out.println("2. VIEW RECORDS");
            System.out.println("3. EXIT");
            System.out.print("ENTER CHOICE: ");

            if (input.hasNextInt()) {
                int choice = input.nextInt();
                input.nextLine();

                switch (choice) {
                    case 1:
                        if (count < 100) {
                            System.out.print("ENTER STUDENT NAME: ");
                            names[count] = input.nextLine().trim();
                            System.out.print("ENTER ROLL NUMBER: ");
                            if (input.hasNextInt()) {
                                rollNos[count] = input.nextInt();
                                count++;
                                System.out.println("RECORD ADDED SUCCESSFULLY!");
                            } else {
                                System.out.println("INVALID ROLL NUMBER.");
                            }
                            input.nextLine();
                        } else {
                            System.out.println("STORAGE FULL.");
                        }
                        break;
                    case 2:
                        if (count == 0) {
                            System.out.println("NO RECORDS FOUND.");
                        } else {
                            System.out.println("--- STUDENT RECORDS ---");
                            for (int i = 0; i < count; i++) {
                                System.out.println("ROLL NO: " + rollNos[i] + " \n| NAME: " + names[i].toUpperCase());
                            }
                        }
                        break;
                    case 3:
                        System.out.println("EXITING. GOODBYE!");
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
