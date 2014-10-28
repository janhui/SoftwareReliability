package bookings;

public class SeatReservationDemo {

    public static void main(String[] args) throws ReservationException {
    
       // Reserve every Seat.
        SeatReservationManager manager1 = new SeatReservationManager();
        for (char row = Seat.MIN_ROW; row <= Seat.MAX_ROW; row++) {
            for (int number = Seat.MIN_NUMBER; number <= Seat.MAX_NUMBER; number++) {
                manager1.reserve(new Seat(row, number), new Customer());
            }
        }
        
        // Unreserve every Seat.
        for (char row = Seat.MIN_ROW; row <= Seat.MAX_ROW; row++) {
            for (int number = Seat.MIN_NUMBER; number <= Seat.MAX_NUMBER; number++) {
                manager1.unreserve(new Seat(row, number));
            }
        }
            
        // reserveNextFree and printing.
        SeatReservationManager manager2 = new SeatReservationManager();
        int totalSeats = (Seat.MAX_ROW - Seat.MIN_ROW + 1) * (Seat.MAX_NUMBER - Seat.MIN_NUMBER + 1);
        for (int i = 0; i < totalSeats; i++) {
            manager2.reserveNextFree(new Customer());
        }
        System.out.println(manager2);
        
        // Exception handling.
        SeatReservationManager manager3 = new SeatReservationManager();
        manager3.reserve(new Seat('A', 1), new Customer());
        
        try {
            manager3.reserve(new Seat('A', 1), new Customer());
        } catch (ReservationException e) {}
        
        try {
            manager3.unreserve(new Seat('A', 2));
        } catch (ReservationException e) {}
        
    }
    
    
}
