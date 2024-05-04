package Enums;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();


        Pattern pattern = Pattern.compile("\\bS\\w*\\b");


        Matcher matcher = pattern.matcher(sentence);

        // Iterate through the matches and print them
        System.out.println("Words starting with 'S':");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
