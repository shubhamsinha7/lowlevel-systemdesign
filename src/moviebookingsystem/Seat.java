package moviebookingsystem;

public class Seat {
    private int id;
    private int row;
    private int col;
    private double price;
    private SeatType seatType;

    public Seat(int id, int row, int col, double price, SeatType seatType) {
        this.id = id;
        this.row = row;
        this.col = col;
        this.price = price;
        this.seatType = seatType;
    }

    public int getId() {
        return id;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public double getPrice() {
        return price;
    }

    public SeatType getSeatType() {
        return seatType;
    }
}
