package SystemDesign.moviebookingsystem;

import SystemDesign.moviebookingsystem.seat.Seat;

import java.time.LocalDateTime;
import java.util.Map;

public class Show {
    private final String showId;
    private final Movie movie;
    private final LocalDateTime startTime;
    private final LocalDateTime endTime;
    private final Map<String, Seat> seats;
    private final Theater theater;

    public Show(String showId, Movie movie, LocalDateTime startTime, LocalDateTime endTime, Map<String, Seat> seats,Theater theater) {
        this.showId = showId;
        this.movie = movie;
        this.startTime = startTime;
        this.endTime = endTime;
        this.seats = seats;
        this.theater=theater;
    }

    public String getShowId() {
        return showId;
    }

    public Movie getMovie() {
        return movie;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public Map<String, Seat> getSeats() {
        return seats;
    }

    public Theater getTheater() {
        return theater;
    }
}
