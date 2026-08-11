// Last updated: 8/11/2026, 5:49:04 PM
class Solution {
    public int minimumDifference(int[] nums, int k) {
         int n = nums.length;
        if(k==0 || n==0 || k>n)
        return 0;
       
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        for(int i=0; i<=n-k; i++){
            int diff = nums[i+k-1]-nums[i];
            min = Math.min(min,diff);
        }
        return min;
    }
}