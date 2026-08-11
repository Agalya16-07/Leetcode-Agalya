// Last updated: 8/11/2026, 5:47:19 PM
class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int n = nums[nums.length/2];
        int c=0;
        for(int num:nums){
            if(num==n)
                c++;
        }
        return c==1;
    }
}