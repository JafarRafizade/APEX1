package StreamsLambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.OptionalDouble;

public class Main {

    public static void main(String[] args) {

        CheckPositive checkPositive = a -> a > 0;
        System.out.println(checkPositive.check(-3));
        System.out.println("---------------------------------");


        double[] doubles = {1.3, 3.4, 4.5, 5.7};
        Arrays.stream(doubles)
                .mapToLong(d -> Math.round(d))
                .forEach(System.out::println);

        System.out.println("--------------------------------------");


        List<String> strings = Arrays.asList("apple", "pear", "bee", "orange", "horse");

        strings.stream()
                .filter(s -> s.length() < 5)
                .forEach(System.out::println);
        System.out.println("--------------------------------");


        int[] nums = {1,2,3,4,5};
        Arrays.stream(nums).skip(2)
                .forEach(System.out::println);
        System.out.println("--------------------------------------");

        List<String> words = Arrays.asList("apple", "banana", "kiwi", "orange", "grape");
        OptionalDouble averageLength = words.stream()
                .mapToInt(String::length)
                .average();
        System.out.println(averageLength);

        System.out.println("--------------------------------");









    }
}
