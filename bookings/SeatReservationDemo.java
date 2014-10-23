package bookings;

public class SeatReservationDemo {

    public static void main(String[] args) throws ReservationException {
        SeatReservationManager manager = new SeatReservationManager();
        manager.reserve(new Seat('A', 1), new Customer());
        manager.reserve(new Seat('C', 2), new Customer());
        manager.reserve(new Seat('E', 13), new Customer());
        manager.reserve(new Seat('D', 4), new Customer());
        manager.reserve(new Seat('B', 19), new Customer());
        manager.reserve(new Seat('F', 17), new Customer());
        manager.reserve(new Seat('G', 20), new Customer());
            
    }
    
    
}
