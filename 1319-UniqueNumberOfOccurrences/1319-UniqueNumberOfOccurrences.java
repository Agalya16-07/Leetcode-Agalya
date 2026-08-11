// Last updated: 8/11/2026, 5:50:18 PM
import java.util.*;
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        HashSet<Integer> set = new HashSet<>();
        for (int freq : map.values()) {
            set.add(freq);
        }
        return map.size() == set.size();
    }
}