// Last updated: 8/11/2026, 5:52:17 PM

class Solution {
    public int deleteAndEarn(int[] nums) {
        int maxNum = 0;

        for (int num : nums) {
            maxNum = Math.max(maxNum, num);
        }

        int[] points = new int[maxNum + 1];

        for (int num : nums) {
            points[num] += num;
        }

        int prev2 = 0; // dp[i-2]
        int prev1 = points[0]; // dp[i-1]

        for (int i = 1; i <= maxNum; i++) {
            int curr = Math.max(prev1, prev2 + points[i]);
            prev2 = prev1;
            prev1 = curr;
        }

        return prev1;
    }
}