// Last updated: 8/11/2026, 5:51:30 PM
class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean in = true;
        boolean d = true;
        for(int i=1; i<nums.length; i++){
            if(nums[i]>nums[i-1])
            d=false;
            if(nums[i]<nums[i-1])
            in=false;
        }
        return d || in;
    }
}