// Last updated: 8/11/2026, 5:51:23 PM
import java.util.*;

class Solution {

    public boolean hasGroupsSizeX(int[] deck) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int card : deck) {
            map.put(card, map.getOrDefault(card, 0) + 1);
        }

        int gcd = 0;

        for (int count : map.values()) {
            gcd = findGCD(gcd, count);
        }

        return gcd > 1;
    }

    private int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}