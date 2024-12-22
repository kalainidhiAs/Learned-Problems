package zoho.ROUND3.Railway_TicketBooking_System;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Coach {
    String type;
    static final int totalSeats = 5;
    static final int maxWaitingList = 2;
    int bookedSeats = 0;
    int waitingList = 0;

    List<Pasanger> passengers = new ArrayList<>();

    public Coach(String type) {
        this.type = type;
    }

    public boolean bookTickets(Pasanger passenger) {
        if (bookedSeats < totalSeats) {
            bookedSeats++;
            passenger.seatNumber = bookedSeats;
            passengers.add(passenger);
            System.out.println("Booked seat " + passenger.seatNumber + " for " + passenger.name);
            return true;
        } else if (waitingList < maxWaitingList) {
            waitingList++;
            passengers.add(passenger);
            System.out.println("Added to waiting list for " + passenger.name);
            return true;
        } else {
            System.out.println("No more seats or waiting list available in " + type + " coach.");
            return false;
        }
    }

    public void cancelTicket(int seatNumber) {
        Iterator<Pasanger> iterator = passengers.iterator();
        while (iterator.hasNext()) {
            Pasanger passenger = iterator.next();
            if (passenger.seatNumber == seatNumber && passenger.seatNumber != -1) {
                bookedSeats--;
                iterator.remove();
                System.out.println("Ticket cancelled for seat " + seatNumber);

                if (waitingList > 0) {
                    waitingList--;
                    Pasanger waitingListPassenger = passengers.get(bookedSeats);
                    waitingListPassenger.seatNumber = seatNumber;
                    bookedSeats++;
                    System.out.println("Booked waiting list passenger: " + waitingListPassenger.name);
                }
                return;
            }
        }
        System.out.println("Passenger not found or already cancelled.");
    }

    public void displayStatus() {
        System.out.println(type + " coach: ");
        System.out.println("Booked Seats: " + bookedSeats + "/" + totalSeats);
        System.out.println("Waiting List: " + waitingList + "/" + maxWaitingList);
    }
}
