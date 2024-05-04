package Letters;

import java.time.chrono.MinguoEra;
import java.util.LinkedList;

public class Alphabet {
    public LinkedList<Character> lowercaseLetters(){
        LinkedList<Character> letters1 = new LinkedList<>();

        for (char i = 'a'; i <= 'z'; i++) {
            letters1.add(i);

        }
        return letters1;
    }

    public LinkedList<Character> uppercaseLetters(){
        LinkedList<Character> letters1 = new LinkedList<>();

        for (char i = 'A'; i <= 'Z'; i++) {
            letters1.add(i);

        }
        return letters1;
    }
    public LinkedList<String> mergeLists(LinkedList<Character> a, LinkedList<Character> b){
        LinkedList<String> list = new LinkedList<>();
        for (int i = 0; i < a.size(); i++) {
            list.add(String.valueOf(a.get(i)) + b.get(i));

        }
        return list;


    }

    public static void main(String[] args) {
        Alphabet alphabet = new Alphabet();
        LinkedList<Character> lowercaseLetter = alphabet.lowercaseLetters();
        LinkedList<Character> uppercaseLetters = alphabet.uppercaseLetters();

        LinkedList<String> mergedLetters = alphabet.mergeLists(lowercaseLetter,uppercaseLetters);

        System.out.println("Merged List of English Letters:");
        for (String letter : mergedLetters) {
            System.out.print(letter + ", ");
        }
    }

}
