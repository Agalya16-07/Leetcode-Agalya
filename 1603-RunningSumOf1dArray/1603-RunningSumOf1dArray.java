// Last updated: 8/11/2026, 5:49:49 PM
class Solution {
    public int[] runningSum(int[] nums) {
    int n =nums.length;
    for(int i = 1; i < nums.length; i++) {
        nums[i] = nums[i-1] + nums[i];
    } 
    return nums; 
    }
}
