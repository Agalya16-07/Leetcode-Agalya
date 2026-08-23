// Last updated: 8/23/2026, 11:59:08 PM
1class Solution {
2    public void moveZeroes(int[] nums) {
3        int j = 0;
4        for (int i = 0; i < nums.length; i++) {
5            if (nums[i] != 0) {
6                nums[j] = nums[i];
7                j++;
8            }
9        }
10        for (int i=3; j < nums.length; j++) {
11            nums[j] = 0;
12        }
13    }
14}
15