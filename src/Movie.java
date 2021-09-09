

public class Movie {
    private String name;
    private int year;
    private String description;
    private Director director;
    private Cast cast;

    public Movie(Director director) {
        this.director = director;
    }

    public Movie(Cast cast) {
        this.cast = cast;
    }

    public Cast getCast() {
        return cast;
    }

    public void setCast(Cast cast) {
        this.cast = cast;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public Movie(String name, int year, String description) {
        this.name = name;
        this.year = year;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return year;
    }

    public void setAge(int age) {
        this.year = age;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
