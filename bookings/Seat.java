package bookings;

public class Seat {
    
    /*@ 
      invariant row >= MIN_ROW;
      invariant row <= MAX_ROW;
      invariant number >= MIN_NUMBER;
      invariant number <= MAX_NUMBER;
    @*/
    
    public static final char MIN_ROW = 'A';
    public static final char MAX_ROW = 'G';
    public static final int MIN_NUMBER = 1;
    public static final int MAX_NUMBER = 20;

    private final char row;
    private final int number;
    
    /*@ 
      requires row >= MIN_ROW;
      requires row <= MAX_ROW;
      requires number >= MIN_NUMBER;
      requires number <= MAX_NUMBER;
    @*/
    public Seat(char row, int number) {
        this.row = row;
        this.number = number;
    }

    /*@ 
      ensures \result >= MIN_ROW;
      ensures \result <= MAX_ROW;
    @*/
    public final char getRow() {
        return row;
    }

    /*@ 
      ensures \result >= MIN_NUMBER;
      ensures \result <= MAX_NUMBER;
    @*/
    public final int getNumber() {
        return number;
    }

}
