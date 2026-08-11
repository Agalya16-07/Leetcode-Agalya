// Last updated: 8/11/2026, 5:47:33 PM
class Solution {
    public int minAdjacentSwaps(int[] nums, int a, int b) {
        long swaps=0;
        long mod=1_000_000_007;
        long count0=0;
        long count1=0;
        long count2=0;
        for(int num:nums){
            if(num<a){
                swaps=(swaps+count1+count2)%mod;
                count0++;
            }else if(num<=b){
                swaps=(swaps+count2)%mod;
                count1++;
            }else{
                count2++;
            }
        }
        return (int) swaps;
        
    }
}