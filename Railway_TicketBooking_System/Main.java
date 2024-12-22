package zoho.ROUND3.Railway_TicketBooking_System;

import java.util.HashMap;
import java.util.Map;

/*
Here we have to develop a simple railway ticket booking application.
Develop a Railway Reservation Application contains
1. AC coach
2. Non AC coach
3. Seater
each should contain 60 seats and 10 waiting list max allowed rest request should be
cancelled.
you should have
1. Ticket Booking
2. Ticket Cancellation
3. Status Checking
Here they asked us to create a
The modules were:
1. Booking
2. Availability checking
3. Cancellation
4. Prepare chart
"Railway reservation system" and gave us 4 modules.
We were asked to create the modules for representing each data first and to
continue with the implementation phase.
 */
public class Main {
    Map<String, Coach> coaches = new HashMap<>();

    public Main() {
        coaches.put("AC", new Coach("AC"));
        coaches.put("Non-AC", new Coach("Non-AC"));
        coaches.put("Seater", new Coach("Seater"));
    }

    public void bookTicket(String name, int age, String coachType) {
        Pasanger pasanger = new Pasanger(name, age, coachType);
        Coach coach = coaches.get(coachType);
        if (coach != null) {
            coach.bookTickets(pasanger);
        } else {
            System.out.println("Invalid coach");
        }
    }

    public void cancelTicket(int seatNumber, String coachType) {
        Coach coach = coaches.get(coachType);
        if (coach != null) {
            coach.cancelTicket(seatNumber);
        } else {
            System.out.println("Invalid coach type.");
        }
    }

    public void checkAvailability(String coachType) {
        Coach coach = coaches.get(coachType);
        if (coach != null) {
            coach.displayStatus();
        } else {
            System.out.println("Invalid coach");
        }
    }

    public void prepareChart() {
        for (Coach coach : coaches.values()) {
            coach.displayStatus();
        }
    }

    public static void main(String args[]) {
        Main main = new Main();
        main.bookTicket("Kalai", 18, "AC");
        main.bookTicket("nidhi", 12, "Non-AC");
        main.bookTicket("saranys", 13, "AC");
        main.bookTicket("chithra", 16, "AC");
        main.bookTicket("vasantha", 90, "AC");
        main.bookTicket("saravanan", 80, "AC");
        main.bookTicket("anandhan", 95, "AC");

        main.cancelTicket(3, "AC");
        // main.checkAvailability("AC");

        main.prepareChart();
    }
}
