package Tasks;

import java.util.Scanner;

public class StringUtil {
    public String util(String a, String b) {
        return a.concat(" " + b);

    }

    public String util(String a, int b) {
        return a.toUpperCase();
    }

    public String util(String a) {

        // saat
        String result = "";

        char[] charArray = a.toCharArray();
        for (int i = charArray.length - 1; i >= 0; i--) {
          result =  result.concat(String.valueOf(charArray[i]));
        }
        return result;

    }
}
