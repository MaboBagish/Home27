import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Movie> movies = JsonReader.getMovies();

        Iterator var2 = movies.iterator ();

       while (var2.hasNext()) {
           Movie m = (Movie)var2.next ();
            System.out.println(m.getName());
        }

    }

}