package UniqueNumbers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main {
    public static ArrayList<Integer> generateRandomNumbers() {
        ArrayList<Integer> randomNumbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            randomNumbers.add(random.nextInt(5,11));
        }

        return randomNumbers;
    }
    public static Set<Integer> getUniqueNumbers(ArrayList<Integer> list) {
        //        for (int i = 0; i < 100; i++) {
//            uniqueNumbers.add(list.get(i));
//        }
        return new HashSet<>(list);

    }

    public static void main(String[] args) {

        ArrayList<Integer> numbers = generateRandomNumbers();

        System.out.println("Random Numbers:");
        System.out.println(numbers);

        Set<Integer> uniqueNumbers = getUniqueNumbers(numbers);

        System.out.println("\nUnique Numbers:");
        System.out.println(uniqueNumbers);

    }
}
