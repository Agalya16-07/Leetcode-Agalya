// Last updated: 8/11/2026, 5:47:18 PM
class Solution {
    public long weightedSum(int[] parent, int[] nums) {
        int n = parent.length,h=1;
        int[] d = new int[n];
        d[0]=1;
        for(int i=1; i<n; i++){
            int x=i,cnt=0;
            while(x!=-1 && d[x]==0){
                cnt++;
                x=parent[x];
            }
            int base=x==-1?0:d[x];
            x=i;
            while(d[x]==0){
                d[x]=base+cnt--;
                x=parent[x];
            }
            h=Math.max(h,d[i]);
        }
        long ans=0;
        for(int i=0; i<n; i++){
            ans+=(long)nums[i]*(h-d[i]+1);
        }
        return ans;
    }
}