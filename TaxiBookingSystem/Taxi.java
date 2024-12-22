package zoho.ROUND3.TaxiBookingSystem;

public class Taxi {
    private char currentPosition = 'A';
    private int earnings = 0;
    private int availableTime = 0;

    public boolean isAvailable(int requestTime) {
        return availableTime <= requestTime;
    }

    public char getCurrentPosition() {
        return currentPosition;
    }

    public int getEarnings() {
        return earnings;
    }

    public void assignBooking(Booking booking) {
        this.availableTime = booking.CalculateDropTime();
        this.currentPosition = booking.getDropPoint();
        this.earnings += booking.getEarnings();
    }

    public void displayDetails(Booking[] bookings, int bookingId, int taxiId) {
        System.out.println("Taxi No: " + (taxiId + 1));
        System.out.println("Total Earnings: Rs. " + earnings);
        System.out.println("Booking Details:");
        System.out.println("BookingID   CustomerID   PickUp   Drop   PickUpTime   DropTime   Earnings");

        for (int i = 0; i < bookingId; i++) {
            if (bookings[i].getTaxiId() == taxiId) {
                bookings[i].display();
            }
        }
    }
}
