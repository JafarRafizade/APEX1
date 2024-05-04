package Compare;

import java.util.ArrayList;
import java.util.Collections;

public class Strings implements Comparable<Strings> {
    String word;

    public Strings(String word) {
        this.word = word;
    }

    @Override
    public int compareTo(Strings o) {
        return this.word.compareTo(o.word);
    }

    @Override
    public String toString() {
        return "Strings{" +
                "word='" + word + '\'' +
                '}';
    }

    public static void main(String[] args) {
        ArrayList<Strings> words = new ArrayList<>();
        words.add(new Strings("erfcsd"));
        words.add(new Strings("dacfv"));
        words.add(new Strings("vfrev"));
        Collections.sort(words);
        System.out.println(words);

    }
}
