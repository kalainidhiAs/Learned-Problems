package zoho.ROUND3.TaxiBookingSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int taxiCount = 4;
            Taxi[] taxis = new Taxi[taxiCount];

            for (int i = 0; i < taxiCount; i++) {
                taxis[i] = new Taxi();
            }

            Booking[] bookings = new Booking[20];
            int bookingId = 0;

            while (true) {
                System.out.println("______Taxi Booking System______");
                System.out.println("1. New Booking");
                System.out.println("2. View All Bookings");
                System.out.println("3. View Taxi Details");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                int choice = in.nextInt();

                switch (choice) {
                    case 1:
                        int assignedTaxiId = createBooking(bookings, bookingId, taxis, in);
                        if (assignedTaxiId != -1) {
                            System.out.println("Booking created successfully. Assigned Taxi ID: " + assignedTaxiId);
                            bookingId++;
                        } else {
                            System.out.println("NO taxi is free for your request time");
                        }
                        break;

                    case 2:
                        displayBookings(bookings, bookingId);
                        break;

                    case 3:
                        displayTaxiDetails(taxis, bookings, bookingId);
                        break;

                    case 4:
                        return;
                    default:
                        System.out.println("Invalid Option!");
                        ;
                }
            }
        }
    }

    public static int createBooking(Booking[] bookings, int bookingId, Taxi[] taxis, Scanner in) {
        System.out.println("Enter customer ID: ");
        int customerId = in.nextInt();
        System.out.print("Enter Pickup Point (A-F): ");
        char pickUpPoint = in.next().toUpperCase().charAt(0);
        System.out.print("Enter Drop Point (A-F): ");
        char dropPoint = in.next().toUpperCase().charAt(0);
        System.out.print("Enter Pickup Time (in hours): ");
        int pickUpTime = in.nextInt();

        Booking newBooking = new Booking(bookingId, customerId, pickUpTime, pickUpPoint, dropPoint);
        int assignedTaxiId = newBooking.findAvailabeTaxi(taxis);

        if (assignedTaxiId != -1) {
            taxis[assignedTaxiId].assignBooking(newBooking);
            bookings[bookingId] = newBooking;
        }

        return assignedTaxiId;
    }

    public static void displayBookings(Booking[] bookings, int bookingId) {
        System.out.println("BookingID   CustomerID   TaxiNo   PickUp   Drop   PickUpTime   DropTime   Earnings");
        for (int i = 0; i < bookingId; i++) {
            bookings[i].display();
        }
    }

    public static void displayTaxiDetails(Taxi[] taxis, Booking[] bookings, int bookingId) {
        for (int i = 0; i < taxis.length; i++) {
            taxis[i].displayDetails(bookings, bookingId, i);
        }
    }
}
