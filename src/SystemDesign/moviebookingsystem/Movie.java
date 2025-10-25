package SystemDesign.moviebookingsystem;

public class Movie {
    private int id;
    private String name;
    private int duration;
    private String language;

    public Movie(int id, String name, int duration) {
        this.id = id;
        this.name = name;
        this.duration = duration;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }
}
