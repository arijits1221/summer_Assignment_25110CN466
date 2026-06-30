import java.util.Scanner;

public class TicketBookingSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean[] seats = new boolean[10];
        boolean running = true;

        while (running) {
            System.out.println("\n--- TICKET BOOKING SYSTEM ---");
            System.out.println("1. VIEW AVAILABLE SEATS");
            System.out.println("2. BOOK A TICKET");
            System.out.println("3. CANCEL A TICKET");
            System.out.println("4. EXIT");
            System.out.print("ENTER YOUR CHOICE: ");

            if (input.hasNextInt()) {
                int choice = input.nextInt();
                input.nextLine();

                switch (choice) {
                    case 1:
                        System.out.println("\n--- SEAT STATUS ---");
                        for (int i = 0; i < seats.length; i++) {
                            String status = seats[i] ? "BOOKED" : "AVAILABLE";
                            System.out.println("SEAT " + (i + 1) + ": " + status);
                        }
                        break;

                    case 2:
                        System.out.print("ENTER SEAT NUMBER TO BOOK (1-10): ");
                        if (input.hasNextInt()) {
                            int seatNum = input.nextInt();
                            input.nextLine();
                            
                            if (seatNum >= 1 && seatNum <= 10) {
                                if (!seats[seatNum - 1]) {
                                    seats[seatNum - 1] = true;
                                    System.out.println("TICKET BOOKED SUCCESSFULLY FOR SEAT " + seatNum + "!");
                                } else {
                                    System.out.println("SORRY, SEAT " + seatNum + " IS ALREADY BOOKED.");
                                }
                            } else {
                                System.out.println("INVALID SEAT NUMBER. CHOOSE BETWEEN 1 AND 10.");
                            }
                        } else {
                            System.out.println("INVALID INPUT. ENTER A NUMBER.");
                            input.next();
                        }
                        break;

                    case 3:
                        System.out.print("ENTER SEAT NUMBER TO CANCEL (1-10): ");
                        if (input.hasNextInt()) {
                            int seatNum = input.nextInt();
                            input.nextLine();
                            
                            if (seatNum >= 1 && seatNum <= 10) {
                                if (seats[seatNum - 1]) {
                                    seats[seatNum - 1] = false;
                                    System.out.println("TICKET CANCELED SUCCESSFULLY FOR SEAT " + seatNum + "!");
                                } else {
                                    System.out.println("SEAT " + seatNum + " IS NOT YET BOOKED.");
                                }
                            } else {
                                System.out.println("INVALID SEAT NUMBER. CHOOSE BETWEEN 1 AND 10.");
                            }
                        } else {
                            System.out.println("INVALID INPUT. ENTER A NUMBER.");
                            input.next();
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