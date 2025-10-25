package SystemDesign.moviebookingsystem.booking;

import SystemDesign.moviebookingsystem.Show;
import SystemDesign.moviebookingsystem.User;
import SystemDesign.moviebookingsystem.seat.Seat;

import java.util.List;

public class Booking {
    private final String bookingId;
    private final User user;
    private final Show show;
    private final List<Seat> seats;
    private final double totalPrice;
    private final BookingStatus bookingStatus;

    public Booking(String bookingId, User user, Show show, List<Seat> seats, double totalPrice, BookingStatus bookingStatus) {
        this.bookingId = bookingId;
        this.user = user;
        this.show = show;
        this.seats = seats;
        this.totalPrice = totalPrice;
        this.bookingStatus = bookingStatus;
    }

    public String getBookingId() {
        return bookingId;
    }

    public User getUser() {
        return user;
    }

    public Show getShow() {
        return show;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public BookingStatus getBookingStatus() {
        return bookingStatus;
    }
}
