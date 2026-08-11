// Last updated: 8/11/2026, 5:49:20 PM
class Solution {
    public String truncateSentence(String s, int k) {

        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == ' ') {
                count++;

                if (count == k) {
                    return s.substring(0, i);
                }
            }
        }

        return s;
    }
}