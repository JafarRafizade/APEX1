package methodTask1;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static int romanToInt(String s) {
        Map<Character, Integer> romans = new HashMap<>();
        romans.put('I', 1);
        romans.put('V', 5);
        romans.put('X', 10);
        romans.put('L', 50);
        romans.put('C', 100);
        romans.put('D', 500);
        romans.put('M', 1000);

        char[] h = s.toCharArray();
        int num = 0;
        for (int i = 0; i < h.length; i++) {
            num += romans.get(h[i]);
        }

        for (int i = 0; i < h.length; i++) {
            if (i + 1 != h.length && h[i] == 'I' && (h[i + 1] == 'V' || h[i + 1] == 'X')) {
                num -= 2;
            } else if (i + 1 != h.length && h[i] == 'X' && (h[i + 1] == 'L' || h[i + 1] == 'C')) {
                num -= 20;

            } else if (i + 1 != h.length && h[i] == 'C' && (h[i + 1] == 'D' || h[i + 1] == 'M')) {
                num -= 200;

            }
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));

    }
}
