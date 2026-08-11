// Last updated: 8/11/2026, 5:49:39 PM
class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {

        int[] first = new int[26];

        // Initialize with -1 (character not seen yet)
        for (int i = 0; i < 26; i++) {
            first[i] = -1;
        }

        int max = -1;

        for (int i = 0; i < s.length(); i++) {

            int index = s.charAt(i) - 'a';

            if (first[index] == -1) {
                // Store first occurrence
                first[index] = i;
            } else {
                // Calculate distance excluding the two equal characters
                max = Math.max(max, i - first[index] - 1);
            }
        }

        return max;
    }
}