package zoho.ROUND3.TaxiBookingSystem;

/*
 * There are n number of taxi's. For simplicity, assume 4. But it should work for any
number of taxi's.
-The are 6
-All the points are in a straight line, and each point is 15kms away from the
adjacent points.
-It takes 60 mins to travel from one point to another
-Each taxi charges Rs. 100 minimum for the first 5 kilometers and Rs. 10 for the
subsequent kilometers.
-For simplicity, time can be entered as absolute time. Eg: 9hrs, 15hrs etc.
-All taxi's are initially stationed at A.
-When a customer books a Taxi, a free taxi at that point is allocated
-If no free taxi is available at that point, a free taxi at the nearest point is
allocated.
-If two taxi's are free at the same point, one with lower earning is allocated
-Note that the taxi only charges the customer from the pickup point to the drop
point. Not the distance it travels from an adjacent point to pickup the customer.
-If no taxi is free at that time, booking is rejected
 */
public class Booking {
    private int bookingId;
    private int customerId;
    private int pickUpTime;
    private char pickUpPoint;
    private char dropPoint;
    private int earnings;
    private int taxiId;

    public Booking(int bookingId, int customerId, int pickUpTime, char pickUpPoint, char dropPoint) {
        this.bookingId = bookingId;
        this.customerId = customerId;
        this.pickUpTime = pickUpTime;
        this.pickUpPoint = pickUpPoint;
        this.dropPoint = dropPoint;
        calculateEarnings();
    }

    private void calculateEarnings() {
        int distance = Math.abs(pickUpPoint - dropPoint) * 15;
        this.earnings = 100 + (distance > 5 ? (distance - 5) * 10 : 0);
    }

    public int CalculateDropTime() {
        return pickUpTime + (Math.abs(pickUpPoint - dropPoint));
    }

    public char getDropPoint() {
        return dropPoint;
    }

    public int getEarnings() {
        return earnings;
    }

    public int getTaxiId() {
        return taxiId;
    }

    public int findAvailabeTaxi(Taxi[] taxis) {
        int bestTaxiId = -1;
        int minDistance = Integer.MAX_VALUE;

        for (int i = 0; i < taxis.length; i++) {
            if (taxis[i].isAvailable(pickUpTime)) {
                int distance = Math.abs(taxis[i].getCurrentPosition() - pickUpPoint);
                if (distance < minDistance
                        || (distance == minDistance && taxis[i].getEarnings() < taxis[bestTaxiId].getEarnings())) {
                    minDistance = distance;
                    bestTaxiId = i;
                }
            }
        }

        if (bestTaxiId != -1) {
            taxiId = bestTaxiId;
        }
        return bestTaxiId;
    }

    public void display() {
        System.out.format("%-10d%-12d%-10d%-10s%-10s%-12d%-12d%-10d\n",
                bookingId, customerId, taxiId + 1, pickUpPoint, dropPoint, pickUpTime, CalculateDropTime(), earnings);
    }
}
