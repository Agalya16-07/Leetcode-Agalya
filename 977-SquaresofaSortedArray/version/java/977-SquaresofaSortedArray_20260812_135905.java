// Last updated: 8/12/2026, 1:59:05 PM
1class Solution {
2    public int[] sortedSquares(int[] nums) {
3        int[] res = new int[nums.length];
4        int left = 0;
5        int right = nums.length - 1;
6
7        for (int i = nums.length - 1; i >= 0; i--) {
8            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
9                res[i] = nums[left] * nums[left];
10                left++;
11            } else {
12                res[i] = nums[right] * nums[right];
13                right--;
14            }
15        }
16        return res;        
17
18    }
19}