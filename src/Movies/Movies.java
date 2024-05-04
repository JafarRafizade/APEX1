package Movies;

import java.util.*;
import java.util.stream.Collectors;

public class Movies {
    public static void main(String[] args) {
        List<Movie> movies = Arrays.asList(
                new Movie("The Shawshank Redemption", "Drama"),
                new Movie("The Godfather", "Crime"),
                new Movie("The Dark Knight", "Action"),
                new Movie("Pulp Fiction", "Crime"),
                new Movie("Schindler's List", "Biography"),
                new Movie("Forrest Gump", "Drama"),
                new Movie("The Lord of the Rings", "Fantasy"),
                new Movie("Inception", "Action"),
                new Movie("The Matrix", "Action"),
                new Movie("Fight Club", "Drama")
        );
//        System.out.println("These are action movies");
//        movies.stream()
//                .filter(s -> s.genre.equals("Action"))
//                .sorted(Comparator.comparing(Movie::getTitle))
//                .forEach(System.out::println);
//
//        System.out.println("-----------------------------------");
//
//        System.out.println("These are drama movies");
//        movies.stream()
//                .filter(s -> s.genre.equals("Drama"))
//                .sorted(Comparator.comparing(Movie::getTitle))
//                .forEach(System.out::println);
//
//        System.out.println("-----------------------------------");
//
//        System.out.println("These are fantasy movies");
//        movies.stream()
//                .filter(s -> s.genre.equals("Fantasy"))
//                .sorted(Comparator.comparing(Movie::getTitle))
//                .forEach(System.out::println);
//
//        System.out.println("-----------------------------------");
//
//        System.out.println("These are crime movies");
//        movies.stream()
//                .filter(s -> s.genre.equals("Crime"))
//                .sorted(Comparator.comparing(Movie::getTitle))
//                .forEach(System.out::println);
//
//        System.out.println("-----------------------------------");
//
//        System.out.println("These are biography movies");
//        movies.stream()
//                .filter(s -> s.genre.equals("Biography"))
//                .sorted(Comparator.comparing(Movie::getTitle))
//                .forEach(System.out::println);
//
//        System.out.println("-----------------------------------");
        Map<String, String> uniqueGenres = movies.stream()
                .collect(Collectors.toMap(
                        Movie::getGenre,
                        Movie::getTitle,
        (existing, replacement) -> existing

                ));


        TreeMap<String, String> sortedGenres = new TreeMap<>(uniqueGenres);

        System.out.println(sortedGenres);










    }

}
