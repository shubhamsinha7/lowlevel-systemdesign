package moviebookingsystem;

import moviebookingsystem.booking.Booking;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

public class MovieBookingSystem {
    private static MovieBookingSystem instance;
    private final List<Movie> movieList;
    private final List<Theater> theaterList;
    private final Map<String, Show> showMap;
    private final Map<String, Booking> seatMap;
    private static final String BOOKING_ID_PREFIX="BKG";
    private static final AtomicLong bookingCounter = new AtomicLong(0);

    public MovieBookingSystem() {
        this.movieList = new ArrayList<>();
        this.theaterList = new ArrayList<>();
        this.showMap = new ConcurrentHashMap<>();
        this.seatMap = new ConcurrentHashMap<>();
    }
    //double locking to get instance singleton
    public static MovieBookingSystem getInstance(){
        if(instance==null){
            synchronized (MovieBookingSystem.class){
                if(instance==null){
                    instance = new MovieBookingSystem();
                }
            }
        }
        return instance;
    }

    public List<Movie> getMovieList() {
        return movieList;
    }

    public List<Theater> getTheaterList() {
        return theaterList;
    }

    public Map<String, Show> getShowMap() {
        return showMap;
    }

    public Map<String, Booking> getSeatMap() {
        return seatMap;
    }
    public void addMovie(Movie movie){
        movieList.add(movie);
    }
    public void addTheater(Theater theater){
        theaterList.add(theater);
    }
    public void addShow(Show show){
        showMap.put(show.getShowId(),show);
    }
}
