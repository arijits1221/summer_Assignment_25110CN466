import java.util.Scanner;

class Employee {
    String id;
    String name;

    public Employee(String id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class MiniEmployeeSystem {
    public static void main(String[] args) {
        Employee[] employees = new Employee[50];
        int count = 0;
        Scanner input = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n--- EMPLOYEE MANAGEMENT SYSTEM ---");
            System.out.println("1. ADD EMPLOYEE");
            System.out.println("2. VIEW EMPLOYEES");
            System.out.println("3. EXIT");
            System.out.print("ENTER CHOICE: ");

            if (input.hasNextInt()) {
                int choice = input.nextInt();
                input.nextLine();

                switch (choice) {
                    case 1:
                        if (count < 50) {
                            System.out.print("ENTER EMPLOYEE ID: ");
                            String id = input.nextLine().trim();
                            System.out.print("ENTER EMPLOYEE NAME: ");
                            String name = input.nextLine().trim();
                            employees[count] = new Employee(id, name);
                            count++;
                            System.out.println("EMPLOYEE ADDED.");
                        } else {
                            System.out.println("SYSTEM FULL.");
                        }
                        break;
                    case 2:
                        if (count == 0) {
                            System.out.println("NO EMPLOYEES REGISTERED.");
                        } else {
                            System.out.println("--- EMPLOYEE LIST ---");
                            for (int i = 0; i < count; i++) {
                                System.out.println("ID: " + employees[i].id.toUpperCase() + " \n| NAME: " + employees[i].name.toUpperCase());
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