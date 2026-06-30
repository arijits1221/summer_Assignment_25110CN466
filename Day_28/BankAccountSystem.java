import java.util.ArrayList;
import java.util.Scanner;

class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    @Override
    public String toString() {
        return "ACCOUNT NUMBER: " + accountNumber.toUpperCase() + 
               " \n| HOLDER: " + accountHolder.toUpperCase() + 
               " \n| BALANCE: $" + balance;
    }
}

public class BankAccountSystem {
    public static void main(String[] args) {
        ArrayList<BankAccount> accounts = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n--- BANK ACCOUNT SYSTEM ---");
            System.out.println("1. CREATE ACCOUNT");
            System.out.println("2. VIEW YOUR ACCOUNT");
            System.out.println("3. EXIT");
            System.out.print("ENTER YOUR CHOICE: ");

            if (input.hasNextInt()) {
                int choice = input.nextInt();
                input.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("ENTER NEW ACCOUNT NUMBER: ");
                        String accNum = input.nextLine().trim();
                        System.out.print("ENTER ACCOUNT HOLDER NAME: ");
                        String name = input.nextLine().trim();
                        System.out.print("ENTER INITIAL DEPOSIT: ");
                        
                        if (input.hasNextDouble()) {
                            double initialDeposit = input.nextDouble();
                            input.nextLine();
                            if (initialDeposit >= 0) {
                                accounts.add(new BankAccount(accNum, name, initialDeposit));
                                System.out.println("ACCOUNT CREATED SUCCESSFULLY!");
                            } else {
                                System.out.println("INVALID AMOUNT. INITIAL DEPOSIT CANNOT BE NEGATIVE.");
                            }
                        } else {
                            System.out.println("INVALID INPUT. ENTER A VALID NUMBER.");
                            input.nextLine();
                        }
                        break;

                    case 2:
                        if (accounts.isEmpty()) {
                            System.out.println("NO ACCOUNTS FOUND IN THE SYSTEM.");
                        } else {
                            System.out.print("ENTER ACCOUNT NUMBER TO VIEW: ");
                            String searchAccNum = input.nextLine().trim();
                            boolean found = false;

                            for (BankAccount acc : accounts) {
                                if (acc.getAccountNumber().equalsIgnoreCase(searchAccNum)) {
                                    System.out.println("\n--- ACCOUNT DETAILS ---");
                                    System.out.println(acc);
                                    found = true;
                                    break;
                                }
                            }
                            
                            if (!found) {
                                System.out.println("ACCOUNT WITH NUMBER " + searchAccNum.toUpperCase() + " NOT FOUND.");
                            }
                        }
                        break;

                    case 3:
                        System.out.println("EXITING SYSTEM. GOODBYE!");
                        running = false;
                        break;

                    default:
                        System.out.println("INVALID CHOICE. ENTER A NUMBER BETWEEN 1 AND 3.");
                }
            } else {
                System.out.println("INVALID INPUT. ENTER A VALID MENU NUMBER.");
                input.nextLine();
            }
        }
    }
}