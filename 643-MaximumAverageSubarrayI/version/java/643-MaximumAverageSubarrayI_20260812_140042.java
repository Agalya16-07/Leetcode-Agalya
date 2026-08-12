// Last updated: 8/12/2026, 2:00:42 PM
1class Solution {
2    public double findMaxAverage(int[] nums, int k) {
3         int sum = 0;
4        int left = 0;
5        double maxSum = Integer.MIN_VALUE;
6        
7
8        for(int right = 0; right < nums.length; right++)
9        {
10            sum = sum + nums[right];
11
12            if((right - left + 1) == k)
13            {
14                maxSum = Math.max(maxSum, sum);
15                sum = sum - nums[left];
16                left++;
17            }
18          
19        }
20        double maxAvg = maxSum/k;
21        return maxAvg;
22
23    }
24}