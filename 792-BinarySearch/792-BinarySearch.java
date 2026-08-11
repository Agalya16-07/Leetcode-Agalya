// Last updated: 8/11/2026, 5:52:05 PM
class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = nums.length-1;
        int foundIndex = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]==target){
                  return  mid;
            }else if(target<nums[mid]){
                   high = mid-1;
            }else{
                   low = mid+1;
            }
        }
        return -1;     
    }
}