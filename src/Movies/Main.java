package Movies;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> input = Arrays.asList("rattlesnake", "elephant", "orange", "strawberry", "pineapple", "watermelon", "kiwi");


        List<String> i = input.stream()
                .filter(s -> s.length() >= 10)
                .sorted()
                .collect(Collectors.toList());


        System.out.println(i);
    }
}
