import java.util.ArrayList;
import java.util.Scanner;

class Book {
    private String id;
    private String title;
    private String author;
    private boolean isIssued;

    public Book(String id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isIssued = false;
    }

    public String getId() {
        return id;
    }

    public boolean isIssued() {
        return isIssued;
    }

    public void setIssued(boolean issued) {
        this.isIssued = issued;
    }

    @Override
    public String toString() {
        String status = isIssued ? "ISSUED" : "AVAILABLE";
        return "ID: " + id.toUpperCase() + 
               " \n| TITLE: " + title.toUpperCase() + 
               " \n| AUTHOR: " + author.toUpperCase() + 
               " \n| STATUS: " + status;
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n--- LIBRARY MANAGEMENT SYSTEM ---");
            System.out.println("1. ADD BOOK");
            System.out.println("2. VIEW ALL BOOKS");
            System.out.println("3. ISSUE BOOK");
            System.out.println("4. RETURN BOOK");
            System.out.println("5. EXIT");
            System.out.print("ENTER YOUR CHOICE: ");

            if (input.hasNextInt()) {
                int choice = input.nextInt();
                input.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("ENTER BOOK ID: ");
                        String id = input.nextLine().trim();
                        System.out.print("ENTER BOOK TITLE: ");
                        String title = input.nextLine().trim();
                        System.out.print("ENTER AUTHOR NAME: ");
                        String author = input.nextLine().trim();
                        
                        books.add(new Book(id, title, author));
                        System.out.println("BOOK ADDED SUCCESSFULLY!");
                        break;

                    case 2:
                        if (books.isEmpty()) {
                            System.out.println("NO BOOKS AVAILABLE IN THE LIBRARY.");
                        } else {
                            System.out.println("\n--- CURRENT LIBRARY BOOKS ---");
                            for (Book book : books) {
                                System.out.println(book);
                            }
                        }
                        break;

                    case 3:
                        if (books.isEmpty()) {
                            System.out.println("NO BOOKS AVAILABLE TO ISSUE.");
                            break;
                        }
                        System.out.print("ENTER BOOK ID TO ISSUE: ");
                        String issueId = input.nextLine().trim();
                        boolean issueFound = false;

                        for (Book book : books) {
                            if (book.getId().equalsIgnoreCase(issueId)) {
                                issueFound = true;
                                if (book.isIssued()) {
                                    System.out.println("BOOK IS ALREADY ISSUED.");
                                } else {
                                    book.setIssued(true);
                                    System.out.println("BOOK ISSUED SUCCESSFULLY!");
                                }
                                break;
                            }
                        }
                        if (!issueFound) {
                            System.out.println("BOOK WITH ID " + issueId.toUpperCase() + " NOT FOUND.");
                        }
                        break;

                    case 4:
                        if (books.isEmpty()) {
                            System.out.println("NO BOOKS REGISTERED IN THE SYSTEM.");
                            break;
                        }
                        System.out.print("ENTER BOOK ID TO RETURN: ");
                        String returnId = input.nextLine().trim();
                        boolean returnFound = false;

                        for (Book book : books) {
                            if (book.getId().equalsIgnoreCase(returnId)) {
                                returnFound = true;
                                if (!book.isIssued()) {
                                    System.out.println("THIS BOOK WAS NOT ISSUED.");
                                } else {
                                    book.setIssued(false);
                                    System.out.println("BOOK RETURNED SUCCESSFULLY!");
                                }
                                break;
                            }
                        }
                        if (!returnFound) {
                            System.out.println("BOOK WITH ID " + returnId.toUpperCase() + " NOT FOUND.");
                        }
                        break;

                    case 5:
                        System.out.println("EXITING SYSTEM. GOODBYE!");
                        running = false;
                        break;

                    default:
                        System.out.println("INVALID CHOICE. PLEASE ENTER A NUMBER BETWEEN 1 AND 5.");
                }
            } else {
                System.out.println("INVALID INPUT. PLEASE ENTER A VALID MENU NUMBER.");
                input.nextLine();
            }
        }

    }
}
