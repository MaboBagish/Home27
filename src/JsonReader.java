import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

public class JsonReader {
    private static Gson gson = new Gson();

    public static List<Movie> getMovies() throws IOException {
        try (Reader reader = new FileReader("movies.json")) {
            Type itemsMapType = new TypeToken<Map<String, List<Movie>>>() {
            }.getType();
            Map<String, List<Movie>> movies = gson.fromJson(reader, itemsMapType);
            return movies.get("movies");
        }
    }


        public static void writeMovies (List<Movie> movies) throws IOException{
            try (Writer writer = new FileWriter ("movies.json")){
                String json = gson.toJson (movies);
                writer.write (json);
                System.out.println (json );

            }
        }
}


