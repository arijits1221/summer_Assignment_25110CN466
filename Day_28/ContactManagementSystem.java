import java.util.ArrayList;
import java.util.Scanner;

class Contact {
    private String name;
    private String phone;
    private String email;

    public Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "NAME: " + name.toUpperCase() + 
               " | PHONE: " + phone.toUpperCase() + 
               " | EMAIL: " + email.toUpperCase();
    }
}

public class ContactManagementSystem {
    public static void main(String[] args) {
        ArrayList<Contact> contacts = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n--- CONTACT MANAGEMENT SYSTEM ---");
            System.out.println("1. ADD CONTACT");
            System.out.println("2. VIEW ALL CONTACTS");
            System.out.println("3. SEARCH CONTACT BY NAME");
            System.out.println("4. EXIT");
            System.out.print("ENTER YOUR CHOICE: ");

            if (input.hasNextInt()) {
                int choice = input.nextInt();
                input.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("ENTER CONTACT NAME: ");
                        String name = input.nextLine().trim();
                        System.out.print("ENTER PHONE NUMBER: ");
                        String phone = input.nextLine().trim();
                        System.out.print("ENTER EMAIL ADDRESS: ");
                        String email = input.nextLine().trim();
                        
                        contacts.add(new Contact(name, phone, email));
                        System.out.println("CONTACT ADDED SUCCESSFULLY!");
                        break;

                    case 2:
                        if (contacts.isEmpty()) {
                            System.out.println("NO CONTACTS FOUND.");
                        } else {
                            System.out.println("\n--- CURRENT CONTACTS ---");
                            for (Contact contact : contacts) {
                                System.out.println(contact);
                            }
                        }
                        break;

                    case 3:
                        if (contacts.isEmpty()) {
                            System.out.println("NO CONTACTS AVAILABLE TO SEARCH.");
                            break;
                        }
                        System.out.print("ENTER CONTACT NAME TO SEARCH: ");
                        String searchName = input.nextLine().trim();
                        boolean found = false;

                        for (Contact contact : contacts) {
                            if (contact.getName().equalsIgnoreCase(searchName)) {
                                System.out.println("CONTACT FOUND: " + contact);
                                found = true;
                                break;
                            }
                        }
                        
                        if (!found) {
                            System.out.println("CONTACT WITH NAME " + searchName.toUpperCase() + " NOT FOUND.");
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
                System.out.println("INVALID INPUT. ENTER A VALID MENU NUMBER.");
                input.nextLine();
            }
        }
    }
}
