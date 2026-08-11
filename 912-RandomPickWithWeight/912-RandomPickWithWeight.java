// Last updated: 8/11/2026, 5:51:33 PM
import java.util.*;

class Solution {

    int[] prefix;
    Random rand = new Random();

    public Solution(int[] w) {
        prefix = new int[w.length];
        prefix[0] = w[0];

        for (int i = 1; i < w.length; i++) {
            prefix[i] = prefix[i - 1] + w[i];
        }
    }

    public int pickIndex() {
        int target = rand.nextInt(prefix[prefix.length - 1]) + 1;

        int i = 0;
        while (prefix[i] < target) {
            i++;
        }

        return i;
    }
}