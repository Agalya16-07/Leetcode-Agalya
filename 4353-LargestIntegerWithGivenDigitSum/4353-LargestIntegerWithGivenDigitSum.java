// Last updated: 8/11/2026, 5:47:23 PM
class Solution {
    public int largestInteger(int n, int s) {
        if(s>9*n)return -1;
        int ans=0;
        for(int i=0; i<n; i++){
            int d = Math.min(9,s);
            ans=ans*10+d;
            s-=d;
        }
       
     
        return ans;
    }
}