// Last updated: 8/11/2026, 5:47:45 PM
class Solution {
    public int minimumPushes(String word) {
        int ans = 0;

        for (int i = 0; i < word.length(); i++) {
            ans += (i / 8) + 1;
        }

        return ans;
    }
}